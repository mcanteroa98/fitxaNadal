/*
Write a program in Java to display the cube of the number upto given an integer.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex13 {
    Scanner sc = new Scanner(System.in);

    
    int leerNumero(){
        int n;
        System.out.println("Escribe un num ");
        n = sc.nextInt();
        return n;
    }
    
    int cubo(int n){
        int resCubo = ((n*n)*n);
        return resCubo;
        
    }
    public static void main(String[] args) {
        Ex13 ob = new Ex13();
        
        int j = ob.leerNumero();
        int res = ob.cubo(j);
        System.out.println(j + " al cubo, es: " + res);
    }
}
