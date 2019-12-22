/*
7. Write a Java program to find the number of days in a month.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex7 {
    Scanner sc = new Scanner(System.in);
    public void mes(String nombremes){
        System.out.println("Introduce el numbre de un mes");
        nombremes = sc.next();
        if ("Enero".equals(nombremes)){
            System.out.println("31 dias");
        }
        if ("Febrero".equals(nombremes)){
            System.out.println("28 dias (si no es bisiesto)");
        }
    }
    public static void main(String[] args) {
        Ex7 ob = new Ex7();
        ob.mes("");
    }
}
