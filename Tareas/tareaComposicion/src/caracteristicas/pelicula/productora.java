/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas.pelicula;

/**
 *
 * @author yahir
 */
public class productora {
    private String nombre;
    private String pelicula;

    public productora() {
    }

    public productora(String nombre, String pelicula) {
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "productora{" + "nombre=" + nombre + ", pelicula=" + pelicula + '}';
    }
    
    void patrocinando(){
        System.out.println("la productora es quien esta patrocinando la pelicula ");
    }
}
