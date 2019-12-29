/*
Write a Java program that reads an integer and check whether it is negative, zero, or positive.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex27 {
    String retorno;
    String Checkear (int n){
        if (n<0){
            retorno = "negative";
        }
        if (n==0){
            retorno = "0";
        }
        if (n>0) {
            retorno = "positive";
        }
        return retorno;
    }
    void mostrarResultados(String retorno){
        System.out.println("Number is "+retorno);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero ");
        numero = sc.nextInt();
        Ex27 ob = new Ex27();
        ob.Checkear(numero);
        ob.mostrarResultados(ob.Checkear(numero));
    }

    
}
