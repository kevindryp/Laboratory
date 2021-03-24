/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBEAN.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int valor1 = Integer.parseInt(request.getParameter("valor1"));
            int valor2 = Integer.parseInt(request.getParameter("valor2"));
            String operador = request.getParameter("operador");
            String expresion= valor1 + " " + operador + " " + valor2;
            double resultado = 0;
            /* TODO output your page here. You may use following sample code. */
            switch(operador){
                case "+":
                    resultado = calcBean.sumar(valor1, valor2);
                    break;
                case "-":
                    resultado = calcBean.resta(valor1, valor2);
                    break;
                case "*":
                    resultado = calcBean.multiplicacion(valor1, valor2);
                    break;
                case "/":
                    resultado = calcBean.division(valor1, valor2);
                    break;
                case "%":
                    resultado = calcBean.modulo(valor1, valor2);
                    break;
                case "^":
                    resultado = calcBean.potencia(valor1, valor2);
                    break;   
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600&display=swap\" rel=\"stylesheet\">"); 
            out.println("<link href=\"static/styles.css\" rel=\"stylesheet\" />");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"contenedor\">");
            out.println("<div class=\"calculadora\">");
            out.println("<div class=\"display\">");
            out.println("<div id=fila1>" + expresion + "</div>");
            out.println("<div id=fila2>" + resultado +"</div>");
            out.println("</div>");
            out.println("<button class=\"estilo_boton\">7</button>");
            out.println("<button class=\"estilo_boton\">8</button>");
            out.println("<button class=\"estilo_boton\">9</button>");
            out.println("<button class=\"estilo_boton\">/</button>");
            out.println("<button class=\"estilo_boton\">4</button>");
            out.println("<button class=\"estilo_boton\">5</button>");
            out.println("<button class=\"estilo_boton\">6</button>");
            out.println("<button class=\"estilo_boton\">*</button>");
            out.println("<button class=\"estilo_boton\">1</button>");
            out.println("<button class=\"estilo_boton\">2</button>");
            out.println("<button class=\"estilo_boton\">3</button>");
            out.println("<button class=\"estilo_boton\">-</button>");
            out.println("<button class=\"estilo_boton\">0</button>");
            out.println("<button class=\"estilo_boton\">.</button>");
            out.println("<button class=\"estilo_boton\">=</button>");
            out.println("<button class=\"estilo_boton\">+</button>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
