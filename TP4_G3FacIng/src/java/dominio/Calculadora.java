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
public class Calculadora {
    
    private double numA;
    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
    
    public double sumar(){
        return numA + numB;
    }
    
    public double restar(){
        return numA - numB;
    }
    
    public double multiplicar(){
        return numA * numB;
    }
    
    public double dividir(){
        return numA / numB;
    }
}
