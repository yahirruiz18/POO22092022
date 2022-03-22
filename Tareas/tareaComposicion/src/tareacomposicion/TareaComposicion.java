/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import Libro.tareaLibro;
import caracteristicas.libro.autor;
import caracteristicas.libro.editorial;
import caracteristicas.pelicula.actor;
import caracteristicas.pelicula.director;
import caracteristicas.pelicula.productora;
import tareaPelicula.pelicula;

/**
 *
 * @author yahir
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tareaLibro libro1 = new tareaLibro();
        libro1.setPersona(new autor("Yahir Ruiz", 19));
        libro1.setEditorial(new editorial("Editores mexicanos unidos", "novena edicion"));
        libro1.publicando();
        System.out.println(libro1);
        
        System.out.println("----------------------------------------------------");
        
        pelicula peliEstreno = new pelicula();
        peliEstreno.setDirector(new director("Pedro pica piedra", 65));
        peliEstreno.setPatrocinadora(new productora("Dreamworks", "shrek"));
        peliEstreno.setProtagonista(new actor("Yahir Ruiz", 19));
        peliEstreno.filmando();
        System.out.println(peliEstreno);
        
    }
        
}
