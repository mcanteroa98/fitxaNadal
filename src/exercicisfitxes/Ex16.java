/*
Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex16 {
    
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
                System.out.print(num+1);
                num++;
            }
            n++;
            System.out.println("");
        }
    }
}
