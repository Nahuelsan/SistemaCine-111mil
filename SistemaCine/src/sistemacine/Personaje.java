/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacine;

/**
 *
 * @author Nahuel
 */
public class Personaje {
    
    private String nombreEnPelicula;
    private Actor actor;

    public Personaje(String nombreEnPelicula, Actor actor) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    
    
   

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }
    
}
