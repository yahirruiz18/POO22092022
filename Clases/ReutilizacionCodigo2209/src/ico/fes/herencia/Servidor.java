/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import asus.com.computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author yahir
 */
public class Servidor extends computadora {    //extedns es la palabra clave para indicar la herencia
    private int numeroFuentesPoder;
    private int numeroTarjetasRed;
    private int tipoRaid;
    //cuando se hace herencia se hacen 3 constructores

    public Servidor() {
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid) {
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }
    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }

    public void setnumTarjetasRed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
