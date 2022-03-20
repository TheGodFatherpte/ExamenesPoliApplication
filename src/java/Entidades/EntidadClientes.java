
package Entidades;

public class EntidadClientes {
    
    private int id_usu;
    private String contraseña_usu;
    private String primer_nombre_usu;
    private String segundo_nombre_usu; 
    private String primer_apellido_usu;
    private String segundo_apellido_usu; 
    private String correo_usu;
    private int telefono_usu;
    private String id_car_usu;

    public EntidadClientes() {
    }

    
    public EntidadClientes(int id_usu, String contraseña_usu, String primer_nombre_usu, String segundo_nombre_usu, String primer_apellido_usu, String segundo_apellido_usu, String correo_usu, int telefono_usu, String id_car_usu) {
        this.id_usu = id_usu;
        this.contraseña_usu = contraseña_usu;
        this.primer_nombre_usu = primer_nombre_usu;
        this.segundo_nombre_usu = segundo_nombre_usu;
        this.primer_apellido_usu = primer_apellido_usu;
        this.segundo_apellido_usu = segundo_apellido_usu;
        this.correo_usu = correo_usu;
        this.telefono_usu = telefono_usu;
        this.id_car_usu = id_car_usu;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public String getContraseña_usu() {
        return contraseña_usu;
    }

    public void setContraseña_usu(String contraseña_usu) {
        this.contraseña_usu = contraseña_usu;
    }

    public String getPrimer_nombre_usu() {
        return primer_nombre_usu;
    }

    public void setPrimer_nombre_usu(String primer_nombre_usu) {
        this.primer_nombre_usu = primer_nombre_usu;
    }

    public String getSegundo_nombre_usu() {
        return segundo_nombre_usu;
    }

    public void setSegundo_nombre_usu(String segundo_nombre_usu) {
        this.segundo_nombre_usu = segundo_nombre_usu;
    }

    public String getPrimer_apellido_usu() {
        return primer_apellido_usu;
    }

    public void setPrimer_apellido_usu(String primer_apellido_usu) {
        this.primer_apellido_usu = primer_apellido_usu;
    }

    public String getSegundo_apellido_usu() {
        return segundo_apellido_usu;
    }

    public void setSegundo_apellido_usu(String segundo_apellido_usu) {
        this.segundo_apellido_usu = segundo_apellido_usu;
    }

    public String getCorreo_usu() {
        return correo_usu;
    }

    public void setCorreo_usu(String correo_usu) {
        this.correo_usu = correo_usu;
    }

    public int getTelefono_usu() {
        return telefono_usu;
    }

    public void setTelefono_usu(int telefono_usu) {
        this.telefono_usu = telefono_usu;
    }

    public String getId_car_usu() {
        return id_car_usu;
    }

    public void setId_car_usu(String id_car_usu) {
        this.id_car_usu = id_car_usu;
    }
       
    
}
