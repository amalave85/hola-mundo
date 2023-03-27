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
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int edad;
            String nombre, opc;
            boolean resp = true;
            Scanner leer = new Scanner(System.in);
            do {
                System.out.println("Ingrese el nombre");
                nombre = leer.next();
                System.out.println("Ingrese la edad");
                edad = leer.nextInt();
                mas18(nombre,edad);
                System.out.println("Desea ingresar mas datos (S/N?");
                opc = leer.next();
                if (opc.equalsIgnoreCase("N")) {
                    resp = false;
                }

            } while (resp);
        }

        public static void mas18(String nombre, int edad) {
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");

            } else {
                System.out.println(nombre + " es menor de edad");

            }
        }

    }
