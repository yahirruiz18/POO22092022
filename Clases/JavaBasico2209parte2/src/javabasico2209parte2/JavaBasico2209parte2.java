/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yahir
 */
public class JavaBasico2209parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //excepciones
        
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println( nombre );
        }
        
        System.out.println("------------------------");
        System.out.println("Ingresa un numero ");
        Scanner teclado = new Scanner(System.in);
      
        int seleccion;
        
                String elNombre = "";
        try {
            seleccion = teclado.nextInt();
            elNombre = nombres.get(seleccion);
        }catch(InputMismatchException ie){
            System.out.println("Debes teclear valores numericos");
            elNombre=nombres.get(0);
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, el numero debe estar entre 0 y 4");
            elNombre=nombres.get(0);
        } catch (Exception e) {
            System.out.println("Generica");
        } finally {
            System.out.println( elNombre );
            //limpieza
        }
        
        //System.out.println(nombres.get(seleccion));
        
        System.out.println("Continua el programa...");
        
        Aritmetica cal= new Aritmetica(2,4);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.sumar());
        
        try {
            System.out.println(cal.getA() + "/" + cal.getB() + "=" + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        } finally {
        }
                
        System.out.println("Fin del programa");
        
    }
    
}
