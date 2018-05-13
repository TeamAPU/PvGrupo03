/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Ma Ry Youkai
 */
public class Ahorcado implements Serializable{
    
    
    private String palabra;    
    

   

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Ahorcado(String palabra) {
        this.palabra = palabra;
    }

   
    

    
    
    
    
    
}
