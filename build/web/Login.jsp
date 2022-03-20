<%-- 
    Document   : Login
    Created on : 29/11/2020, 03:31:34 PM
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.List"%>
<%@page  import="Entidades.EntidadClientes"%>
<%@page  import="Negocio.NegocioCliente"%>

<% HttpSession sesionOK=request.getSession(); 
   sesionOK.invalidate();%>
   
<% String mensajeError=(String) request.getAttribute("mensajeError");
   String correo_usu=request.getParameter("correo_usu");
   String contraseña_usu=request.getParameter("password");
%>

<!DOCTYPE html>
<html>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
<head>
    <title>Login</title>

    <!-- Favicons -->
  <link href="assets/img/polijic/faviconpoli.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

   <!-- Los iconos tipo Solid de Fontawesome-->
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
   <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- CSS -->
  <link href="assets/css/index.css" rel="stylesheet">


</head>
<body>
    <form id="formulario1" name="validar" class="" accept-charset="UTF-8"
              autocomplete="off" method="post" novalidate action="./ValidarCliente">
        
    <div class="modal-dialog text-center">
        <div class="col-sm-8 main-section">
            <div class="modal-content">
                <div class="col-12 user-img">
                    <img src="assets/img/user.png" />
                </div>
                <form  id="login-form" class="col-12" th:action="@{/login}" method="get">
                    <div class="form-group" id="user-group">
                        <input type="text" class="form-control" placeholder="Correo Estudiantil" name="correo_usu"/>
                    </div>
                    <hr>    
                    <div class="form-group" id="contrasena-group">
                        <input type="password" class="form-control" placeholder="contraseña" name="password"/>
                    </div>
                    <br>
                    <center>
        <button type="submit" id="login-submit" class="btn btn-success" class="fas fa-sign-in-alt" name="action" value="Ingresar">Ingresar </button>
                    </center>
                </form> 
                <div class="col-12 forgot">
                    <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                    <label for="remember"> <a href="#">Recordar contraseña</a></label>
                </div>
                <div class="col-12 forgot">
                    <label for="remember"> <a href="registrarse.jsp">¿No tiene cuenta? Regístrese gratis</a></label>
                </div>
                <br>
                <br>
                    

                <!-- registrarse -->
                
                <!-- final -->
            </div>
        </div>
    </div>

     <!-- Vendor JS Files -->
     <script src="assets/vendor/jquery/jquery.min.js"></script>
     <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
     <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
     <script src="assets/vendor/php-email-form/validate.js"></script>
     <script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
     <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
     <script src="assets/vendor/venobox/venobox.min.js"></script>
     <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
     <script src="assets/vendor/aos/aos.js"></script>

     <script src="assets/js/login.js"></script>
    
</body>
    
</html>
