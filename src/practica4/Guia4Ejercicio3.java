/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author amala
 */
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros = ingresoEuro();
        cambio(euros);
        System.out.println("Gracias por usar este programa");
    }
    public static void cambio(double cantEuros){
        Scanner read = new Scanner(System.in);
        boolean exit = false;
        int menu = 0;
        while(exit == false){
            System.out.println("Ingrese a que divisa desea convertir la cantidad de euros ingresada");
            System.out.println("1.Libras");
            System.out.println("2.dolares");
            System.out.println("3.Yenes");
            System.out.println("4.Ingresar otro monto");
            System.out.println("5.Salir");
            menu = read.nextInt();
            switch(menu){
                case 1: System.out.println(cantEuros + " son " + (cantEuros * 0.86 ) + " libras.");
                    break;
                case 2: System.out.println(cantEuros + " son " + (cantEuros * 1.28611 ) + " dolares.");
                    break;
                case 3: System.out.println(cantEuros + " son " + (cantEuros * 129.852 ) + " yenes.");
                    break;
                case 4: cantEuros = ingresoEuro();
                    break;
                case 5: exit = true;
                    break;
                default: System.out.println("Ingrese una opción valida.");
                    break;
            }
        }
    }
    public static double ingresoEuro(){
        Scanner read = new Scanner(System.in);
        double euros = 0;
        System.out.println("Ingrese la cantidad de euros que desea convertir a otra divisa: ");
        euros = read.nextDouble();
        return euros;
    }
}