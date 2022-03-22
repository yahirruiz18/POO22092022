/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author yahir
 */
public class perro extends animal {
    private String raza;
    private String pedigree;

    public perro() {
    }

    public perro(String raza, String pedigree) {
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public perro(String raza, String pedigree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "perro{" + "raza=" + raza + ", pedigree=" + pedigree + '}';
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("el perro emite un sonido... guau guau");
    }
}
