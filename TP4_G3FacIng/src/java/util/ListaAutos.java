/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ma Ry Youkai
 */
public class ListaAutos implements Serializable{
    private List<Auto> autos;

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
    
    public ListaAutos(){
        Auto auto1 = new Auto("11asd1", "bbbb", "ax0000", "Rojo","gas");
        Auto auto2 = new Auto("11asd2", "bbbb", "ax0000", "Rojo","gas");
        Auto auto3 = new Auto("11asd3", "bbbb", "ax0000", "Rojo","gas");
        Auto auto4 = new Auto("11asd4", "bbbb", "ax0000", "Rojo","gas");
        autos = new ArrayList<>();
        autos.add(auto4);
        autos.add(auto3);
        autos.add(auto2);
        autos.add(auto1);
        
    }
}
