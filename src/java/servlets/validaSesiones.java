/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 *
 * @author adria
 */
@WebServlet(name = "validaSesiones", urlPatterns = {"/validaSesiones"})
public class validaSesiones extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
            String claveSesion = (String) sesion.getAttribute("claveSesion");
        
        if (claveSesion.equals("lalitoesquivias")) {
            PrintWriter out = response.getWriter();
            out.println("<center style='margin-top: 200px; font-size: 20px; font-family: Verdana;'>");
            out.println("<h3>Muy bien</h3>");
            out.println("<br>");
            out.println("<h3>Bienvenido</h3>");
            out.println("<br>");
            out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
            out.println("<br>");
            out.println(claveSesion);
            out.println("<br>");
            out.println("Fernando Adrian Jimenez Esquivias");
            out.println("</center>");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<center style='margin-top: 200px; font-size: 20px; font-family: Verdana;'>");
            out.println("<h3>tienes un error</h3>");
            out.println("<br>");
            out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
            out.println("<br>");
            out.println(claveSesion);
            out.println("<br>");
            out.println("Fernando Adrian Jimenez Esquivias");
            out.println("</center>");
        }
    }

}
