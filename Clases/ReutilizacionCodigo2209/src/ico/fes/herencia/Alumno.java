/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author yahir
 */
public class Alumno extends Persona {
    private String numeroDeCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String numeroDeCuenta, String carrera) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numeroDeCuenta, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroDeCuenta + ", carrera=" + carrera + '}';
    }
    
}
