package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Entidades.EntidadClientes;
import Negocio.NegocioCliente;

public final class indexlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
 HttpSession sesionOK=request.getSession(); 
   sesionOK.invalidate();
      out.write("\r\n");
      out.write("   \r\n");
 String mensajeError=(String) request.getAttribute("mensajeError");
   String correo_usu=request.getParameter("correo_usu");
   String contraseña_usu=request.getParameter("password");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html  xmlns:th=\"http://www.thymeleaf.org\"></html>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Login</title>\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"modal-dialog text-center\">\r\n");
      out.write("        <div class=\"col-sm-8 main-section\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"col-12 user-img\">\r\n");
      out.write("                    <img src=\"assets/img/user.png\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <form  id=\"login-form\" class=\"col-12\" th:action=\"@{/login}\" method=\"get\">\r\n");
      out.write("                    <div class=\"form-group\" id=\"user-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Nombre de usuario\" name=\"username\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr>    \r\n");
      out.write("                    <div class=\"form-group\" id=\"contrasena-group\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"ContraseÃ±a\" name=\"password\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\" id=\"login-submit\" class=\"btn btn-success\"><i class=\"fas fa-sign-in-alt\"></i>  Ingresar </button>\r\n");
      out.write("                </form> \r\n");
      out.write("                <div class=\"col-12 forgot\">\r\n");
      out.write("                    <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\r\n");
      out.write("                    <label for=\"remember\"> <a href=\"#\">Recordar contraseÃ±a</a></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 forgot\">\r\n");
      out.write("                    <label for=\"remember\"> <a href=\"registrarse.html\">Â¿No tiene cuenta? RegÃ­strese gratis</a></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div  th:if=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"alert alert-danger\" role=\"alert\">\r\n");
      out.write("\t\t            Usuario y contraseÃ±a invalidos.\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div th:if=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.logout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"alert alert-success\" role=\"alert\">\r\n");
      out.write("\t\t            Usted ha sido desconectado.\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- registrarse -->\r\n");
      out.write("                \r\n");
      out.write("                <!-- final -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
      out.write("             <P>\r\n");
      out.write("        <div>");
if (mensajeError !=null){
      out.write("\r\n");
      out.write("            ");
      out.print(mensajeError);
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        </P>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
