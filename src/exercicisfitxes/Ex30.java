/*
Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different"
if all three numbers are different and "Neither all are equal or different" otherwise.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex30 {
    String respuesta;
    String comprovarNumero(int i, int k, int n) {
        if (i==k && k==n){
            respuesta = "Son iguales";
        }
        else{
            respuesta = "Son diferentes";
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Ex30 ob = new Ex30();
        int i, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el 1r num");
        i = sc.nextInt();
        System.out.println("Introduce el 2do num");
        k = sc.nextInt();
        System.out.println("Introduce el 3r num");
        n = sc.nextInt();
        System.out.println(ob.comprovarNumero(i, k, n));
    }
}
