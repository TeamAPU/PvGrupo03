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
@ViewScoped
public class NumeroBean implements Serializable{
    private char operacion;
    private Numero numero;
    private List<Numero> numeros;
    public NumeroBean() {
        numeros = new ArrayList<>();
        numero = new Numero();
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    
    
    
    public void agregar(){
        numeros.add(numero);
        numero = new Numero();
    }
    public List<Numero> getNumeros() {
        return numeros;
    }

    public NumeroBean(List<Numero> numeros) {
        this.numeros = numeros;
    }
    
    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }
    
    
    public double resultado(){
        double resultado=0;
        Numero mayor;
        Numero menor;
        double suma=0;
        if(operacion=='M'){
           mayor = numeros.get(0);
           for(Numero a:numeros){
               if(mayor.getNumero() < a.getNumero()){
                   mayor = a;
               }
           }
           
           resultado = mayor.getNumero();
        }
        if(operacion=='N'){
            menor = numeros.get(0);
            for(Numero a:numeros){
               if(menor.getNumero() > a.getNumero()){
                   menor = a;
               }
           }
           
           resultado = menor.getNumero();
        }
        if(operacion=='P'){
            for(Numero a:numeros){
                suma = suma + a.getNumero();
            }
            resultado = suma / numeros.size();
        }
        
        return resultado;
    }
   
    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
    
}
