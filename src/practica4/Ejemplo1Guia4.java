/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.

a   e   i   o   u
@   #   $   %   *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author amala
 */
public class Ejemplo1Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase, frase2 = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println(convertir(frase, frase2));
    }
    
    
    
    public static String convertir(String frase, String frase2){
        String vocal;
        int i;
        String aux="";
        for(i=1; i <=frase.length(); i++){
            vocal= frase.substring(i-1, i);
            //if( (vocal.equals("a")) || (vocal.equals("e")) || (vocal.equals("i")) || (vocal.equals("o")) || (vocal.equals("u"))){
                switch (vocal) {
                    case "a":
                        frase2 = frase.substring(i-1,i).replace(vocal, "@");
                        break;
                    case "e":
                        frase2 = frase.substring(i-1,i).replace(vocal,"#");
                        break;
                    case "i":
                        frase2 = frase.substring(i-1,i).replace(vocal,"$");
                        break;
                    case "o":
                        frase2 = frase.substring(i-1,i).replace(vocal,"%");
                        break;
                    case "u":
                        frase2 = frase.substring(i-1,i).replace(vocal,"*");
                        break;
                    default:
                        frase2 = frase.substring(i-1, i);
                        break;
                }
                aux = aux.concat(frase2);
        } 
                        
            
        
        return aux;
        
    }
}
