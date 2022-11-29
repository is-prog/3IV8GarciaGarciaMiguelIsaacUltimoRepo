/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

/**
 *
 * @author edgar
 */
import java.io.Serializable;

public class UsuarioPrincipal implements Serializable {

    private String user;
    private String nombre;
    private String pass;
    private String genero;
    private String alcaldia;

    public UsuarioPrincipal() {
    }

    public UsuarioPrincipal(String user, String nombre, String pass, String genero, String alcaldia) {
        this.user = user;
        this.nombre = nombre;
        this.pass = pass;
        this.genero = genero;
        this.alcaldia = alcaldia;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    
}
