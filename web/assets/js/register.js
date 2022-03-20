function cambiarCampo() {
    var nombre = document.getElementById("name").value.substr(0,1);
    let apellido = document.getElementById("apellidos").value;
    let documento = document.getElementById("documento").value;
    let digitosDocumento= documento.substr(documento.length - 3);
    var usuario= nombre+apellido+digitosDocumento;
    document.getElementById("usuario").value = usuario;
  }

  function comprobarClave(){
    clave1 = document.getElementById("clave").value;
    clave2 = document.getElementById("confirmar_clave").value;
  
    if (clave1 != clave2)
       alert("Las dos claves no son iguales...revisa")
    else
       alert("Correcto. Claves iguales")
  }
  
  //Calcular fecha automatica del sistema 
  $( document ).ready(function() {

    var now = new Date();

    var day = ("0" + now.getDate()).slice(-2);
    var month = ("0" + (now.getMonth() + 1)).slice(-2);

    var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
    $("#fecha").val(today);
});
