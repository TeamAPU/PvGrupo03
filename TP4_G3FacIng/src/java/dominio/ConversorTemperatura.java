/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author David
 */
public class ConversorTemperatura {
    private double numero;
    
    public ConversorTemperatura(){
        
    }
    
    public void asignarValor(double num){
        this.numero = num;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public double obtenerDeCelsiusAFarentheit(){
        return 1.8 *numero +32;
    }
    public double obtenerDeCelsiusAKelvin(){
        return numero+273.15;
    }
    public double obtenerDeFarenheitACelsius(){
        return (numero-32)/1.8;
    }
    public double obtenerDEFarenheitAKelvin(){
        return ((numero-32)/1.8)+273.15;
    }
    public double obtenerDeKelvinACelsius(){
        return numero-273.15;
    }
    public double obtenerDeKelvinAFarenheit(){
        return (numero-273.15)*1.8+32;
    }
}
