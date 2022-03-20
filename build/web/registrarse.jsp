<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.List"%>
<%@page  import="Entidades.EntidadClientes"%>
<%@page  import="Negocio.NegocioCliente"%>
   
<% String mensajeError=(String) request.getAttribute("Mensaje");

String dni = "0";
dni = request.getParameter("TXTid_usu");
int id_usu = 0;
//String id_usu = request.getParameter("TXTid_usu");


String contraseña_usu=request.getParameter("TXTcontraseña_usu");
String primer_nombre_usu=request.getParameter("TXTprimer_nombre_usu");
String segundo_nombre_usu=request.getParameter("TXTsegundo_nombre_usu");
String primer_apellido_usu=request.getParameter("TXTprimer_apellido_usu");
String segundo_apellido_usu=request.getParameter("TXTsegundo_apellido_usu"); 
String correo_usu=request.getParameter("TXTcorreo_usu");

String tel = "0";
tel = request.getParameter("TXTtelefono_usu");
int telefono_usu = 0;
//String telefono_usu = request.getParameter("TXTtelefono_usu");

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


%>


<!DOCTYPE html>
<head>
<html>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Registrarse</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"
        type="text/css" />
    <link rel="stylesheet" type="text/css" href="assets/css/Subrayado.css"

    <!-- CSS -->
  <link href="assets/css/style.css" rel="stylesheet">

    
    <title>Registrarse</title>

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

<header id="header" class="fixed-top ">
    <div class="container d-flex align-items-center">
      <!-- Uncomment below if you prefer to use an image logo -->
      <a href="index.html" class="logo mr-auto"><img src="assets/img/polijic/politecnico-jaime-isaza-cadavid_4716001832.jpg" alt="" class="img-fluid"></a>

      


    </div>
  </header><!-- End Header -->


<body>
    <form id="formulario2" name="validar" class="" accept-charset="UTF-8"
          autocomplete="off" method="post" novalidate action="./ServletRegistroClientes">
        
    <div class="modal-dialog text-center">
        <div class="col-sm-8 main-section">
            <div class="modal-content">
                <div class="col-12 user-img">
                    <img src="assets/img/user.png" />
                </div>
                <class class="col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch">
                    <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                      <div class="row">
                         
                        
                          
                          <div class="form-group col-md-3">                         
                          <select  aria-placeholder="Tipo documento" class="" name="tipos">
                            <option value="">CC</option> 
                            <option value="" selected>TI</option>
                            <option value="">CE</option>
                          </select>
                           </div>
                          <br>
                          
                           <div class="form-group">             
                            <input type="text" placeholder="Documento" name="TXTid_usu" oninput="cambiarCampo()" required pattern="[0-9]{9,12}" class="" id="documento" data-rule="minlen:4" title="Solo numeros. TamaÃ±o entre 10 y 12 caracteres."/>
                          </div>
                          <br>
                          <br>
                          
                         <div class="form-group ">
                          <input type="password" placeholder="Contraseña" name="password" required pattern="[A-Za-z0-9]{8,20}" class="form-control" id="clave" data-rule="minlen:4" title="tamaÃ±o mÃ­nimo de 8 dÃ­gitos y tenga letras y por lo menos, dos nÃºmeros"/>
                          </div>
                          <br>
                          <br>
                          
                          
                        <div class="form-group ">  
                          <input type="text"  placeholder="Primer Nombre" 
                                 name="TXTprimer_nombre_usu" required pattern="[A-Za-z]{4,40}" 
                                 class="form-control" id="name" data-rule="minlen:4" 
                                 title="Solo Letras. TamaÃ±o mÃ­nimo: 4." />
                        </div>
                          <br>
                          <br>
                          
                          <div class="form-group ">  
                          <input type="text"  placeholder="Segundo Nombre" 
                                 name="TXTsegundo_nombre_usu" required pattern="[A-Za-z]{4,40}" 
                                 class="form-control" id="name" data-rule="minlen:4" 
                                 title="Solo Letras. TamaÃ±o mÃ­nimo: 4." />
                        </div>
                          <br>
                          <br>
                          
 
                          
                        <div class="form-group ">                        
                          <input type="text" placeholder="Primer Apellido" name="TXTprimer_apellido_usu" required pattern="[A-Za-z]{4,40}" class="form-control" id="apellidos" data-rule="minlen:4" title="Solo Letras. TamaÃ±o mÃ­nimo: 4."/>
                        </div>
                          <br>
                          <br>
                          
                        <div class="form-group ">                        
                          <input type="text" placeholder="Segundo Apellido" name="TXTsegundo_apellido_usu" required pattern="[A-Za-z]{4,40}" class="form-control" id="apellidos" data-rule="minlen:4" title="Solo Letras. TamaÃ±o mÃ­nimo: 4."/>
                        </div>
                          <br>
                          <br>
                          
                          <div class="form-group ">        
                          <input placeholder="Correo Estudiantil" type="email" class="form-control" name="TXTcorreo_usu" required pattern="{4,40}" id="email" data-rule="email" title="No encontramos un @ el campo." />
                           </div>
                          <br>
                          <br>
                          
                          <div class="form-group ">  
                          <input type="text"  placeholder="Telefono" 
                                 name="TXTtelefono_usu" 
                                 class="form-control"  data-rule="minlen:4" 
                                  />
                        </div>
                          <br>
                          <br>
         
                          <div class="form-group">                         
                          <select  aria-placeholder="Tipo documento" class="form-control" name="TXTid_car_usu">
                            <option value="carrera1">Ingenieria Informatica</option> 
                            <option value="carrera2" selected>Ingenieria Civil</option>
                            <option value="carrera3">Ingenieria Industrial</option>
                          </select>
                           </div>
                          <div>
                              <br>
                          
                        <button type="submit" id="login-submit" class="btn btn-success" class="fas fa-sign-in-alt" name="action" value="Registrar">Registrar </button>
                      </div>
         
                          <div>
                              <button type="submit"  class="btn btn-success"  class="fas fa-sign-in-alt" name="action" value="atras"><a class="dd" href="Login.jsp">Iniciar Sesión</a></button>
                      </div>
                      
                      
                      
                    
                    </form>
                  </class>
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
     <script src="assets/js/register.js"></script>
</body>
</html>