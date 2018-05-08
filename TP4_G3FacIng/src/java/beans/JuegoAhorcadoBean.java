/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import aplicacion.modelo.dominio.JuegoAhorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author carolina punto4 
 */
@ManagedBean
@RequestScoped
public class JuegoAhorcadoBean implements Serializable{
     private JuegoAhorcado juegoAhorcado;

    
    public JuegoAhorcadoBean() {
         juegoAhorcado = new JuegoAhorcado(); 
         
    }

    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }
    
    
    
}
