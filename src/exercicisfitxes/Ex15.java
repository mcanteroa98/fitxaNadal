/*
Write a program in Java to display the n terms of odd natural number and their sum.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex15 {
    Scanner sc = new Scanner(System.in);
    
    public Ex15(){
    
    }
    
     int leerNumero(){
        int n;
        System.out.println("Escribe el num de impares que habra");
        n = sc.nextInt();
        return n;
    }
    
     int [] numerosImpares(int [] arrayMetodo){
         
         for (int i = 1; i < (arrayMetodo.length)*2; i++) {
             if (i%2!=0){
                arrayMetodo[i] = i;
                System.out.println((i));
            }
        }
         return arrayMetodo;
    }
     
    int suma(int [] arrayMetodo2) {
        int resSuma =0;
        for (int i = 0; i < arrayMetodo2.length; i++) {
            resSuma += arrayMetodo2[i]; 
        }
        return resSuma;
    }
    
    public static void main(String[] args) {
        Ex15 ob = new Ex15();
        
        int j = ob.leerNumero();
        int [] array = new int [j];
        
        int [] otroArray = ob.numerosImpares(array);
        System.out.println("La suma de los impares es " + ob.suma(otroArray));
    }
}
