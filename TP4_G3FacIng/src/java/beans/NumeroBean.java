/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dominio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author David
 */
@ManagedBean
@RequestScoped
@ViewScoped
public class NumeroBean {
    private Numero numero;
    private List<Numero> numeros;
    private char operacion;

    public NumeroBean() {
        numeros= new ArrayList<>();
        numero = new Numero();
    }
    
    public void agregar(){
        numeros.add(numero);
        numero = new Numero();
    }
    public double resultado(){
        double resultado = 0;
        
        
        return resultado;
    }
    
    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
    public List<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }
    
    

}
