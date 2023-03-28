
package com.mycompany.ventanta;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {
    
    public JPanel panel;
    private JLabel saludo;
    private JTextField cajaN;
    private JLabel nom;
    private JLabel app;
    private JTextField cajaA;
    private JLabel edd;
    private JTextField cajaE;
        
        public ventana(){
        setSize(800,600);
        setTitle("Ciclo de vida");
        setLocationRelativeTo(null);
        inc();
        nom();
        cajaN();
        app();
        cajaA();
        edd();
        cajaE();
        btn();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
        private void inc(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel texto = new JLabel ("Bienvenido");//creamos la etiqueta
        texto.setText("Bienvenido");
        texto.setBounds(350,20,200,40);
        texto.setFont(new Font("arial",Font.BOLD,20 ));
        panel.add(texto);//agregamos la etiqueta
        }
        private void nom(){
        nom = new JLabel();
        nom.setText("Ingrese su nombre");
        nom.setBounds(50,90,150,20);
        panel.add(nom);  
        }
        private void cajaN(){
        cajaN = new JTextField();
        cajaN.setBounds(50,120,100,20);
        panel.add(cajaN);
        } 
        private void app(){
        app = new JLabel();
        app.setText("Ingrese su apellido");
        app.setBounds(50,170,150,20);
        panel.add(app);
        } 
        private void cajaA(){
        cajaA = new JTextField();
        cajaA.setBounds(50,200,100,20);
        panel.add(cajaA);
        } 
        private void edd(){
        edd = new JLabel();
        edd.setText("Ingrese su edad");
        edd.setBounds(50,250,150,20);
        panel.add(edd);
        } 
        private void cajaE(){
        cajaE = new JTextField();
        cajaE.setBounds(50,280,100,20);
        panel.add(cajaE);
        }
       private void btn() {
    JButton btn = new JButton("Enviar");
    btn.setBounds(350, 320, 100, 30);
    panel.add(btn);

    saludo = new JLabel();
    saludo.setBounds(50, 360, 1800, 40);
    saludo.setFont(new Font("arial", 1, 15));
    panel.add(saludo);

    ActionListener oy = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int edad = calcularEdad();
if (edad >= 0 && edad <= 5) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que aun eres un niño.");
} else if (edad >= 6 && edad <= 11) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que aun eres un adolecente.");
} else if (edad >= 12 && edad <= 18) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que aun eres un joven.");
} else if (edad >= 19 && edad <= 26) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que aun eres un adulto joven.");
} else if (edad >= 27 && edad <= 59) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que aun eres un adulto.");
} else if (edad >= 60 && edad <= 100) {
    saludo.setText("Bienvenido "+cajaN.getText()+" "+cajaA.getText()+ ", tu edad es: " +cajaE.getText()+ ". Eso quiere decir que eres un anciano.");
} else if (edad > 100) {
    saludo.setText("La edad que acabas de digitar es incorrecta.");
}
        }
    };

    btn.addActionListener(oy);
}

private int calcularEdad() {
    String edadStr = cajaE.getText();
    int edad = Integer.parseInt(edadStr);
    return edad;
}
}

