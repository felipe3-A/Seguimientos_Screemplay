package models;

public class DatesfeorPQRS {
    private String email;
    private String affair;
    private String menssage;

    public DatesfeorPQRS(String email, String affair, String menssage) {
        this.email = email;
        this.affair = affair;
        this.menssage = menssage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }
}
