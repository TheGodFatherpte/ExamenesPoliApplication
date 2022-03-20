package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Entidades.EntidadClientes;
import Negocio.NegocioCliente;

public final class registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
 String mensajeError=(String) request.getAttribute("mensajeError");

String dni = request.getParameter("TXTid_usu");
int id_usu= Integer.parseInt(dni);

String contraseña_usu=request.getParameter("TXTcontraseña_usu");
String primer_nombre_usu=request.getParameter("TXTprimer_nombre_usu");
String segundo_nombre_usu=request.getParameter("TXTsegundo_nombre_usu");
String primer_apellido_usu=request.getParameter("TXTprimer_apellido_usu");
String segundo_apellido_usu=request.getParameter("TXTsegundo_apellido_usu"); 
String correo_usu=request.getParameter("TXTcorreo_usu");

String tel = request.getParameter("TXTtelefono_usu");
int telefono_usu = Integer.parseInt(tel);

String id_car_usu=request.getParameter("TXTid_car_usu");

EntidadClientes entClien = request.getAttribute("datos")!=null ?
(EntidadClientes) request.getAttribute("datos"): null;

if (entClien!=null){
id_usu= entClien.getId_usu();
contraseña_usu= entClien.getContraseña_usu();
primer_nombre_usu= entClien.getPrimer_nombre_usu();
segundo_nombre_usu= entClien.getSegundo_nombre_usu();
primer_apellido_usu= entClien.getPrimer_apellido_usu();
segundo_apellido_usu= entClien.getSegundo_apellido_usu(); 
correo_usu= entClien.getCorreo_usu();
telefono_usu= entClien.getTelefono_usu();
id_car_usu= entClien.getId_car_usu();   
}



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<html>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>Registrarse</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("        type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <title>Registrarse</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons -->\r\n");
      out.write("  <link href=\"assets/img/polijic/faviconpoli.png\" rel=\"icon\">\r\n");
      out.write("  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("   <!-- Los iconos tipo Solid de Fontawesome-->\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/solid.css\">\r\n");
      out.write("   <script src=\"https://use.fontawesome.com/releases/v5.0.7/js/all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor CSS -->\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/icofont/icofont.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/venobox/venobox.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/owl.carousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- CSS -->\r\n");
      out.write("  <link href=\"assets/css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<header id=\"header\" class=\"fixed-top \">\r\n");
      out.write("    <div class=\"container d-flex align-items-center\">\r\n");
      out.write("      <!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("      <a href=\"index.html\" class=\"logo mr-auto\"><img src=\"assets/img/polijic/politecnico-jaime-isaza-cadavid_4716001832.jpg\" alt=\"\" class=\"img-fluid\"></a>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"modal-dialog text-center\">\r\n");
      out.write("        <div class=\"col-sm-8 main-section\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"col-12 user-img\">\r\n");
      out.write("                    <img src=\"assets/img/user.png\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <class class=\"col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch\">\r\n");
      out.write("                    <form action=\"forms/contact.php\" method=\"post\" role=\"form\" class=\"php-email-form\">\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                         \r\n");
      out.write("                        \r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"form-group col-md-3\">                         \r\n");
      out.write("                          <select  aria-placeholder=\"Tipo documento\" class=\"form-control\" name=\"tipos\">\r\n");
      out.write("                            <option value=\"\">CC</option> \r\n");
      out.write("                            <option value=\"\" selected>TI</option>\r\n");
      out.write("                            <option value=\"\">CE</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div class=\"form-group col-md-9 \">\r\n");
      out.write("                           \r\n");
      out.write("                            <input type=\"text\" placeholder=\"Documento\" name=\"TXTid_usu\" oninput=\"cambiarCampo()\" required pattern=\"[0-9]{9,12}\" class=\"form-control\" id=\"documento\" data-rule=\"minlen:4\" title=\"Solo numeros. TamaÃ±o entre 10 y 12 caracteres.\"/>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                         <div class=\"form-group \">\r\n");
      out.write("                          <input type=\"password\" placeholder=\"Contraseña\" name=\"TXTcontraseña_usu\" required pattern=\"[A-Za-z0-9]{8,20}\" class=\"form-control\" id=\"clave\" data-rule=\"minlen:4\" title=\"tamaÃ±o mÃ­nimo de 8 dÃ­gitos y tenga letras y por lo menos, dos nÃºmeros\"/>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"form-group \">  \r\n");
      out.write("                          <input type=\"text\"  placeholder=\"Primer Nombre\" \r\n");
      out.write("                                 name=\"TXTprimer_nombre_usu\" required pattern=\"[A-Za-z]{4,40}\" \r\n");
      out.write("                                 class=\"form-control\" id=\"name\" data-rule=\"minlen:4\" \r\n");
      out.write("                                 title=\"Solo Letras. TamaÃ±o mÃ­nimo: 4.\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"form-group \">  \r\n");
      out.write("                          <input type=\"text\"  placeholder=\"Segundo Nombre\" \r\n");
      out.write("                                 name=\"TXTsegundo_nombre_usu\" required pattern=\"[A-Za-z]{4,40}\" \r\n");
      out.write("                                 class=\"form-control\" id=\"name\" data-rule=\"minlen:4\" \r\n");
      out.write("                                 title=\"Solo Letras. TamaÃ±o mÃ­nimo: 4.\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write(" \r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"form-group \">                        \r\n");
      out.write("                          <input type=\"text\" placeholder=\"Primer Apellido\" name=\"TXTprimer_apellido_usu\" required pattern=\"[A-Za-z]{4,40}\" class=\"form-control\" id=\"apellidos\" data-rule=\"minlen:4\" title=\"Solo Letras. TamaÃ±o mÃ­nimo: 4.\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"form-group \">                        \r\n");
      out.write("                          <input type=\"text\" placeholder=\"Segundo Apellido\" name=\"TXTsegundo_apellido_usu\" required pattern=\"[A-Za-z]{4,40}\" class=\"form-control\" id=\"apellidos\" data-rule=\"minlen:4\" title=\"Solo Letras. TamaÃ±o mÃ­nimo: 4.\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"form-group \">        \r\n");
      out.write("                          <input placeholder=\"Correo Estudiantil\" type=\"email\" class=\"form-control\" name=\"TXTcorreo_usu\" required pattern=\"{4,40}\" id=\"email\" data-rule=\"email\" title=\"No encontramos un @ el campo.\" />\r\n");
      out.write("                           </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"form-group \">  \r\n");
      out.write("                          <input type=\"text\"  placeholder=\"Telefono\" \r\n");
      out.write("                                 name=\"TXTtelefono_usu\" \r\n");
      out.write("                                 class=\"form-control\"  data-rule=\"minlen:4\" \r\n");
      out.write("                                  />\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <br>\r\n");
      out.write("         \r\n");
      out.write("                          <div class=\"form-group\">                         \r\n");
      out.write("                          <select  aria-placeholder=\"Tipo documento\" class=\"form-control\" name=\"TXTid_car_usu\">\r\n");
      out.write("                            <option value=\"carrera1\">Ingenieria Informatica</option> \r\n");
      out.write("                            <option value=\"carrera2\" selected>Ingenieria Civil</option>\r\n");
      out.write("                            <option value=\"carrera3\">Ingenieria Industrial</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <hr>\r\n");
      out.write("                      <center>\r\n");
      out.write("                      <button type=\"submit\" id=\"login-submit\" class=\"btn btn-success\" class=\"fas fa-sign-in-alt\" name=\"action\" value=\"Registrar\">Registrar </button>\r\n");
      out.write("                    </center>\r\n");
      out.write("                    </form>\r\n");
      out.write("                  </class>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     <!-- Vendor JS Files -->\r\n");
      out.write("     <script src=\"assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/jquery.easing/jquery.easing.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/waypoints/jquery.waypoints.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/venobox/venobox.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/owl.carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("     <script src=\"assets/vendor/aos/aos.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     <script src=\"assets/js/login.js\"></script>\r\n");
      out.write("     <script src=\"assets/js/register.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
