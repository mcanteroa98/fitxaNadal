/*
Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex28 {
    String retorno;
    String size;
    
    String Checkear (int n){
        if (n<0){
            retorno = "small and negative";
        }
        if (n==0){
            retorno = "0";
        }
        if (n>0) {
            retorno = "positive";
        }
        return retorno;
    }
    String lessOrLarge (int y){
        if (y==1){
            size = " and small ";
            return size;
        }
        if (y>=1000000){
            size = " and large";
        }
        else{
            size = " ";
        }
        return size;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero ");
        numero = sc.nextInt();
        Ex28 ob = new Ex28();
        ob.Checkear(numero);
        ob.lessOrLarge(numero);
        System.out.println("Number is " + ob.Checkear(numero) + ob.lessOrLarge(numero));
        
    }
}
