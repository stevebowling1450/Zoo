package _001Zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Animal extends Zoo {
    public Animal(String n, int a, String g) {
        super(n, a, g);
                        }

    public static void specie(){
        int type;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which Species of animal are you entering? \n 1. Lion \n 2. Bear \n 3. Snake ");
            type = sc.nextInt();

            switch (type) {
                case 1:
                    Lion.animalinfo();
                    break;
                case 2:
                    Bear.animalinfo();
                    break;
                case 3:
                    Snake.animalinfo();
                    break;
                default: System.out.println("Please enter a number from 1 to 3");
                    specie();
                    break;
            }
        }catch (InputMismatchException ime) {
            System.out.println("Please enter a number 1 to 3");
            specie();
        }
    }
}
