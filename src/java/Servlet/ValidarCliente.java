/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.EntidadClientes;
import Negocio.NegocioCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
public class ValidarCliente extends HttpServlet {

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
        PrintWriter out=response.getWriter();
        String s_correo_usu;
        String s_contraseña_usu;
        s_correo_usu=request.getParameter("correo_usu");
        s_contraseña_usu=request.getParameter("password");
        String mensaje="";
        NegocioCliente NegCliente = new NegocioCliente();
        EntidadClientes entCli = new EntidadClientes();
        request.setAttribute("mensaje", null);
        request.setAttribute("Cliente", null);
        request.setAttribute("target", null);
        
        if("Ingresar".equals(request.getParameter("action"))){
        try {
            if("".equals(s_correo_usu)||null==s_correo_usu){
                mensaje+="Ingrese correo"+" ";            
            }
            if("".equals(s_contraseña_usu)||null==s_contraseña_usu){
                mensaje+=" Ingrese contraseña"+" ";
            }
            if("".equals(mensaje)){
                boolean resultado=NegCliente.ValidarCliente(s_correo_usu, s_contraseña_usu);
                if(resultado!=true)
                {
                    mensaje="Datos Erroneos";
                    out.print(mensaje);
                    request.setAttribute("target", "./Login.jsp");
                }else
                {
                    request.getSession(true).setAttribute("Cliente", entCli);
//                    request.setAttribute("target", "./inicio.jsp");
                    request.getRequestDispatcher("./inicio.jsp").forward(request, response);
                }
            }
        }    catch (Exception e) {
            Logger.getLogger(ValidarCliente.class.getName())
                    .log(Level.SEVERE,null,e);
            if(!e.getMessage().isEmpty())
            {
                mensaje+="Datos erroneos, ingrese nuevamente datos";
            }
        }
    }
        request.setAttribute("mensajeError", mensaje);
        request.getRequestDispatcher("./Login.jsp").forward(request, response);
        
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
