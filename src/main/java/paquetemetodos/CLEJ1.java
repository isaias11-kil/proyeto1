/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetemetodos;
 import java.util.Scanner;
public class CLEJ1 {
 public void ingresarValor() {
 Scanner teclado=new Scanner(System.in);
 int valor;
 do {
 System.out.print("Ingrese valor:");
 valor=teclado.nextInt();
 if (valor!=-1) {
 calcular(valor);
 }
 } while (valor!=-1);
 }//fin metodo ingresarValor()
 
 public void calcular(int v) {
 System.out.println("El cuadrado de: "+v +" es: " +(v*v));
 }//fin metodo calcular()
 
 public static void main(String[] ar) {
 CLEJ1 invocar;
 invocar=new CLEJ1();
 invocar.ingresarValor();
 }//fin metodo main()
}//fin metodo clase cuadrad
    
    

