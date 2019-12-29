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
public class Ex31Mal {
    String respuesta;
    String orden (int array []){
        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<k){
                k = array[i];
                if ((array[i-1])<k){
                    respuesta = "Disminuye";
                }
            }
            else{
                if (array[i]>k){
                k = array[i];
                if (array[i-1]>k){
                    respuesta = "Crece";
                }
            }
            }
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Ex31Mal ob = new Ex31Mal();
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escribe un numero");
            array[i] = sc.nextInt();
        }
        
        System.out.println(ob.orden(array));
    }
}
