/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

/**
 *
 * @author yahir
 */
public class Libro {
    private String color;
    private String editorial;
    private String nombre;
    private int paginas; 
    private String autor;

    public Libro() {
    }

    public Libro(String color, String editorial, String nombre, int paginas, String autor) {
        this.color = color;
        this.editorial = editorial;
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void leer(){
        System.out.println("Aqui leo mi libro "+this.nombre + " del autor " + this.autor +" que cuenta con " + this.paginas + " paginas ");
    }
    
    public void caracteristicas(){
        System.out.println("Mi libro es de color " +this.color + " de la editorial " + this.editorial);
        
    }
}
