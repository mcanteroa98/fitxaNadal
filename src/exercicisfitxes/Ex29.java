/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex29 {
    String error;
    String comprovarPositivo (int n){
        if (n<0){
            error = "Introduce un numero positivo";
        }
        else{
            error = "";
        }
        return error;
    }
    int nNumeros (int y) {
        int k = 0;      
        while (y>=10){
            y = y/10;
            k += 1;
        }
        k++;
        return k;
    }
    public static void main(String[] args) {
        Ex29 ob = new Ex29();
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        ob.comprovarPositivo(numero);
        ob.nNumeros(numero);
        if (numero>=0){
            System.out.println(ob.comprovarPositivo(numero) + "Number of digits in the number: " + ob.nNumeros(numero));
        }
        else{
            System.out.println(ob.comprovarPositivo(numero));
        }
    }
}
