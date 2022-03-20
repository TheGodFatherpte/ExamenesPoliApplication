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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.logging.Logger;

/**
 *
 * @author andre
 */
@WebServlet(name = "ServletRegistroClientes", urlPatterns = {"/ServletRegistroClientes"})
public class ServletRegistroClientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String modulo = "./registrarse.jsp";
        String Mensaje = "";
        EntidadClientes cliente = new EntidadClientes();
        NegocioCliente negcliente = new NegocioCliente();
        request.setAttribute("Mensaje", null);
        request.setAttribute("datos", null);
        request.setAttribute("target", null);

        int id_usu = 0;
        try {
            id_usu=Integer.parseInt(request.getParameter("TXTid_usu"));
        } catch (NumberFormatException e) {          
        }
        String contraseña_usu=request.getParameter("password");
        String primer_nombre_usu=request.getParameter("TXTprimer_nombre_usu");
        String segundo_nombre_usu=request.getParameter("TXTsegundo_nombre_usu");
        String primer_apellido_usu=request.getParameter("TXTprimer_apellido_usu");
        String segundo_apellido_usu=request.getParameter("TXTsegundo_apellido_usu");
        String correo_usu=request.getParameter("TXTcorreo_usu");          
        int telefono_usu = 0;
                try {
            telefono_usu=Integer.parseInt(request.getParameter("TXTtelefono_usu"));
        } catch (NumberFormatException e) {          
        }
        String id_car_usu=request.getParameter("TXTid_car_usu");
        
        System.out.println("Servlet"+id_usu+" "+contraseña_usu+" "+primer_nombre_usu+" "+segundo_nombre_usu+" "+primer_apellido_usu+" "
        +segundo_apellido_usu+" "+correo_usu+" "+telefono_usu+" "+id_car_usu);
        
         
        //codigo para el boton
        if ("Registrar".equals(request.getParameter("action"))) {
            try {
                negcliente.crearCliente(new EntidadClientes(id_usu, contraseña_usu, primer_nombre_usu, segundo_nombre_usu, primer_apellido_usu, segundo_apellido_usu, correo_usu, telefono_usu, id_car_usu));
            } catch (Exception e) {
                Mensaje+="error";
            }
            request.setAttribute("Mensaje", Mensaje);   
        }
        //Codigo para ejecutar los botones en servlet
        request.getRequestDispatcher(modulo).forward(request, response);
        return null;
        

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
