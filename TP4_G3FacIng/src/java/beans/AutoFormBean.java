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
import util.ListaAutos;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{
    
    private List<Auto> autos;
    private Auto autoEditar;
    
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
        
        ListaAutos listaautos = new ListaAutos();
        autoEditar = new Auto();
        autos = listaautos.getAutos();

    }
    
    public void modificarAuto(){
        
        for (Auto a : autos) {
            if(a.getPatente().equals(autoEditar.getPatente())){
                a.setColor(autoEditar.getColor());
                a.setPatente(autoEditar.getPatente());
                a.setMarca(autoEditar.getMarca());
                a.setTipoCombustible(autoEditar.getTipoCombustible());
                a.setModelo(autoEditar.getModelo());
            }
        }
    }
        public void seleccionar(Auto autoelegido){
            autoEditar = autoelegido;
        }
    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public Auto getAutoEditar() {
        return autoEditar;
    }

    public void setAutoEditar(Auto autoEditar) {
        this.autoEditar = autoEditar;
    }
    
    
}

