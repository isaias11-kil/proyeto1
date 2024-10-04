
package PaqCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; //import javax.swing.*;importa todo.
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClaseCalculadora extends JFrame implements ActionListener{
        //Atributos
        private JLabel ETitulo; //Declarar
        private JLabel ECantidad1;
        private JTextField TxtCantidad1;
        private JLabel ECantidad2;
        private JTextField TxtCantidad2;
        private JButton BtnSumar;
        private JButton BtnResta;
        private JLabel  EResultado;
        private JButton BtnMultiplicacion;
        private JButton BtnDividir;
        private JButton BtnSalir;
        //Metodos
        public void ingresar(){
               ETitulo = new JLabel("C a l c u l a d o r a"); //Crear el objeto e Inicializar darle valor 
               ETitulo.setBounds(300,20,500,20); //Tamaño de etiqueta: CFAA
               add(ETitulo);//Agrega la etiqueta al formulario
               
               ETitulo = new JLabel("R e s u l t a d o :"); //Crear el objeto e Inicializar darle valor 
               ETitulo.setBounds(50,250,500,20); //Tamaño de etiqueta: CFAA
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
                
                //Dibujando botones Btnresta
                BtnResta = new JButton("R e s t a");
                BtnResta.setBounds(230,150,100,20);
                add(BtnResta);
                        
                BtnResta.addActionListener(this); 
                
                 //Dibujando botones BtnMultiplicacion
                BtnMultiplicacion = new JButton("M u l t i p l i c a r");
                BtnMultiplicacion.setBounds(50,200,160,20);
                add(BtnMultiplicacion);
                        
                BtnMultiplicacion.addActionListener(this); 
                
                //Dibujando botones BtnDividir 
                BtnDividir = new JButton("D i v i d i r");
                BtnDividir.setBounds(230,200,100,20);
                add(BtnDividir);
                        
                BtnDividir.addActionListener(this); 
                
                //Dibujando botones BtnSalir 
                BtnSalir = new JButton("S a l i r");
                BtnSalir.setBounds(230,200,100,20);
                add(BtnSalir);
                        
                BtnSalir.addActionListener(this); 
                
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
            setTitle(total);
                           
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(150,250,150,20);
            add(EResultado);   
        }
        if (e.getSource()==BtnResta) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int resta=x1-x2;
            String total=String.valueOf(resta);
            setTitle(total);
                           
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(150,250,150,20);
            add(EResultado);   
        }
        
         if (e.getSource()==BtnMultiplicacion) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int multiplicacion=x1*x2;
            String total=String.valueOf(multiplicacion);
            setTitle(total);
                           
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(150,250,150,20);
            add(EResultado);   
        }
          if (e.getSource()==BtnDividir) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int dividir=x1/x2;
            String total=String.valueOf(dividir);
            setTitle(total);
                           
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(150,250,150,20);
            add(EResultado);   
        }
    }
        
     
        
   //Metodo principal
    public static void main(String[] args) {
        ClaseCalculadora formulario = new ClaseCalculadora();
        //Dimensiones del formulario
        formulario.setBounds(200,10,800,600);
        formulario.setVisible(true); //hacerlo visible
        formulario.setLayout(null);//permite poner objetos en cualquier lado del formulario
        formulario.ingresar();//llamar el metodo ingresar()
    }
}