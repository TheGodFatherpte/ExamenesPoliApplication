
package Entidades;


public class EntidadExamenes {
    
    String id_exa;
    String nombre_exa;
    String Fecha_exa;
    String tipo_exa;
    int id_usu_exa;
    String id_pro_exa;

    public EntidadExamenes() {
    }

    public EntidadExamenes(String id_exa, String nombre_exa, String Fecha_exa, String tipo_exa, int id_usu_exa, String id_pro_exa) {
        this.id_exa = id_exa;
        this.nombre_exa = nombre_exa;
        this.Fecha_exa = Fecha_exa;
        this.tipo_exa = tipo_exa;
        this.id_usu_exa = id_usu_exa;
        this.id_pro_exa = id_pro_exa;
    }

    public String getId_exa() {
        return id_exa;
    }

    public void setId_exa(String id_exa) {
        this.id_exa = id_exa;
    }

    public String getNombre_exa() {
        return nombre_exa;
    }

    public void setNombre_exa(String nombre_exa) {
        this.nombre_exa = nombre_exa;
    }

    public String getFecha_exa() {
        return Fecha_exa;
    }

    public void setFecha_exa(String Fecha_exa) {
        this.Fecha_exa = Fecha_exa;
    }

    public String getTipo_exa() {
        return tipo_exa;
    }

    public void setTipo_exa(String tipo_exa) {
        this.tipo_exa = tipo_exa;
    }

    public int getId_usu_exa() {
        return id_usu_exa;
    }

    public void setId_usu_exa(int id_usu_exa) {
        this.id_usu_exa = id_usu_exa;
    }

    public String getId_pro_exa() {
        return id_pro_exa;
    }

    public void setId_pro_exa(String id_pro_exa) {
        this.id_pro_exa = id_pro_exa;
    }
    
    
    
}
