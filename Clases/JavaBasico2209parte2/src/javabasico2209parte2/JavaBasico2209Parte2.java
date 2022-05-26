/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yahir
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*Excepciones*/
        ArrayList <String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
            
        }
        
        System.out.println("-------------");
        Scanner teclado = new Scanner(System.in);
        
        int seleccion = 0; //teclado.nextInt();
        
        String elNombre = "";
        try {
            seleccion = teclado.nextInt();
            elNombre= nombres.get(seleccion);
        }catch(InputMismatchException e){
            System.out.println("Debes teclar valores numericos");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        }
        catch (Exception e) {
            System.out.println("Generica");
            elNombre = nombres.get(1);
            
        } finally {
            System.out.println(elNombre);
            elNombre=null; //Limpieza
        }
        
        //System.out.println (nombres.get(seleccion));
        
        System.out.println("Continua el programa ...");
        
        Aritmetica cal = new Aritmetica(2,0);
        System.out.println(cal.getA()+"+"+cal.getB()+"="+cal.sumar());
        
        try {
            System.out.println(cal.getA()+"/"+cal.getB()+"="+cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        }
        
        System.out.println("Fin del programa");
        
        System.out.println("---------------------Hasta aquí----------------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Area del cuadrado es: "+ cuad.calcularArea());
        System.out.println("Area del circulo es: "+circ.calcularArea());
        
        System.out.println("--------------------------------------");
        
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografia, guitarra, *");
        eda.setEdad(18);
        eda.setNombre("Yo");
        eda.setNumeroCuenta("422012511");
        
        /*
        Una interfaz se implementa
        Una clase se hereda(no abstracta, abstracta).
         */
        
        
        
    }
    
}
