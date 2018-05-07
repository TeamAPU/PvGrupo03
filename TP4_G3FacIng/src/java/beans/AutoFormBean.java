/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dominio.Auto;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{

    private Auto auto;
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;
    private Auto auto4;
    private Auto auto5;
    private List<Auto> autos;
    private List<String> patente;
    private String modificar;
   
    
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
         auto = new Auto();
         auto1 = new Auto("AB012AA","Fiat","Strada","rojo","diesel");
         auto2 = new Auto("AB012AB","Ford","Ranger","azul","diesel");
         auto3 = new Auto("AB012AC","Renault","Renault12","rojo","diesel");
         auto4 = new Auto("AB012AD","Chevrolet","Corsa","negro","diesel");
         auto5 = new Auto("AB012AE","Fiat","Strada","rojo","diesel");
        autos = new ArrayList<>();
        patente = new ArrayList<>();
       
         // modificar = new Patente();
        
        
    }
    
    public void cargarAutos(){
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
     
    }
    
    public void cargarPatente(){
        for (Auto a : autos) {
            patente.add(a.getPatente());
        }
        
    }
    
    public void modificarAuto(){
        
        for (Auto a : autos) {
            
            if(a.getPatente()==modificar){
                a.setColor(auto.getColor());
                a.setMarca(auto.getMarca());
                a.setModelo(auto.getModelo());
                a.setPatente(auto.getPatente());
                a.setTipoCombustible(auto.getTipoCombustible());
                
            }
        }
    }

    public String getModificar() {
        return modificar;
    }

    public void setModificar(String modificar) {
        this.modificar = modificar;
    }

    
    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Auto getAuto1() {
        return auto1;
    }

    public void setAuto1(Auto auto1) {
        this.auto1 = auto1;
    }

    public Auto getAuto2() {
        return auto2;
    }

    public void setAuto2(Auto auto2) {
        this.auto2 = auto2;
    }

    public Auto getAuto3() {
        return auto3;
    }

    public void setAuto3(Auto auto3) {
        this.auto3 = auto3;
    }

    public Auto getAuto4() {
        return auto4;
    }

    public void setAuto4(Auto auto4) {
        this.auto4 = auto4;
    }

    public Auto getAuto5() {
        return auto5;
    }

    public void setAuto5(Auto auto5) {
        this.auto5 = auto5;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<String> getPatente() {
        return patente;
    }

    public void setPatente(List<String> patente) {
        this.patente = patente;
    }

   
    
    
    
}
