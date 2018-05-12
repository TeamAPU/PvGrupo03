/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dominio.Buscar;
import dominio.Libro;
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
public class LibroFormBean implements Serializable{

    private Libro libro;
    private Buscar buscar;
    private List<Libro> libros;
    private List<Libro> busqueda;
   
   
    
    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        libro = new Libro();
        buscar = new Buscar();
        libros = new ArrayList<>();
        busqueda = new ArrayList<>();
    }

    public void agregar(){
        libros.add(libro);
        libro = new Libro();
    }
    
    public void buscar(){
        busqueda.clear();
        if(!libros.isEmpty()){
            for (Libro l : libros) {
                if(buscar.getBuscar().equals(l.getAutor())){
                    busqueda.add(l);
                }
                
            }
            
        }
        
    }
    
    
    
    public Libro getLibro() {
        return libro;
    }
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(List<Libro> busqueda) {
        this.busqueda = busqueda;
    }

    public Buscar getBuscar() {
        return buscar;
    }

    public void setBuscar(Buscar buscar) {
        this.buscar = buscar;
    }

  
    
}
