/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

//import javax.swing.JFrame;

import asus.com.computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;


/**
 *
 * @author yahir
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        String nombre = new String ("josé josé");
        System.out.println( nombre );
        System.out.println( nombre.charAt(3));
        System.out.println( nombre.toUpperCase() );
        
        computadora miCompu= new computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("intel", 2.6f));
        miCompu.setRaton(new Mouse("logitech", "optico"));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu );
        
        /*computadora compu2 = new computadora("apple", "macbook", 
                new Monitor("monitor" 12.5f),
                new Mouse("acteck", "optico"),
                new Teclado("apple"), 
                new Procesador("M1"));
        System.out.println( compu2 );
        /*JFrame ventana = new JFrame("mi primer vetnana");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        
        System.out.println("----------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("josé");
        System.out.println( alu1 );
        
    }

    
}
