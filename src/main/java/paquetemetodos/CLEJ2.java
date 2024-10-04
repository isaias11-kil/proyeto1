/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetemetodos;

import java.util.Scanner;
public class CLEJ2 {
    
 public void ingresarValor() {
 Scanner teclado=new Scanner(System.in);
 int valor,resultado;
 do {
 System.out.print("Ingrese valor:");
 valor=teclado.nextInt();
 if (valor!=-1) {
 resultado = calcular(valor);
 System.out.println("El cuadrado de: "+valor +" es: " +resultado);
 }
 } while (valor!=-1);
 }//fin metodo ingresarValor()
 
 public int calcular(int v) {
 return v * v; //calcula y retorna el resultado
 }//fin metodo calcular()
 
 public static void main(String[] ar) {
 CLEJ2 invocar;
 invocar=new CLEJ2();
 invocar.ingresarValor();
 }//fin metodo main()
}//fin método clase cuadrad
