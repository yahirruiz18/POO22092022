/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author yahir
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla ();
        System.out.println(s1);
        System.out.println( s1.toString() );
        
        //escribir la clase mas el .set para definir cada uno de los atributos
        Automovil miBocho = new Automovil();
        System.out.println( miBocho );
        miBocho.setMarca("VW ");
        miBocho.setSubMarca("sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.gray);
        System.out.println( miAkura );
        
        //el objetivo de un metodo especia constructor es crear el objeto en memoria
        //los contructores sobrecargados sirven para inicializar valores
        //cuando se menciona una instancia se refieren a una clase es decir una instancia de la clase silla es el 1 en este codigo y realente se quiere decir un ejemplar de la clase mibocho, miAkura, miMustang son ejemplos
        
        // TODO code application logic here
    }
    
}
