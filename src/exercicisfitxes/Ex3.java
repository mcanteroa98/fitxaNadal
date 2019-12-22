/*
Take three numbers from the user and print the greatest number.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex3 {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    public void mejorNumero (int n){
        int [] array = new int[3];
        for (int i = 0; i < array.length; i++) {
        System.out.println("Introduce un numero ");
        n = sc.nextInt();
        if (n>x){
            x = n;
        }
        }
        System.out.println("El numero mes gran es: "+x);
    }
    public static void main(String[] args) {
        Ex3 ob = new Ex3();
        ob.mejorNumero(0);
    }
}
