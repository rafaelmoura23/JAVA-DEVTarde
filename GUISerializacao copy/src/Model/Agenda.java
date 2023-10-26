package Model;

import java.io.Serializable;

public class Agenda implements Serializable{
    //atributos
    private String data;
    private String hora;
    private String usuario;
    private String description;

    //construtor
    public Agenda(String data, String hora, String usuario, String description) {
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.description = description;
    }

    //getters and setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
