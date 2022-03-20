
package DAOS;

import Conexion.ConexionBD;
import Entidades.EntidadExamenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Daos {
    ConexionBD con =new ConexionBD();
    
    /**
     * Verifica el ingreso del usuario
     * @param con
     * @param correo_usu
     * @param contraseña_usu
     * @return 
     */
  
    public boolean IniciarSesion(Connection con, String correo_usu, String contraseña_usu)
    {
        System.out.println("datos: "+correo_usu + " pass: "+contraseña_usu);
        try {
            PreparedStatement consulta=con.prepareStatement("SELECT * FROM `tbl_usuario` WHERE `correo_usu`=? AND `contraseña_usu`=?");
            consulta.setString(1, correo_usu);
            consulta.setString(2, contraseña_usu);
            ResultSet resultado=consulta.executeQuery();
            if(!resultado.next()){
                System.out.println("false1");
                return false;
            }else{
                System.out.println("true");
                return true;
            }          
        } catch (SQLException e) {
            System.out.println("false2");
            return false;
        }finally{
            try{
                con.close();
            }catch (SQLException ex){
                
            }
        }
    }
    /**
     * Registra una fila usuario
     * @param con
     * @param id_usu
     * @param contraseña_usu
     * @param primer_nombre_usu
     * @param segundo_nombre_usu
     * @param primer_apellido_usu
     * @param segundo_apellido_usu
     * @param correo_usu
     * @param telefono_usu
     * @param id_car_usu
     * @return 
     */
    public String Registrar (Connection con,int id_usu,String contraseña_usu,String primer_nombre_usu,
                                                  String segundo_nombre_usu, String primer_apellido_usu,
                                                  String segundo_apellido_usu, String correo_usu,
                                                  int telefono_usu, String id_car_usu)
    {
        String respuesta=null;
        String insert="INSERT INTO `tbl_usuario`(`id_usu`, `contraseña_usu`, `primer_nombre_usu`, "
                + "`segundo_nombre_usu`, `primer_apellido_usu`, `segundo_apellido_usu`, `correo_usu`, "
                + "`telefono_usu`, `id_car_usu`) VALUES (?,?,?,?,?,?,?,?,?)";
        System.out.println("daos"+id_usu+" "+contraseña_usu+" "+primer_nombre_usu+" "+segundo_nombre_usu+" "+primer_apellido_usu+" "
        +segundo_apellido_usu+" "+correo_usu+" "+telefono_usu+" "+id_car_usu);
        try {
//SABER SI ESTA FUNCIONANDO, PERO ESTO SE VAAAAAA
            System.out.println("int id_usu:             "+id_usu+"\n"
                               +"contraseña_usu:        "+contraseña_usu+"\n"
                               +"primer_nombre_usu:     "+primer_nombre_usu+"\n"
                               +"segundo_nombre_usu:    "+segundo_nombre_usu+"\n"
                               +"primer_apellido_usu:   "+primer_apellido_usu+"\n"
                               +"segundo_apellido_usu:  "+segundo_apellido_usu+"\n"
                               +"correo_usu:            "+correo_usu+"\n"
                               +"telefono_usu:          "+telefono_usu+"\n"
                               +"id_car_usu:            "+id_car_usu+"\n"
                              );
            PreparedStatement insertar= con.prepareStatement(insert);
            insertar.setString(1, String.valueOf(id_usu));
            insertar.setString(2, contraseña_usu);
            insertar.setString(3, primer_nombre_usu);
            insertar.setString(4, segundo_nombre_usu);
            insertar.setString(5, primer_apellido_usu);
            insertar.setString(6, segundo_apellido_usu);
            insertar.setString(7, correo_usu);
            insertar.setString(8, String.valueOf(telefono_usu));
            insertar.setString(9, id_car_usu);
            int result=insertar.executeUpdate();
            respuesta="sus datos registrados correctamente"+result;
            System.out.println(respuesta);
            
        } catch (Exception ex) {
            respuesta="<b><font Color=RED> CLIENTE:"+id_usu+" "+"FAIL INSERT"+ ex.getMessage()+"</font></b>";
        }finally
        {
            try {
                con.close();
            } catch (Exception ex) {
                
            }
        }
        return respuesta;
          
    }
    
        public String IngresarExamen (Connection con,String id_exa,String nombre_exa,String Fecha_exa,
                                                  String tipo_exa, int id_usu_exa,
                                                  String id_pro_exa)
    {
        String respuesta=null;
        String insert="INSERT INTO `tbl_examen`(`id_exa`, `nombre_exa`, `Fecha_exa`, `tipo_exa`, `id_usu_exa`, `id_pro_exa`) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement insertar= con.prepareStatement(insert);
            insertar.setString(1, id_exa);
            insertar.setString(2, nombre_exa);
            insertar.setString(3, Fecha_exa);
            insertar.setString(4, tipo_exa);
            insertar.setString(5, String.valueOf(id_usu_exa));
            insertar.setString(6, id_pro_exa);
            int result=insertar.executeUpdate();
            respuesta="Examen ingresado correctamente"+result;
            System.out.println(respuesta);
            
        } catch (Exception ex) {
            respuesta="<b><font Color=RED> CLIENTE:"+id_exa+" "+"FAIL INSERT"+ ex.getMessage()+"</font></b>";
        }finally
        {
            try {
                con.close();
            } catch (Exception ex) {
                
            }
        }
        return respuesta;
          
    }
        
        
     public static EntidadExamenes buscarExamen (Connection con, String tipo_exa, String id_pro_exa)
    {
        EntidadExamenes buscarExamenes = new EntidadExamenes();
        buscarExamenes.setTipo_exa("");                          //********************************
        buscarExamenes.setId_pro_exa("");
        System.out.println(tipo_exa);
        String Consulta="select tipo_exa, nombre_exa, Fecha_exa, tbl_profesor.nombre_pro "
                + "from tbl_examen "
                + "INNER JOIN tbl_profesor "
                + "on tipo_exa=? "
                +"and id_pro_exa=?";         //*************************
        
        try {
            PreparedStatement ConsultarExamen =con.prepareStatement(Consulta);
            ConsultarExamen.setString(1, tipo_exa);
            ConsultarExamen.setString(2, id_pro_exa);      
            ResultSet resultado=ConsultarExamen.executeQuery();
            System.out.println(resultado);
            while (resultado.next()) 
            {        
                buscarExamenes.setId_exa(resultado.getString(1));
                buscarExamenes.setNombre_exa(resultado.getString(2));
                buscarExamenes.setFecha_exa(resultado.getString(3));
                buscarExamenes.setTipo_exa(resultado.getString(4));
                buscarExamenes.setId_usu_exa(resultado.getInt(5));
                buscarExamenes.setId_pro_exa(resultado.getString(6));             
            }//while
            
        } catch (Exception ex) {
            System.out.println("" + ex.getCause());
            
        }finally
        {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println("" + ex.getCause());
            }
        }
        return buscarExamenes;
    }

    
}
