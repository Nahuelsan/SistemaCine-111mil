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
public class Actor {
    
    private String animado;
    private String apellido;
    private String nombre;
    private sexo sexo;

    public Actor(String animado, String apellido, String nombre, sexo sexo) {
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void setSexo(sexo sexo) {
        this.sexo = sexo;
    }

    public sexo getSexo() {
        return sexo;
    }

   
    public String getAnimado() {
        return animado;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnimado(String animado) {
        this.animado = animado;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Actor() {
        String s = "";
        StringBuffer sb1 =new StringBuffer("ganador");
        StringBuffer sb2 =new StringBuffer("ganador");
        StringBuffer sb3 =new StringBuffer(sb2);

      StringBuffer sb4 = sb3;
     if(sb1.equals(sb2)) s +="1 ";
    if(sb1.equals(sb3)) s +="2 ";
    if(sb1.equals(sb4)) s +="3 ";
    String s2 ="hola";
     String s3 ="hola";
    String s4 = s3;
    if(s2.equals(s3)) s +="4";
    if(s3.equals(s4)) s +="5";
    System.out.println(s);

    }
    
    
    
    
}
