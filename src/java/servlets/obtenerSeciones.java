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
@WebServlet(name = "obtenerSeciones", urlPatterns = {"/obtenerSeciones"})
public class obtenerSeciones extends HttpServlet {
    
    
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String name;
        String apelli;
        name = request.getParameter("nombre");
        apelli = request.getParameter("apellido");
        
        HttpSession secion = request.getSession();
        secion.setAttribute("claveSesion", name + apelli);
        String clave = (String) secion.getAttribute("claveSesion");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<center style='margin-top: 300px; font-size: 20px; font-family: Verdana;'>");
        out.println("<a href=\"validaSesiones\" > Valida tu sesion  </a>");
        out.println("<br>");
        out.println("ID de la secion " + secion.getId());
        out.println("<br>");
        out.println(clave);
        out.println("</center>");
    }

}
