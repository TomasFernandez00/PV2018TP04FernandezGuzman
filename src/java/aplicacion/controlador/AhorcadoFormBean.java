/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.dominio.Ahorcado;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Elena
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable {

    private Ahorcado ahorcado;
    private char letraIngresada;
    private String palabraIngresada;
    private boolean componenteDeshabilitador;

    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {
        ahorcado = new Ahorcado();
        componenteDeshabilitador = false;
    }

    /**
     * @return the ahorcado
     */
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    /**
     * @param ahorcado the ahorcado to set
     */
    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the componenteDeshabilitador
     */
    public boolean isComponenteDeshabilitador() {
        return componenteDeshabilitador;
    }

    /**
     * @param componenteDeshabilitador the componenteDeshabilitador to set
     */
    public void setComponenteDeshabilitador(boolean componenteDeshabilitador) {
        this.componenteDeshabilitador = componenteDeshabilitador;
    }

    public void empezarJuego() {
        getAhorcado().empezarJuego(palabraIngresada);
        setComponenteDeshabilitador(true);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Juego iniciado", "Tu mama"));
    }

    public void controlarLetra() {
        boolean letraEncontrada = getAhorcado().buscarLetra(letraIngresada);
        if (letraEncontrada == true) {
            if (getAhorcado().juegoGanado()) {
                FacesContext facesContext = FacesContext.getCurrentInstance();
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Juego Terminado", "Tu mama"));
            }
        } else {
            if (getAhorcado().getIntentos() == 0) {
                FacesContext facesContext = FacesContext.getCurrentInstance();
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fin del juego pha", "Tu mama"));
                setComponenteDeshabilitador(false);
                setPalabraIngresada(new String());
                setAhorcado(new Ahorcado());
            }
        }
    }

    public void nuevoJuego() {
        setComponenteDeshabilitador(false);
        setPalabraIngresada(new String());
        setAhorcado(new Ahorcado());
    }

}
