/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nahuel
 */
public class Cine {
    
    private String direccion;
    private Date fechaInaguracion;
    private String nombre;
    private BigDecimal precioEntrada;
    private List<Programacion> programaciones;
    private List<sala> salas;
    private List<HoraFuncion> horariosFunciones;

    public Cine(){
        salas = new ArrayList<>();
        horariosFunciones = new ArrayList<>();
        programaciones = new ArrayList<>();
    }

    public Cine(String direccion, Date fechaInaguracion, String nombre, BigDecimal precioEntrada, List<Programacion> programaciones, List<sala> sala, List<HoraFuncion> horariosFunciones) {
        this.direccion = direccion;
        this.fechaInaguracion = fechaInaguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.programaciones = programaciones;
        this.salas = sala;
        this.horariosFunciones = horariosFunciones;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaInaguracion(Date fechaInaguracion) {
        this.fechaInaguracion = fechaInaguracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioEntrada(BigDecimal precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public void setSala(List<sala> sala) {
        this.salas = sala;
    }

    public void setHorariosFunciones(List<HoraFuncion> horariosFunciones) {
        this.horariosFunciones = horariosFunciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaInaguracion() {
        return fechaInaguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecioEntrada() {
        return precioEntrada;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public List<sala> getSala() {
        return salas;
    }

    public List<HoraFuncion> getHorariosFunciones() {
        return horariosFunciones;
    }

    
    public String mostrarCine(){
        return "Nombre" + getNombre() +
               "Fecha de inaguración :" + getFechaInaguracion()+
               "Precio de entrada :" + getPrecioEntrada() +
               "Dirección :" + getDireccion() +
               "Horarios de las funciones :" +getHorariosFunciones()+
               "Programaciones :"+getProgramaciones()+
               "Sala :"+getSala();
    }
    /**
     * Mostramos el horario
     * @return 
     */
        public String mostrarInfoHorariosFuncion(){
            HoraFuncion hora = null;
            Programacion programacion = null;
            sala sala1 = null;
            Iterator<Programacion> iter = programacion.Iterator();
            Iterator<HoraFuncion> iter2 = hora.Iterator();
            Iterator<sala> iter3 = sala1.Iterator();
            while (iter.hasNext()){
              while(iter2.hasNext()){
                  while(iter3.hasNext()){
                      Programacion p =iter.next();
                      HoraFuncion h=iter2.next();
                      sala s=iter3.next();
                      
                      if( (s != null) && (h != null)&& (p!= null) ){
                          return "Programacion :" +p
                                  +"Horario Funcion :"+h
                                  +"Sala :"+s+"\n";
                      }
                         
                          
                  }
              }
                
            }
        
    return "F";
    }
    
}
