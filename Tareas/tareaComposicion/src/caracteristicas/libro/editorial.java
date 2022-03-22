/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas.libro;

/**
 *
 * @author yahir
 */
public class editorial {
    private String nombreEditorial;
    private String edicion;

    public editorial() {
    }

    public editorial(String nombreEditorial, String edicion) {
        this.nombreEditorial = nombreEditorial;
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "editorial{" + "nombreEditorial=" + nombreEditorial + ", edicion=" + edicion + '}';
    }
    
    void produciendo(){
        System.out.println("la editorial esta produciendo el libro");
    }
    
}
