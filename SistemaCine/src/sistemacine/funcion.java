/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahuel
 */
public class funcion {
    private String diaDeSemana;
    private Time duracion;
    private Time horaIncio;
    private int numero;
    private sala sala;
    private List<Entrada> entradas;
    private Pelicula pelicula;

    public funcion() {
        entradas = new ArrayList<>();
    }
    
    
    public funcion(String diaDeSemana, Time duracion, Time horaIncio, int numero, sala sala, List<Entrada> entradas, Pelicula pelicula) {
        this.diaDeSemana = diaDeSemana;
        this.duracion = duracion;
        this.horaIncio = horaIncio;
        this.numero = numero;
        this.sala = sala;
        this.entradas = entradas;
        this.pelicula = pelicula;
    }

   

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    
   
    public sala getSala() {
        return sala;
    }

  
    
    public String getDiaDeSemana() {
        return diaDeSemana;
    }

    public Time getDuracion() {
        return duracion;
    }

    public Time getHoraIncio() {
        return horaIncio;
    }

    public int getNumero() {
        return numero;
    }

    public void setDiaDeSemana(String diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public void setHoraIncio(Time horaIncio) {
        this.horaIncio = horaIncio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSala(sala sala) {
        this.sala = sala;
    }
    
    public String calcularDisponibilidad(){
        return "La disponibilidad es de :" + getEntradas()  + getSala().getCapacidad() ;
    }
}
