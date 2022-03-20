
package Conexion;

import DAOS.Daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    
    private final String usuario="root";
    private final String password="";
    private final String host="localhost";
    private final String nombreBD="ts_examenes_poli";
    
    private Connection con=null;
    
    public Connection getCon()
    {
        getConexionMYSQL();
        return con;
    }
    
    public void setCon(Connection con)
    {
        this.con=con;
    }
    
    public Connection getConexionMYSQL()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String servidor="jdbc:mysql://"+host+"/"+nombreBD;
            con=DriverManager.getConnection(servidor, usuario, password);
            return con;
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            return con;
        }
    }
    
    public void cerrarBD() throws SQLException
    {
        this.con.close();
    }
    
    public static void main(String param[]){

        ConexionBD conecta= new ConexionBD();
        try{
            ResultSet resultado= conecta.getCon().prepareStatement("SELECT * FROM tbl_carrera").executeQuery();
            
            if(resultado.next())
            {
                System.out.println(
                        "Identificacion de la carrera: "+resultado.getString(1)+"\n"
                       +"Nombre de la carrera:         "+resultado.getString(2)+"\n");
                while(resultado.next()){
                System.out.println(
                        "Identificacion de la carrera: "+resultado.getString(1)+"\n"
                       +"Nombre de la carrera:         "+resultado.getString(2)+"\n");                          
            }
            }else {
                    System.out.println("No hay datos en la tabla");
                    }            
            } catch (SQLException e){
                System.out.println("Excepcion "+e.getMessage());
            }finally
        {
            try{
                conecta.cerrarBD();
            }catch (SQLException e){
                System.out.println("Excepcion: " +e.getMessage());
            }
        }
        
//    Daos misdatos = new Daos();
//    int id_usu = 1037111111;
//    String contraseña_usu = "123";
//    String primer_nombre_usu = "juan";
//    String segundo_nombre_usu = "oscar";
//    String primer_apellido_usu = "gomez";
//    String segundo_apellido_usu = "urueña";
//    String correo_usu = "juan_gomez1234@elpoli.edu.co";
//    int telefono_usu = 3786354;
//    String id_car_usu = "carrera3";
//    
//    String resultado;
//    
//    resultado = misdatos.Registrar((Connection) conecta, 
//            id_usu, contraseña_usu, primer_nombre_usu, 
//            segundo_nombre_usu, primer_apellido_usu, 
//            segundo_apellido_usu, correo_usu, 
//            telefono_usu, id_car_usu);
    }
           
}
