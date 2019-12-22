/*
Escriba un programa Java que lea en dos números de punto flotante y pruebe si son iguales hasta tres decimales
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex6 {
    Scanner sc = new Scanner(System.in);
    int primeron, segundon, terceron, primeroy, segundoy, terceroy;
    public void comprovarDecimals(int n, int y){
        System.out.println("Escribe un numero:");
        n = sc.nextInt();
        terceron = n%10;
        
        n = n/10;
        segundon = n%10;
        
        n = n/10;
        primeron = n%10;
        System.out.println("Escribe otro numero:");
        y = sc.nextInt();
        terceroy = y%10;
        
        y = y/10;
        segundoy = y%10;
        
        y = y/10;
        primeroy = y%10;
            
        if (primeron == primeroy){
            System.out.println("El primer numero es igual");
        }else{
            System.out.println("El primero no es igual");
        }
        if(segundon==segundoy){
            System.out.println("El segundo numero es igual");
        }
        else{
            System.out.println("El segundo no es igual");
        }
        if (terceron==terceroy){
            System.out.println("El tercer numero es igual");
        }
        else{
            System.out.println("El tercero no es igual");
        }

        

    }
    public static void main(String[] args) {
        Ex6 ob = new Ex6();
        ob.comprovarDecimals(0,0);
    }
}
