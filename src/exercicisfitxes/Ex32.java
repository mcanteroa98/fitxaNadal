/*
Write a Java program that accepts two floatingpoint numbers and checks whether
they are the same up to two decimal places.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author batman
 */
public class Ex32 {
    boolean floatingPoint (int j, int k){
        int n = 0;
        
        while (j/10>9 && k/10>9){
            j = j%10;
            k = k%10;
            if (j!=k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Ex32 ob = new Ex32();
        Scanner sc = new Scanner(System.in);
        int j, k;
        System.out.println("Introduce el primer numero");
        j = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        k = sc.nextInt();

        if (ob.floatingPoint(j, k) == true){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
