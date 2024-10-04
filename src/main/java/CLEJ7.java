/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.Scanner;
public class CLEJ7 {
 //variable global definada como estática
 static Scanner teclado = new Scanner(System.in);
 //declarando un método(función) estatica
 public static void sumar(){
 int numero1,numero2,resultado;
 System.out.println("Suma");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 System.out.println("Ingrese segundo numero: ");
 numero2=teclado.nextInt();
 resultado = (numero1 + numero2);
 System.out.println("El resultado de la suma es: "+resultado);
 }//fin metodo sumar()
  public static void resta(){
 int numero1,numero2,resultado;
 System.out.println("Suma");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 System.out.println("Ingrese segundo numero: ");
 numero2=teclado.nextInt();
 resultado = (numero1 - numero2);
 System.out.println("El resultado de la restga es: "+resultado);
 }//fin metodo resta()
   public static void dividir(){
 int numero1,numero2,resultado;
 System.out.println("Suma");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 System.out.println("Ingrese segundo numero: ");
 numero2=teclado.nextInt();
 resultado = (numero1 / numero2);
 System.out.println("El resultado de la restga es: "+resultado);
 }//fin metodo resta()
 public static void main(String[] args) {
 int opcion;
 do {
 System.out.println("Calculadora usando metodos");
 System.out.println("1.....Sumar");
 System.out.println("2.....Restar");
 System.out.println("3.....Multiplicar");
 System.out.println("4.....Dividir");
 System.out.println("5.....Salir");
 System.out.println("");
 System.out.println("Seleccione una opcion");
 opcion=teclado.nextInt();
 switch(opcion){
 case 1: {
 CLEJ7.sumar();//invocando al metodo sumar()
 break;
 }//fin case 1 
 case 2:{
     CLEJ7.resta();
     break;
 }//fin case 2
 case 4:{
     CLEJ7.dividir();
     break;
 }//fin case4
 }//fin switch() 
 } while (opcion!=5); 
 }//fin metodo main()
}//fin clase Calculador
    

