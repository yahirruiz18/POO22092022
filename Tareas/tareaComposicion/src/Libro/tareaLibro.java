/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import caracteristicas.libro.autor;
import caracteristicas.libro.editorial;

/**
 *
 * @author yahir
 */
public class tareaLibro {
    private autor persona; 
    private editorial editorial;

    public tareaLibro() {
        
    }

    public tareaLibro(autor persona, editorial editorial) {
        this.persona = persona;
        this.editorial = editorial;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(editorial editorial) {
        this.editorial = editorial;
    }

    public autor getPersona() {
        return persona;
    }

    public void setPersona(autor persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "tareaLibro{" + "persona=" + persona + ", editorial=" + editorial + '}';
    }
    public void publicando(){
        System.out.println("se va a publicar este nuevo libro que relata una autobiografía");
    }    
    

}
