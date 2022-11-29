/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guardados;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Sedes implements Serializable{
    
    private int ID;
    private String direccion;
    
    public Sedes(){
        
    }
    public Sedes(String direccion, int ID) {
        this.direccion = direccion;
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
}
