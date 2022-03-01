/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author yahir
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //llama la clase
        Libro libro=new Libro();
        
        //define los atributos
        libro.setNombre("la vida de neymar");
        libro.setColor("Rojo");
        libro.setPaginas(126);
        libro.setAutor("Neymar");
        libro.setEditorial("Paris");
        
        //imprime atributos
        System.out.println("Nombre: " +libro.getNombre());
        System.out.println("Color: " +libro.getColor());
        System.out.println("Paginas: " +libro.getPaginas());
        System.out.println("Autor: " +libro.getAutor());
        System.out.println("Editorial: " +libro.getEditorial());
        
        //imprime los metodos
        libro.leer();
        libro.caracteristicas();
        // TODO code application logic here
    }
    
}
