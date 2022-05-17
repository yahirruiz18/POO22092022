/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author yahir
 */
public class InterfazVentana extends JFrame {

    String letras="abcdefghijklmnñopqrstuvwxyz";
    private JTextField cuadroLetras;
    private JTextField cuadroLlave;
    private JButton boton1;
    private JLabel mensaje;
    private JLabel mensajeIntroducir;
    private JLabel mensajeLlave;
    private JLabel x;

    public InterfazVentana() throws HeadlessException {
        setTitle("Cifrado Cesar");
        setSize(700, 700);
        setLayout(null);
        mensajeLlave = new JLabel("Tipo de desplazamiento");
        mensajeLlave.setBounds(100, 20, 400, 50);
        cuadroLlave = new JTextField(5);
        cuadroLlave.setBounds(100, 75, 50, 50);
        cuadroLlave.setBackground(Color.WHITE);
        cuadroLlave.setToolTipText("introduce la llave de cifrado");
        mensajeIntroducir = new JLabel("Ingresa un mensaje");
        mensajeIntroducir.setBounds(100, 120, 400, 50);
        cuadroLetras = new JTextField(50);
        cuadroLetras.setBounds(100, 175, 300, 250);
        cuadroLetras.setBackground(Color.WHITE);
        cuadroLetras.setToolTipText("introduce el texto a cifrar");
        boton1 = new JButton("Cifrar");
        boton1.setBounds(500, 250, 100, 35);
        boton1.setToolTipText("clic para cifrar mensaje");
        mensaje = new JLabel("Mensaje cifrado: ");
        mensaje.setBounds(100, 395, 200, 200);
        
        this.getContentPane().add(mensajeLlave);
        this.getContentPane().add(cuadroLlave);
        this.getContentPane().add(mensajeIntroducir);
        this.getContentPane().add(cuadroLetras);
        this.getContentPane().add(boton1);
        this.getContentPane().add(mensaje);
        
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char caracter;
                String texto;
                String textoCodificado="";
                
                try {
                    texto = cuadroLetras.getText();
                    
                    texto = texto.toLowerCase();
                    
                int key = Integer.parseInt(cuadroLlave.getText());

                for (int i = 0; i < texto.length(); i++)
                {
                    caracter = texto.charAt(i);
                    
                    int pos = letras.indexOf(caracter);
                    
                    if (pos==-1) 
                    {
                        textoCodificado += caracter;    
                    }else
                    {
                        textoCodificado += letras.charAt((pos+key) % letras.length());
                    }
                }
                mensaje.setText("mensaje cifrado: "+textoCodificado);
                }
                catch (Exception ei)
                {
                    System.out.println(ei.toString());
                    
                    JOptionPane.showMessageDialog(null, "introduce un valor correcto", "error de captura", JOptionPane.ERROR_MESSAGE);
                }
                
            
            }

        });
    }
}

