
package segparcial;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;


public class ventana2 extends JFrame implements ActionListener {
    public JPanel Panel;
    public JCheckBox micheck;
    public JButton boton, boton2;
    private String nombre;
    public JLabel etiqueta2;
    
    public ventana2(){
    setSize(600,400);
    
    setTitle("Licencia de Uso");
    setLocationRelativeTo(null);
    setMinimumSize(new Dimension(200,200)); //establece el tamaño minimo.
    //this.getContentPane().setBackground(new Color(19,252,51));
 
    
    iniciarcomponentes();
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void iniciarcomponentes(){
    colocarPanel();
    colocarEtiquetas();
    areasdetexto();
    checkbox();
    boton();
               
}

public void datonombre(String nombre){
    this.nombre = nombre;
    etiqueta2.setText(nombre);
    
}

private void checkbox(){
    micheck = new JCheckBox();
    micheck.setText("");
    micheck.setBounds(45, 230, 17, 30);
    
    Panel.add(micheck);
    micheck.addActionListener(this);
    
}

private void boton(){
    boton = new JButton("A c e p t o");
                boton.setBounds(50,260,100,30);
                //boton.setBackground(new Color(19,252,51));
                boton.setFont(new Font("arial",Font.BOLD,13));
                boton.setEnabled(false);//establese la interacion del boton false no se puede usar.
                boton.setForeground(new Color(115, 70, 26)); //establecemos el colo de la letra.
                boton.setMnemonic('a');//establecemos alt + letra.
               Panel.add(boton);
                        
               boton.addActionListener(this); 
               
               boton2 = new JButton("n o   A c e p t o");
                boton2.setBounds(170,260,130,30);
                //boton.setBackground(new Color(19,252,51));
                boton2.setFont(new Font("arial",Font.BOLD,13));
                boton2.setEnabled(true);//establese la interacion del boton false no se puede usar.
                boton2.setForeground(new Color(115, 70, 26)); //establecemos el colo de la letra.
                boton2.setMnemonic('a');//establecemos alt + letra.
               Panel.add(boton2);
                        
               boton2.addActionListener(this); 
    
    
}

private void colocarPanel(){
    Panel= new JPanel();
    Panel.setLayout(null);
    //Panel.setBackground(new Color(255,255,255));
    this.getContentPane().add(Panel);
}
private void colocarEtiquetas(){
    JLabel etiqueta = new JLabel();
    etiqueta.setText("Términos y Condiciones");
    etiqueta.setBounds(35, 30, 350, 30);
    etiqueta.setForeground(new Color(19,252,51));
    etiqueta.setFont(new Font("arial",Font.ITALIC,30));
    Panel.add(etiqueta);//agregamos la etiqueta al panel
    //etiqueta2 = new JLabel();
    //etiqueta2.setText("");
    
     etiqueta2 = new JLabel();
    etiqueta2.setText(""+ " acepto");
   
    etiqueta2.setBounds(90, 230, 200, 30);
    etiqueta2.setForeground(new Color(19,252,51));
    etiqueta2.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta2);//agregamos la etiqueta al panel
   
    JLabel etiqueta3 = new JLabel();
    etiqueta3.setText("yo " );
    etiqueta3.setBounds(70, 230, 100, 30);
    etiqueta3.setForeground(new Color(19,252,51));
    etiqueta3.setFont(new Font("arial",Font.ITALIC,15));
   // Panel.add(etiqueta2);//agregamos la etiqueta al panel
    Panel.add(etiqueta3);//agregamos la etiqueta al panel
    
   

} 

private void areasdetexto(){
    JTextArea areaTexto = new JTextArea();
    areaTexto.setBounds(45, 70, 500, 150);
    areaTexto.setText("\n" +
"TÉRMINOS Y CONDICIONES\n"+
            "\n" +
"         A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE VIVERO PENSAMIENTO.\n" +
"         B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS.\n" +
"         C.  VIVERO PENSAMIENTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n" +
"\n" +
"        LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n" +
"        (VIVERO PENSAMIENTO Y EL AUTOR KEVIN), NO SE RESPONSABILIZAN DEL USO QUE USTED\n" +
"        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n" +
"        SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n" +
"\n");
    areaTexto.setFont(new Font("arial", Font.ITALIC,9));
    areaTexto.setEditable(false);
    Panel.add(areaTexto);
}

@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource()==micheck) {
       boton.setEnabled(true);
       
        
    }
    if (e.getSource()==boton) {
      ventana3 frame = new ventana3();
      frame.datonombre(etiqueta2.getText());
        frame.setVisible(true);
        this.dispose();
        
    }
       if (e.getSource()==boton2) {
          segparcial frame = new segparcial();
           frame.setVisible(true);
           this.dispose();
     
        
    }
}
     public static void main(String[] args) {
        ventana2 v1= new ventana2();
        v1.setVisible(true);
    }
    
}
