/*
Escriba un programa Java que le lleve un año al usuario e imprima si ese año es bisiesto o no.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex9 {
        Scanner sc = new Scanner(System.in);
    public boolean añoBisiesto(int año, boolean resp){
        System.out.println("Escriba el año para saber si es bisiesto o no");
        año = sc.nextInt();
        
        if (año%4==0){
            resp = true;
        }
        if (resp==true){
            System.out.println("Es bisiesto");
        }
        else{
            System.out.println("No es bisiesto");
        }
        return resp;
    }
    public static void main(String[] args) {
        Ex9 ob = new Ex9();
        ob.añoBisiesto(0, false);
        
    }
}
