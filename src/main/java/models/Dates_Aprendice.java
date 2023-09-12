package models;

public class Dates_Aprendice {
    private String ID;
    private String Nombre;
    private String Apellidos;
    private String Fecha_Nacimiento;
    private String Genero;
    private String Discapacidad;
    private String Telefono;
    private String Email_alternativo;
    private String Municipio;
    private String Centro;
    private String Programa;
    private String Date_INICIO_LECTIVA;
    private String Date_INICIO_PRODUCTIVA;
    private String Date_INICIO_CONTRATO;
    private String Date_FIN_CONTRATO;
    private String Ficha;

    public Dates_Aprendice(String ID, String nombre, String apellidos, String fecha_Nacimiento, String genero, String discapacidad, String telefono, String email_alternativo, String municipio, String centro, String programa, String date_INICIO_LECTIVA, String date_INICIO_PRODUCTIVA, String date_INICIO_CONTRATO, String date_FIN_CONTRATO, String ficha) {
        this.ID = ID;
        Nombre = nombre;
        Apellidos = apellidos;
        Fecha_Nacimiento = fecha_Nacimiento;
        Genero = genero;
        Discapacidad = discapacidad;
        Telefono = telefono;
        Email_alternativo = email_alternativo;
        Municipio = municipio;
        Centro = centro;
        Programa = programa;
        Date_INICIO_LECTIVA = date_INICIO_LECTIVA;
        Date_INICIO_PRODUCTIVA = date_INICIO_PRODUCTIVA;
        Date_INICIO_CONTRATO = date_INICIO_CONTRATO;
        Date_FIN_CONTRATO = date_FIN_CONTRATO;
        Ficha = ficha;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        Discapacidad = discapacidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail_alternativo() {
        return Email_alternativo;
    }

    public void setEmail_alternativo(String email_alternativo) {
        Email_alternativo = email_alternativo;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getCentro() {
        return Centro;
    }

    public void setCentro(String centro) {
        Centro = centro;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String programa) {
        Programa = programa;
    }

    public String getDate_INICIO_LECTIVA() {
        return Date_INICIO_LECTIVA;
    }

    public void setDate_INICIO_LECTIVA(String date_INICIO_LECTIVA) {
        Date_INICIO_LECTIVA = date_INICIO_LECTIVA;
    }

    public String getDate_INICIO_PRODUCTIVA() {
        return Date_INICIO_PRODUCTIVA;
    }

    public void setDate_INICIO_PRODUCTIVA(String date_INICIO_PRODUCTIVA) {
        Date_INICIO_PRODUCTIVA = date_INICIO_PRODUCTIVA;
    }

    public String getDate_INICIO_CONTRATO() {
        return Date_INICIO_CONTRATO;
    }

    public void setDate_INICIO_CONTRATO(String date_INICIO_CONTRATO) {
        Date_INICIO_CONTRATO = date_INICIO_CONTRATO;
    }

    public String getDate_FIN_CONTRATO() {
        return Date_FIN_CONTRATO;
    }

    public void setDate_FIN_CONTRATO(String date_FIN_CONTRATO) {
        Date_FIN_CONTRATO = date_FIN_CONTRATO;
    }

    public String getFicha() {
        return Ficha;
    }

    public void setFicha(String ficha) {
        Ficha = ficha;
    }
}
