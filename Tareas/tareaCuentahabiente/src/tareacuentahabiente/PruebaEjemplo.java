/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author yahir
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     cuentahabiente[]listaCH= new cuentahabiente[5];
        listaCH[0]=new cuentahabiente("id319081845", "felipe", 58000.45f);
        listaCH[1]=new cuentahabiente("id319081846", "yahir", 4001.00f);
        listaCH[2]=new cuentahabiente("id319081847", "luis", 6300.10f);
        listaCH[3]=new cuentahabiente("id319081848", "jaqueline", 60000.50f);
        listaCH[4]=new cuentahabiente("id319081849", "sarai", 8111.10f);
        
        for (cuentahabiente cuentahabiente : listaCH) {
            System.out.println(cuentahabiente.getNombre()+" " +cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
