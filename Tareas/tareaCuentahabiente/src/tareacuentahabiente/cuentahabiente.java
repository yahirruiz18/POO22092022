/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

import javax.swing.JOptionPane;

/**
 *
 * @author yahir
 */
public class cuentahabiente {
    private String idCLiente;
    private String nombre;
    private float balance;

    public cuentahabiente() {
    }

    public cuentahabiente(String idCLiente, String nombre, float balance) {
        this.idCLiente = idCLiente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(String idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCLiente=" + idCLiente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        String dato = JOptionPane.showInputDialog("ingrese monto a retirar");
        System.out.println("retirando:" + dato + "pesos");
        monto = Float.parseFloat(dato);
        balance = balance - monto;
    }
    public String evaluarNivelCliente(){
        return this.balance<=50000.00f?"Cliente Regular":"Cliente Premiuim";
    }
    
}
