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
public class Ex25 {
    public static void main(String[] args) {
        int lTriangulo;
        int num = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la longitud del triangulo");
        lTriangulo = sc.nextInt();
        
        int [] array = new int[lTriangulo];
        
        for (int i = 1; i <= array.length; i++) {
        cont +=2;
        for (int j = 0; j < array.length-i; j++) {
        System.out.print(" ");
        } 
         for (int k = i; k < cont; k++) {
        System.out.print(k);
        }
        for (int l = cont-2; l >= i; l--) { 
        System.out.print(l);
        }

         System.out.println("");
        }
    }
}
