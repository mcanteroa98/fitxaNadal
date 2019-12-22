/*
Escriba un programa Java para obtener un número escrito por el usuario e imprima si es positivo o negativo.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex1 {
    Scanner sc = new Scanner(System.in);
    
    public int numero (int n){
        System.out.println("Introduce un numero ");
        n = sc.nextInt();
        if (n<=0){
            System.out.println("El numero es negatiu");
        }else{
            System.out.println("El numero es positiu");
        }
        return n;
    }
    
    public static void main(String[] args) {
        Ex1 objeto = new Ex1();
        objeto.numero(0);
        
    }
}
