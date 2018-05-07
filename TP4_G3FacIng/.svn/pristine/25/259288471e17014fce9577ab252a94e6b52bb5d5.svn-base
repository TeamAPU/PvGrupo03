/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dominio.ConversorTemperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author David
 */
@ManagedBean
@RequestScoped
public class ConversorManagedBean {
    private double n;
    private ConversorTemperatura conversor;
    private char unidadOrigen;
    private char unidadDestino;
    public ConversorManagedBean() {
        
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public ConversorTemperatura getConversor() {
        return conversor;
    }

    public void setConversor(ConversorTemperatura conversor) {
        this.conversor = conversor;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    public double convertirUnidades(){
        double resultado=.0;
        conversor = new ConversorTemperatura();
        conversor.asignarValor(n);
        if(unidadOrigen == 'C' && unidadDestino == 'F'){
            resultado = conversor.obtenerDeCelsiusAFarentheit();
        }
        if(unidadOrigen=='C' && unidadDestino == 'K'){
            resultado = conversor.obtenerDeCelsiusAKelvin();
        }
        if(unidadOrigen=='F' && unidadDestino == 'C'){
            resultado = conversor.obtenerDeFarenheitACelsius();
        }
        if(unidadOrigen=='F' && unidadDestino == 'K'){
            resultado = conversor.obtenerDEFarenheitAKelvin();
        }
        if(unidadOrigen=='K' && unidadDestino == 'C'){
            resultado = conversor.obtenerDeKelvinACelsius();
        }
        if(unidadOrigen=='K' && unidadDestino == 'F'){
            resultado = conversor.obtenerDeKelvinAFarenheit();
        }
        return resultado;
    }
}
