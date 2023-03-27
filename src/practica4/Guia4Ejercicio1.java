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
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // Pedir los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        
        // Mostrar el menú de operaciones y pedir la opción al usuario
        System.out.println("Menú de operaciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingrese la opción deseada: ");
        int opcion = sc.nextInt();
        
        // Realizar la operación correspondiente
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        
        
    }
    
    // Funciones para cada operación matemática
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        return a / b;
    }
}
