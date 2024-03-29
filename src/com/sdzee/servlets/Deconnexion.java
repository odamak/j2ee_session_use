package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Deconnexion extends HttpServlet {
    public static final String URL_REDIRECTION = "http://www.siteduzero.com";
    public static final String VUE = "/connexion";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Récupération et destruction de la session en cours */
        HttpSession session = request.getSession();
        session.invalidate();

        /* Redirection vers le Site du Zéro ! */
//        response.sendRedirect( URL_REDIRECTION );
        response.sendRedirect( "/session/connexion" );
//        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}