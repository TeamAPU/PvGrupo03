/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import dominio.Profesor;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.PrimeFaces;
/**
 *
 * @author David
 */
@ManagedBean
@RequestScoped
public class ProfesoresBean {
    
    private Profesor profesor;
    private List<Profesor> profesores;
    
    public ProfesoresBean() {
        profesor = new Profesor();
        profesores = new ArrayList<>();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void guardar() {
        profesores.add(profesor);
        profesor = new Profesor();
        
    }
    
    
    
}
