/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Nahuel
 */
public class Pelicula {
    
     private int añoEstreno;
     private boolean disponible;
     private Time duracion;
     private GregorianCalendar fechaIngreso;
     private String nombre;
     private String tituloOrginal;
     private Calificacion calificacion;
     private Genero genero;
     private paisdeorigen paisDeOrigen;
     private ArrayList<funcion> funciones;
     private ArrayList<Personaje> personajes;

    public Pelicula(int añoEstreno, boolean disponible, Time duracion, GregorianCalendar fechaIngreso, String nombre, String tituloOrginal, Calificacion calificacion, Genero genero, paisdeorigen paisDeOrigen, ArrayList<funcion> funciones, ArrayList<Personaje> personajes) {
        this.añoEstreno = añoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOrginal = tituloOrginal;
        this.calificacion = calificacion;
        this.genero = genero;
        this.paisDeOrigen = paisDeOrigen;
        this.funciones = funciones;
        this.personajes = personajes;
    }

    public void setFunciones(ArrayList<funcion> funciones) {
        this.funciones = funciones;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<funcion> getFunciones() {
        return funciones;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    
    public int getAñoEstreno() {
        return añoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Time getDuracion() {
        return duracion;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTituloOrginal() {
        return tituloOrginal;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public paisdeorigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTituloOrginal(String tituloOrginal) {
        this.tituloOrginal = tituloOrginal;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setPaisDeOrigen(paisdeorigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
     
     public String calcularDuracionenFuncion(){
         
         return "Duracion de la funcion :" + getDuracion();
     }
     
     public String estaDisponible(){
        return null;
     }
}
