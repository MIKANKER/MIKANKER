package com.mycompany.factura;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.util.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class factura extends JFrame {
      
    public JPanel panel;
    private JLabel saludo;
    private JTextField cajaN;
    private JPanel fch;
    private JLabel num;
    private JLabel prd;
    private JTextField cajaA;
    private JLabel edd;
    private JTextField cajaP;
    private JLabel fecha;
        
        public factura(){
        setSize(800,600);
        setTitle("Factura");
        setLocationRelativeTo(null);
        inc();
        num();
        cajaN();
        prd();
        cajaP();
        fecha();
        btn();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
        private void inc(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel texto = new JLabel ();//creamos la etiqueta
        texto.setText("Bienvenido");
        texto.setBounds(350,20,200,40);
        texto.setFont(new Font("arial",Font.BOLD,20 ));
        panel.add(texto);//agregamos la etiqueta
        }
        private void num(){
        num = new JLabel();
        num.setText("Ingrese su numero de factura");
        num.setBounds(50,90,200,20);
        panel.add(num);  
        }
        private void cajaN(){
        cajaN = new JTextField();
        cajaN.setBounds(50,120,100,20);
        panel.add(cajaN);
        } 
        
        private void fecha() {
        fecha = new JLabel();
        fecha.setBounds(620, 20, 200, 20);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fecha.setText("Fecha actual: " + LocalDate.now().format(formato));
        panel.add(fecha);
    }
           

        private void prd(){
        prd = new JLabel();
        prd.setText("la cantidad el valor del producto que desea llevar");
        prd.setBounds(50,170,300,20);
        panel.add(prd);
        } 
       
        private void cajaP(){
        cajaP = new JTextField();
        cajaP.setBounds(50,200,100,20);
        panel.add(cajaP);
        }
       private void btn() {
    JButton btn = new JButton("Enviar");
    btn.setBounds(350, 280, 100, 30);
    panel.add(btn);

    saludo = new JLabel();
    saludo.setBounds(50, 350, 1500, 40);
    saludo.setFont(new Font("arial", 1, 10));
    panel.add(saludo);

    ActionListener oy = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        double valor = calcularValor();
        saludo.setText("El valor de su producto es: " + cajaP.getText() + ", y el total con un descuento del 10% tendrá un total de: " + valor + " Con un número de factura de: " + cajaN.getText() + ".");

        }
    };

    btn.addActionListener(oy);
}
       private double calcularValor() {
    String valorStr = cajaP.getText();
    double valor = Double.parseDouble(valorStr);
    
    if(valor <= 100000 )
    {
        double descuento = valor * 0.1;
    
    double valorDescuento = valor - descuento;
    return valorDescuento;
    }
}
        
}

