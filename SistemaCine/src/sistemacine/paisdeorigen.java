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
public class paisdeorigen {

    private String idioma;
    private String nombre;

    public paisdeorigen(String idioma, String nombre) {
        this.idioma = idioma;
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
