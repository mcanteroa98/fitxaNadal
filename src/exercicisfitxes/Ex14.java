/*
Write a program in Java to display the multiplication table of a given integer.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex14 {
    Scanner sc = new Scanner(System.in);
    int [] array = new int [5];
    
    int leerNumero(){
        int n;
        System.out.println("Escribe un num ");
        n = sc.nextInt();
        return n;
    }
    
    int [] bucle(int y){
        int k;
        for (int i = 0; i < array.length; i++) {
            k = y * i;
            System.out.println(y + " x " + i + " = " + k);
        }
        return array;
    }
    
    public static void main(String[] args) {
        Ex14 ob = new Ex14();
        int j = ob.leerNumero();
        ob.bucle(j);
    }
}
