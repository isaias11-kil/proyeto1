/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    import java.util.Scanner;
public class CLEJ3 {
    
 private Scanner teclado;
 private String nombre;
 private int edad;
 
 public void ingresar() {
 teclado=new Scanner(System.in);
 System.out.print("Ingrese nombre:");
 nombre=teclado.nextLine();
 System.out.print("Ingrese edad:");
 edad=teclado.nextInt();
 }//fin metodo ingresar()
 
 public void mostrar() {
 System.out.println("Nombre:"+nombre);
 System.out.println("Edad:"+edad);
 }//fin metodo mostrar()
 
 public void esMayorEdad() {
 if (edad>=18) {
 System.out.print(nombre+" es mayor de edad.");
 } else {
 System.out.print(nombre+" no es mayor de edad.");
 }
 }//fin metodo esMayorEdad()
 
 public static void main(String[] arg) {
 CLEJ3 invocar;
 invocar=new CLEJ3();
 invocar.ingresar();
 invocar.mostrar();
 invocar.esMayorEdad();
 }//fin metodo main()
}//fin clase Persona(

