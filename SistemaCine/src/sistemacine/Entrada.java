/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

import java.util.GregorianCalendar;

/**
 *
 * @author Nahuel
 */
public class Entrada {
    private GregorianCalendar fechaHoraFuncion;
    private GregorianCalendar fechaHoraVenta;
    private float precioCobrado;
    private int ticketNro;
    private funcion funcion;

    public Entrada(GregorianCalendar fechaHoraFuncion, GregorianCalendar fechaHoraVenta, float precioCobrado, int ticketNro, funcion funcion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.funcion = funcion;
    }

    public funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(funcion funcion) {
        this.funcion = funcion;
    }
    
    
    public GregorianCalendar getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public GregorianCalendar getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public float getPrecioCobrado() {
        return precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setFechaHoraFuncion(GregorianCalendar fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public void setFechaHoraVenta(GregorianCalendar fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
    
    public String estaAnulada(){
        return "Esta entrada esta anulada";
    }
    
}
