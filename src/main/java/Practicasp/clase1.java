/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;


public class clase1 extends JFrame implements ActionListener{
    
 private JLabel ETitulo; //Declarar
        private JLabel ECantidad1;
        private JTextField TxtCantidad1;
        private JLabel ECantidad2;
        private JTextField TxtCantidad2;
        private JButton BtnSumar;
        private JLabel  EResultado;
        private JTextField TxtResultado;
       
        //Metodos
        
        public void ingresar(){
            setTitle("calculadora aritmetica"); 
               ETitulo = new JLabel("C a l c u l a d o r a"); //Crear el objeto e Inicializar darle valor 
               ETitulo.setBounds(300,20,500,20); //Tamaño de etiqueta: CFAA
               add(ETitulo);//Agrega la etiqueta al formulario
               
               //Inicializar etiqueta ECantidad1
               ECantidad1 = new JLabel("Ingrese primera cantidad: ");
               ECantidad1.setBounds(50,50,150,20);
               add(ECantidad1);
                
               //Caja de texto TxtCantidad1
               TxtCantidad1 = new  JTextField();
               TxtCantidad1.setBounds(200,50,150,20);
               add(TxtCantidad1);   
                
               //Inicializar etiqueta ECantidad2
               ECantidad2 = new JLabel("Ingrese segunda cantidad: ");
               ECantidad2.setBounds(50,100,200,20);
               add(ECantidad2);
         
               //Caja de texto TxtCantidad2
               TxtCantidad2 = new  JTextField();
               TxtCantidad2.setBounds(200,100,150,20);
               add(TxtCantidad2);    
               
               //Dibujando botones BtnSumar
                BtnSumar = new JButton("S u m a r");
                BtnSumar.setBounds(50,150,100,20);
                add(BtnSumar);
                        
                BtnSumar.addActionListener(this); 
                
                //cierra el formulario
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==BtnSumar) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int suma=x1+x2;
            String total=String.valueOf(suma);
            
                           
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(200,150,150,20);
            add(EResultado);  
            TxtResultado = new JTextField(total);
            TxtResultado.setBounds(200,150,150,20);
            TxtResultado.setEnabled(false);//Desabilitar caja de texto
            add(TxtResultado);
        }
    }
        
     
        
   //Metodo principal
    public static void main(String[] args) {
       clase1 formulario = new clase1();
        //Dimensiones del formulario
        formulario.setBounds(200,10,800,600);
        
        formulario.setLayout(null);//permite poner objetos en cualquier lado del formulario
        
        formulario.ingresar();//llamar el metodo ingresar()
        formulario.setVisible(true); //hacerlo visible
    }
}
    

