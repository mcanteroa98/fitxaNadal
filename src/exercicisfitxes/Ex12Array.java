/*
Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex12Array {
    Scanner sc = new Scanner(System.in);
    
    int [] array = new int [5];
    
    int[] leerArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un num");
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    int suma(){
        int resSum = 0;
        for (int i = 0; i < array.length; i++) {
            resSum += array[i];
        }
        return resSum;
        
    }
    
    double media (){
        return (suma()/array.length);
    }
    
    public static void main(String[] args) {
        Ex12Array ob = new Ex12Array();
        

        ob.leerArray();
        ob.suma();
        ob.media();
        System.out.println("La suma es " + ob.suma());
        System.out.println("Y la media es " + ob.media());
    }
}
