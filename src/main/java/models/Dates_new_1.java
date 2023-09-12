package models;

public class Dates_new_1 {
    private  String nombres;
    private  String apellidos;
    private  String correo;
    private  String correo_alternativo;
    private  String ID;
    private  String contrasena;
    private  String residencia;

    public Dates_new_1(String nombres, String apellidos, String correo, String correo_alternativo, String ID, String contrasena, String residencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.correo_alternativo = correo_alternativo;
        this.ID = ID;
        this.contrasena = contrasena;
        this.residencia = residencia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo_alternativo() {
        return correo_alternativo;
    }

    public void setCorreo_alternativo(String correo_alternativo) {
        this.correo_alternativo = correo_alternativo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}
