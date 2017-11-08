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
@WebServlet(name = "Calcular", urlPatterns = {"/Calcular"})
public class Calcular extends HttpServlet {

   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1;
        String num2;
        String total1;
        float num11, num22, total;
        
        num1 = request.getParameter("num1");
        num2 = request.getParameter("num2");
        
        num11 = Integer.parseInt(num1);
        num22 = Integer.parseInt(num2);
        
        total = num11 + num22;
        total1 = String.valueOf(total);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("numero", total1);
        String suma1 = (String) sesion.getAttribute("numero");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<center style='margin-top: 300px; font-size: 20px; font-family: Verdana;'>");
        out.println("Este es tu resultado");
        out.println("<br>");
        out.println("ID de la suma " + sesion.getId());
        out.println("<br>");
        out.println("Resultado de la suma: " + suma1);
        out.println("<br>");
        out.println("<a href=\"/SecionesE/calculadora.html\">Regresa a la calculadora</a>");
        out.println("</center>");
        
    }

   

}
