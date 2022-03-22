/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaPelicula;

import caracteristicas.pelicula.actor;
import caracteristicas.pelicula.director;
import caracteristicas.pelicula.productora;

/**
 *
 * @author yahir
 */
public class pelicula {
    private actor protagonista;
    private director director;
    private productora patrocinadora;

    public pelicula() {
    }

    public pelicula(actor protagonista, director director, productora patrocinadora) {
        this.protagonista = protagonista;
        this.director = director;
        this.patrocinadora = patrocinadora;
    }

    public productora getPatrocinadora() {
        return patrocinadora;
    }

    public void setPatrocinadora(productora patrocinadora) {
        this.patrocinadora = patrocinadora;
    }

    public actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(actor protagonista) {
        this.protagonista = protagonista;
    }

    public director getDirector() {
        return director;
    }

    public void setDirector(director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "pelicula{" + "protagonista=" + protagonista + ", director=" + director + ", patrocinadora=" + patrocinadora + '}';
    }
    
    public void filmando(){
        System.out.println("se estan realizando las grabaciones finales de la pelicula ");
    }
}
