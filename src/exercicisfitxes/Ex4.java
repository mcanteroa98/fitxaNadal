/*
Escriba un programa Java que lea un número de punto flotante e imprima "cero" si el número es cero.
De lo contrario, imprima "positivo" o "negativo". Agregue "pequeño" 
si el valor absoluto del número es menor que 1, o "grande" si excede 1,000,000.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex4 {
    Scanner sc = new Scanner(System.in);
    public void tipoNumero(int n){
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        
        if (n==0){
            System.out.println("cero");
        }else{
            System.out.println("Positivo o negativo");
        if(n>0){
            System.out.println("Positivo");
            if(n>=1000000){
                System.out.println("Grande");
            }
        }
        if (n<=1){
            System.out.println("Pequeño");
        if(n<0){
            System.out.println("Negativo");
        }
        }
        }

    }
    public static void main(String[] args) {
        Ex4 ob = new Ex4();
        ob.tipoNumero(0);
    }
}
