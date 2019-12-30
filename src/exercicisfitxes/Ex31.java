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
public class Ex31 {
    String respuesta;
    String orden (int array []){
        int k = array[0];
        int j = 0;
        int w = 0;
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            
            if (array[i]<k){
                j += array[i];
            }
            if (array[i]>k){
                w += array[i];  
            }
        }
        
        if (sum == j || sum == w){
            if (sum == j){
                respuesta = "Disminuye";
            }
            if (sum == w){
                respuesta = "Crece";
            }
        }
        else{
            respuesta = "No estan ordenados";
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Ex31 ob = new Ex31();
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escribe un numero");
            array[i] = sc.nextInt();
        }
        
        System.out.println(ob.orden(array));
    }
}
