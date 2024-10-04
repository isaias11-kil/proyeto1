
package segparcial;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class ventana3 extends JFrame implements ActionListener {
    JMenuBar barra;
    JMenu archivo, ayuda;
    JMenuItem color, salir, nuevo, conocer,rojo, verde,azul,inicio;
    int departamento;
    int  antiguedad;
        public JPanel Panel;
        private String nombre,opciones;
        public JLabel etiqueta2;
        public JButton boton;
        private JTextArea areaTexto;
        private JTextField textnombre,textapellido,textapellido2;
        private JComboBox departamentos, Antiguedad;
        

    
        public ventana3(){
    setSize(800,600);
    
    setTitle("pantalla principal");
    setLocationRelativeTo(null);
    setMinimumSize(new Dimension(200,200)); //establece el tamaño minimo.
    //this.getContentPane().setBackground(new Color(19,252,51));
 
    
    //iniciarcomponentes();
    iniciarcomponentes();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
        private void iniciarcomponentes(){
    colocarPanel();
    colocarEtiquetas();
    text();
    listas();
   areatext();
   menu();
    //checkbox();
   boton();
               
}
    
    
    public void datonombre(String nombre){
    this.nombre = nombre;
    etiqueta2.setText(nombre);
    
}
    
    private void colocarPanel(){
    Panel= new JPanel();
    Panel.setLayout(null);
    Panel.setBackground(new Color(19,252,51));
    this.getContentPane().add(Panel);
}
    
    private void colocarEtiquetas(){
        
        JLabel etiqueta1 = new JLabel();
    etiqueta1.setText("Datos del trabajador para el cálculo de vacaciones");
    etiqueta1.setBounds(50, 90, 500, 30);
    etiqueta1.setForeground(new Color(255,255,255));
    etiqueta1.setFont(new Font("arial",Font.ITALIC,20));
    Panel.add(etiqueta1);//agregamos la etiqueta al panel
    
        JLabel etiqueta4 = new JLabel();
    etiqueta4.setText("Nombre completo:");
    etiqueta4.setBounds(40, 150,200, 30);
    etiqueta4.setForeground(new Color(255,255,255));
    etiqueta4.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta4);//agregamos la etiqueta al panel
    
      JLabel etiqueta5 = new JLabel();
    etiqueta5.setText("Apellido Paterno:");
    etiqueta5.setBounds(40, 250,200, 30);
    etiqueta5.setForeground(new Color(255,255,255));
    etiqueta5.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta5);//agregamos la etiqueta al panel
    
      JLabel etiqueta6 = new JLabel();
    etiqueta6.setText("Apellido Materno:");
    etiqueta6.setBounds(40, 350,200, 30);
    etiqueta6.setForeground(new Color(255,255,255));
    etiqueta6.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta6);//agregamos la etiqueta al panel
    
      JLabel etiqueta7 = new JLabel();
    etiqueta7.setText("Selecciona el Departamento:");
    etiqueta7.setBounds(300, 150,300, 30);
    etiqueta7.setForeground(new Color(255,255,255));
    etiqueta7.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta7);//agregamos la etiqueta al panel
    
     JLabel etiqueta8 = new JLabel();
    etiqueta8.setText("Selecciona la Antigüedad:");
    etiqueta8.setBounds(300, 250,300, 30);
    etiqueta8.setForeground(new Color(255,255,255));
    etiqueta8.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta8);//agregamos la etiqueta al panel
    
     JLabel etiqueta9 = new JLabel();
    etiqueta9.setText("Resultado del Cálculo:");
    etiqueta9.setBounds(300, 350,300, 30);
    etiqueta9.setForeground(new Color(255,255,255));
    etiqueta9.setFont(new Font("arial",Font.ITALIC,15));
    Panel.add(etiqueta9);//agregamos la etiqueta al panel
    
    JLabel etiqueta3 = new JLabel();
    etiqueta3.setText("BIENVENIDO");
    etiqueta3.setBounds(30, 20, 200, 30);
    etiqueta3.setForeground(new Color(255,255,255));
    etiqueta3.setFont(new Font("arial",Font.ITALIC,30));
    Panel.add(etiqueta3);//agregamos la etiqueta al panel
    
    etiqueta2 = new JLabel();
    etiqueta2.setText("");
    etiqueta2.setBounds(220, 20, 300, 30);
    etiqueta2.setForeground(new Color(255,255,255));
    etiqueta2.setFont(new Font("arial",Font.ITALIC,30));
    Panel.add(etiqueta2);//agregamos la etiqueta al panel
   

} 
    private void text (){
         textnombre = new JTextField();
         textnombre.setBounds(40, 180,200, 30);
         textnombre.setBackground(new Color(216,224,217));
         Panel.add(textnombre);  
         
         textapellido = new JTextField();
         textapellido.setBounds(40, 280,200, 30);
         textapellido.setBackground(new Color(216,224,217));
         Panel.add(textapellido);
         
         textapellido2 = new JTextField();
         textapellido2.setBounds(40, 380,200, 30);
         textapellido2.setBackground(new Color(216,224,217));
         Panel.add(textapellido2);
         
    }
    
    private void listas (){
        String [] departamento = {"","atencion al cliente","ventas", "departamento de gerencia "};

        departamentos = new JComboBox(departamento);
        departamentos.setBounds(300, 180,300, 30);
        Panel.add(departamentos);
        
           String [] antiguedad = {"","1 año de servicio","2 a 6 año de servicio", "7 año o más de servicio "};

        Antiguedad = new JComboBox(antiguedad);
        Antiguedad.setBounds(300, 280,300, 30);
        Panel.add(Antiguedad);
        
    }
    
    public void areatext (){
       areaTexto = new JTextArea();
    areaTexto.setBounds(300, 380,400, 100);
    areaTexto.setText("\n" +
"Aqui aparece el resultado del cálculo de las vacaciones.");
    areaTexto.setFont(new Font("arial", Font.ITALIC,12));
    areaTexto.setEditable(false);
    Panel.add(areaTexto);
    }
    
    private void boton (){
        boton = new JButton("C a l c u l a r");
                boton.setBounds(40, 420,200, 30);
                //boton.setBackground(new Color(19,252,51));
                boton.setFont(new Font("arial",Font.BOLD,13));
                boton.setEnabled(true);//establese la interacion del boton false no se puede usar.
                boton.setForeground(new Color(115, 70, 26)); //establecemos el colo de la letra.
                boton.setMnemonic('a');//establecemos alt + letra.
               Panel.add(boton);
               
               eventoOyenteDeRaton();
               
}
    private void eventoOyenteDeRaton(){
        //agregando oyente de raton
        MouseListener oyenteDeRaton = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
              areaTexto.setText("El trabajador " + textnombre.getText() +" " + textapellido.getText()+" "+textapellido2.getText()+ "\n"+" quien labora en " + 
                     departamentos.getSelectedItem() + " con" +"\n" + Antiguedad.getSelectedItem()   );
              
                departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
      if (departamento==1){
          if (antiguedad==1){
          areaTexto.append("\n"+"recibe 6 dias de vcaciones");
          }
      }else
          departamento= departamentos.getSelectedIndex();
          antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==1){
          if (antiguedad==2){
          areaTexto.append("\n"+"recibe 14 dias de vcaciones");
          }
      }else
              departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==1){
          if (antiguedad==3){
          areaTexto.append("\n"+"recibe 20 dias de vcaciones");
          }
      }else
              departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
             if (departamento==2){
          if (antiguedad==1){
          areaTexto.append("\n"+"recibe 7 dias de vcaciones");
          }
      }else
                 departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==2){
          if (antiguedad==2){
          areaTexto.append("\n"+"recibe 15 dias de vcaciones");
          }
      }else
              departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==2){
          if (antiguedad==3){
          areaTexto.append("\n"+"recibe 22 dias de vcaciones");
          }
      }else
              departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
              if (departamento==3){
          if (antiguedad==1){
          areaTexto.append("\n"+"recibe 10 dias de vcaciones");
          }
      }else
                  departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==3){
          if (antiguedad==2){
          areaTexto.append("\n"+"recibe 20 dias de vcaciones");
          }
      }else
              departamento= departamentos.getSelectedIndex();
                antiguedad= Antiguedad.getSelectedIndex();
          if (departamento==3){
          if (antiguedad==3){
          areaTexto.append("\n"+"recibe 30 dias de vcaciones");
          }
      }
            
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
};
            
            boton.addMouseListener(oyenteDeRaton);
            
        
    }
   
        
    private void menu(){
        //super("menu");
        barra= new JMenuBar();
        //setJMenuBar(mb);

        archivo= new JMenu("Opciones");
        ayuda=new JMenu("conocer");
        color=new JMenu("color");
        
        
        nuevo=new JMenuItem("nuevo");
        nuevo.addActionListener(this);
        inicio=new JMenuItem("inicio");
        inicio.addActionListener(this);
        salir=new JMenuItem("salir");
          salir.addActionListener(this);
        conocer=new JMenuItem("conocer");
         conocer.addActionListener(this); 
         rojo=new JMenuItem("rojo");
         rojo.addActionListener(this); 
         verde=new JMenuItem("verde");
         verde.addActionListener(this);
         azul=new JMenuItem("azul");
         azul.addActionListener(this);
        //this.add(barra);
        barra.add(archivo);
        barra.add(color);
        barra.add(ayuda);
         
        archivo.add(nuevo);
        archivo.add(inicio);
        archivo.add(salir);
        ayuda.add(conocer);
        color.add(rojo);
        color.add(verde);
        color.add(azul);
        setJMenuBar(barra);
        setSize(800,600);
        setLocationRelativeTo(null);
        
        conocer.addActionListener(e -> {   
            
            JOptionPane.showMessageDialog(null, "Desarrollador: Kevin Isaias Lopez Guzman");
        }); 
       
        Panel.add(barra);
        //setVisible(true);
    }
    
    

    
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource()==nuevo) {
             textnombre.setText("");
             textapellido.setText("");
             textapellido2.setText("");
             departamentos.setSelectedIndex(0);
             Antiguedad.setSelectedIndex(0);
             areaTexto.setText("Aqui aparece el resultado del cálculo de las vacaciones.");
    }
    
    if (e.getSource()==rojo) {
            Panel.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==verde) {
            Panel.setBackground(new Color(0,255,0));
        }
        
       if (e.getSource()==azul) {
         Panel.setBackground(new Color(19, 49, 236));
 }
        if (e.getSource()==salir) {
         this.dispose();
 }
             if (e.getSource()==inicio) {
              segparcial frame = new segparcial();
                frame.setVisible(true);
                this.dispose();
         
 }
}


    public static void main(String[] args) {
        ventana3 v1= new ventana3();
        v1.setVisible(true);
    }
    
}
