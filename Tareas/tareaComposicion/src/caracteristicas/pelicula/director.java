/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas.pelicula;

/**
 *
 * @author yahir
 */
public class director {
    private String nombre;
    private int edad;

    public director() {
    }

    public director(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "director{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    void dirigiendo(){
        System.out.println("el director se está encargando del rodaje de la pelicula ");
    }
}
