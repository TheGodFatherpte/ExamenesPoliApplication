
package Negocio;

import Conexion.ConexionBD;
import DAOS.Daos;
import Entidades.EntidadClientes;
import Entidades.EntidadExamenes;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class NegocioCliente {
    
    public Daos datos;

    public NegocioCliente() {
        datos = new Daos();
    }

    public boolean ValidarCliente(String correo_usu, String contraseña_usu)
    {
        String mensajeError="";
        if(correo_usu==null||"".equals(correo_usu))
        {
            mensajeError=mensajeError+"Usuario Invalido";                   
        }
        if(contraseña_usu==null||"".equals(contraseña_usu))
        {
            mensajeError=mensajeError+"Usuario Invalido";                   
        }
        //JOptionPane.showMessageDialog(null, mensajeError);
        ConexionBD CON = new ConexionBD();
        Connection conect=CON.getCon();
        boolean resultado;
        resultado=datos.IniciarSesion(conect, correo_usu, contraseña_usu);
        System.out.println(resultado+" neg");
        return resultado;
    }
    
    public void crearCliente (EntidadClientes objCliente) throws Exception
    {
        Connection con;
        con = new ConexionBD().getCon();
        String mensajeError = "";
         int id_usu = objCliente.getId_usu();
         String contraseña_usu = objCliente.getContraseña_usu();
         String primer_nombre_usu = objCliente.getPrimer_nombre_usu();
         String segundo_nombre_usu = objCliente.getSegundo_nombre_usu(); 
         String primer_apellido_usu = objCliente.getPrimer_apellido_usu();
         String segundo_apellido_usu = objCliente.getSegundo_apellido_usu(); 
         String correo_usu = objCliente.getCorreo_usu();
         int telefono_usu = objCliente.getTelefono_usu();
         String id_car_usu = objCliente.getId_car_usu();
         System.out.println("negocio"+id_usu+" "+contraseña_usu+" "+primer_nombre_usu+" "+segundo_nombre_usu+" "+primer_apellido_usu+" "
        +segundo_apellido_usu+" "+correo_usu+" "+telefono_usu+" "+id_car_usu);
         if(id_usu==0){
             mensajeError=mensajeError+"Documento Invalido";
         }
         if ( contraseña_usu.isEmpty()||"".equals(contraseña_usu)||contraseña_usu==null){
             mensajeError=mensajeError+"contraseña invalido";
         }
         if ( primer_nombre_usu.isEmpty()||"".equals(primer_nombre_usu)||primer_nombre_usu==null){
             mensajeError=mensajeError+"primer nombre invalido";
         }
         if ( primer_apellido_usu.isEmpty()||"".equals(primer_apellido_usu)||primer_apellido_usu==null){
             mensajeError=mensajeError+"primer apellido invalido";
         }
         if ( correo_usu.isEmpty()||"".equals(correo_usu)||correo_usu==null){
             mensajeError=mensajeError+"correo invalido";
         }
         if(telefono_usu==0){
             mensajeError=mensajeError+"telfono Invalido";
         }
         if ( id_car_usu.isEmpty()||"".equals(id_car_usu)||id_car_usu==null){
             mensajeError=mensajeError+"id carrera invalida";
         }
         if (!"".equals(mensajeError)){
             throw new Exception(mensajeError);
         }else
         {          
         mensajeError = datos.Registrar(con, id_usu, contraseña_usu, primer_nombre_usu, segundo_nombre_usu,  
                 primer_apellido_usu, segundo_apellido_usu, correo_usu, telefono_usu, id_car_usu);   
         }
         if (!"".equals(mensajeError)){
             throw new Exception(mensajeError);
         }
    } 
    
    public EntidadExamenes consultarExamen (String tipo_exa, String id_pro_exa)
    {
        Connection CON = new ConexionBD().getCon();
        EntidadExamenes consultaExamen = datos.buscarExamen(CON, tipo_exa, id_pro_exa);
        return consultaExamen;
               
        
    }
}
