/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Nahuel
 */
public class Programacion {
    
    private GregorianCalendar fechaFin;
    private GregorianCalendar fechaHoraCreada;
    private GregorianCalendar fechaInicio;
    private List<funcion> funciones;

    public Programacion(GregorianCalendar fechaFin, GregorianCalendar fechaHoraCreada, GregorianCalendar fechaInicio, List<funcion> funciones) {
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
        this.funciones = funciones;
    }

    public List<funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<funcion> funciones) {
        this.funciones = funciones;
    }
    
    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public GregorianCalendar getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaHoraCreada(GregorianCalendar fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    Iterator<Programacion> Iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
