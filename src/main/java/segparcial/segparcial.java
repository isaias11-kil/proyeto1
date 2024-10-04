
package segparcial;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class segparcial extends JFrame implements ActionListener{
    public JPanel Panel;
    public JButton ingresar;
    public JTextField Txtnombre;

public segparcial(){
    setSize(400,500);
    
    setTitle("Vivero Pensamiento");
    setLocationRelativeTo(null);
    setMinimumSize(new Dimension(200,200)); //establece el tamaño minimo.
    //this.getContentPane().setBackground(new Color(19,252,51));
    iniciarcomponentes();
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void iniciarcomponentes(){
    colocarPanel();
    colocarEtiquetas();
     //Caja de texto TxtCantidad1
               Txtnombre = new  JTextField();
               Txtnombre.setBounds(40,280,250,30);
               Txtnombre.setBackground(new Color(216,224,217));
              Panel.add(Txtnombre);  
    
    //Dibujando botones ingresar
                ingresar = new JButton("I n g r e s a r");
                ingresar.setBounds(100,320,120,30);
                ingresar.setBackground(new Color(19,252,51));
                ingresar.setFont(new Font("arial",Font.BOLD,13));
                ingresar.setEnabled(true);//establese la interacion del boton false no se puede usar.
                ingresar.setForeground(new Color(115, 70, 26)); //establecemos el colo de la letra.
                ingresar.setMnemonic('a');//establecemos alt + letra.
               Panel.add(ingresar);
                        
               ingresar.addActionListener(this); 
}

private void colocarPanel(){
    Panel= new JPanel();
    Panel.setLayout(null);
    Panel.setBackground(new Color(255,255,255));
    this.getContentPane().add(Panel);
}
private void colocarEtiquetas(){
    JLabel etiqueta = new JLabel();
    etiqueta.setText("Sistema de Control de Vacaciones");
    etiqueta.setBounds(35, 180, 350, 30);
    etiqueta.setForeground(new Color(19,252,51));
    etiqueta.setFont(new Font("arial",Font.ITALIC,20));
    Panel.add(etiqueta);//agregamos la etiqueta al panel
    
    //etiqueta imagen
    ImageIcon imagen = new ImageIcon("viveroo.jpg");
    JLabel etiqueta2 = new JLabel();
    etiqueta2.setBounds(10, 10, 358, 158);
    etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(358, 158, Image.SCALE_SMOOTH)));
    Panel.add(etiqueta2);
    
 
     JLabel etiqueta3 = new JLabel();
    etiqueta3.setText("Ingrese Su Nombre:");
    etiqueta3.setBounds(40, 240, 350, 30);
    etiqueta3.setForeground(new Color(19,252,51));
    etiqueta3.setFont(new Font("arial",Font.ITALIC,18));
    Panel.add(etiqueta3);//agregamos la etiqueta al panel
} 

 
    
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource()==ingresar) {
        ventana2 frame = new ventana2();
        frame.datonombre(Txtnombre.getText());
        frame.setVisible(true);
        this.dispose();
        
    }
    
}
    public static void main(String[] args) {
        segparcial v1= new segparcial();
        v1.setVisible(true);
    }
}