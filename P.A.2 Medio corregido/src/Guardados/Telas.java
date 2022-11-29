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
public class Telas implements Serializable{
    
    private String TipoTela;
    private int ID;
    
    public Telas(){
        
    }

    public Telas(String TipoTela, int ID) {
        this.TipoTela = TipoTela;
        this.ID = ID;
    }

    public String getTipoTela() {
        return TipoTela;
    }

    public void setTipoTela(String TipoTela) {
        this.TipoTela = TipoTela;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
