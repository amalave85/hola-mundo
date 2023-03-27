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
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        int numero = 0;

        do{System.out.println("Ingrese un número mayor a 1 y le diremos si es primo o no.");
        numero = read.nextInt();
        }while(numero <= 1);

        if (esPrimo(numero)){
            System.out.println("El número es primo");
        }else{System.out.println("El número no es primo");}
    }
    public static boolean esPrimo (int num){
        boolean resp = true;
        for(int i = 2; i < num; i++){
            if( (num % i) == 0 ){
                resp = false;
                break;
            }
        }
        return resp;
    }
}