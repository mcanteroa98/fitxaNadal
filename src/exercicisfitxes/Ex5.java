/*
Escriba un programa Java que guarde un número del usuario y genere un número entero entre 1 y 7 y muestre el nombre del día de la semana.
 */
package exercicisfitxes;

import java.util.Scanner;

public class Ex5 {
    Scanner sc = new Scanner(System.in);
    public void dia(int n){
        System.out.println("Introduce un numero del 1 al 7");
        n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    public static void main(String[] args) {
        Ex5 ob = new Ex5();
        ob.dia(0);
    }
}
