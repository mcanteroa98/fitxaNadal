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
public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lTriangulo;
        int n = 0;
        System.out.println("Escribe la longitud del triangulo");
        lTriangulo = sc.nextInt();
        
        int [] array = new int[lTriangulo];
        
        for (int i = 0; i < array.length; i++) {
            int num = 0;
            while (num<=n){
                System.out.print("*");
                num++;
            }
            n++;
            System.out.println("");
        }
    }
}
