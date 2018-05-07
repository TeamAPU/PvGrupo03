/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dominio.Calculadora;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author David
 */
@ManagedBean
@RequestScoped
public class Calculadorabean {
    
    private double numeroA;
    private double numeroB;
    private Calculadora calculadora;
    private char operador;
    
    public Calculadorabean() {
        calculadora = new Calculadora();
    }

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    /*
    public double sumar(){
        return calculadora.sumar(numeroA, numeroB);
    }
    
    public double restar(){
        return calculadora.restar(numeroA, numeroB);
    }
    
    public double multiplicar(){
        return calculadora.multiplicar(numeroA, numeroB);
    }
    
    public double dividir(){
        return calculadora.dividir(numeroA, numeroB);
    }*/
    
    public double operacion(){
        double resultado=0;
        calculadora = new Calculadora();
        calculadora.setNumA(numeroA);
        calculadora.setNumB(numeroB);
        
        if(operador=='S'){
            resultado=calculadora.sumar();
        }
        if(operador=='R'){
            resultado=calculadora.restar();
        }
        if(operador=='M'){
            resultado=calculadora.multiplicar();
        }
        if(operador=='D'){
            resultado=calculadora.dividir();
        }
        
        return resultado;
    }
}
