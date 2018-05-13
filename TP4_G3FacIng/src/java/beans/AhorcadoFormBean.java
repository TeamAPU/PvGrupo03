/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dominio.Ahorcado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean {
    private Character[] aux;
    private String resultado;
    private String letra; 
    private Ahorcado ahorcado; 
    private String elegido;
    private int intentos;
    
    
    
    
    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {
        intentos=5;
        this.elegido=escogerPalabra();
        resultado="";
        aux = new Character[elegido.length()];
         for (int i=0; i<elegido.length();i++){
           aux[i]='*' ;
           resultado=resultado+'*';
          }
        
        
    }
    
    public void palabras(){
     
        
       
    }
      
    public String escogerPalabra() {
        String elegir = "";

        int aleatorio = (int) ((Math.random() * 5));
        switch (aleatorio) {
            case 1:
                elegir = "infinito";
                break;
            case 2:
                elegir = "arena";
                break;
            case 3:
                elegir = "universo";
                break;
            case 4:
                elegir = "araña";
                break;
            default:
                elegir = "martillo";
                break;
        }

        return elegir;

    }

    public void comparar() {

        int i;
        if (intentos > 0) {

            if (letra.length() == 1) {

                for (i = 0; i < elegido.length(); i++) {
                    if ((elegido.charAt(i) == letra.charAt(0)) && (aux[i].equals('*'))) {
                        aux[i] = letra.charAt(0);

                    }
                }
                resultado = "";
                for (i = 0; i < elegido.length(); i++) {

                    resultado = resultado + aux[i];
                }
                intentos--;
            } else {
                if (letra.equals(elegido)) {
                    resultado = elegido;
                    intentos=0;
                } else {
                    intentos--;
                }

            }
        } else {
            resultado = "PERDISTE";
        }

    }
   
          
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }

   
  

   

   public String getElegido() {
        return elegido;
    }

    public void setElegido(String elegido) {
        this.elegido = elegido;
    }

    public Character[] getAux() {
        return aux;
    }

    public void setAux(Character[] aux) {
        this.aux = aux;
    }

    

 
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }



    
}


