/*
Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel or Consonant, depending on the user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */
package exercicisfitxes;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex8 {
    Scanner sc = new Scanner(System.in);
    public void caracter (String tipocar, String car){
        System.out.println("Escribe un caracter");
        car = sc.next();
        if (car.length()>1){
            System.out.println("Introduce un solo caracter");
        }else{

        if (car.equals(car.toLowerCase())){
            System.out.println("Es minuscula");
            switch (car){
                case "a":
                    System.out.println("Vocal");
                    break;
                case "e":
                    System.out.println("Vocal");
                    break;
                case "i":
                    System.out.println("Vocal");
                    break;
                case "o":
                    System.out.println("Vocal");
                    break;
                case "u":
                    System.out.println("Vocal");
                    break;
                default:
                    System.out.println("Consonante");
            }
        }
        if (car.equals(car.toUpperCase())){
            System.out.println("Es mayuscula");
            switch (car){
                case "A":
                    System.out.println("Vocal");
                    break;
                case "E":
                    System.out.println("Vocal");
                    break;
                case "I":
                    System.out.println("Vocal");
                    break;
                case "O":
                    System.out.println("Vocal");
                    break;
                case "U":
                    System.out.println("Vocal");
                    break;
                default:
                    System.out.println("Consonante");
                }
            }
        }
    }
    public static void main(String[] args) {
        Ex8 ob = new Ex8();
        ob.caracter("","");
    }
}
