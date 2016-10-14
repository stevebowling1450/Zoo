package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Animal extends Zoo {


    static String exhibit;
    static String species;

    public Animal(String n, int a, String g, String e, String s) {
        super(n, a, g);
        exhibit = e;
        species = s;
    }


    public static void animalinfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the animal's name?");
        name = sc.nextLine();
        System.out.println("What is the animal's gender?");
        gender = sc.nextLine();
        System.out.println("What Exhibit is this animal in?");
        exhibit = sc.nextLine();
        System.out.println("What specie is this animal?");
        species = sc.nextLine();
        System.out.println("What is the animal's age?");
        age = sc.nextInt();
        Menu.menu();

        Animal a1 = new Animal(name, age, gender, exhibit, species);
        //System.out.println("ANIMAL INFO:");
        //System.out.println(a1.displayInfo());

        anim.add("Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Species:" + species +
                "\n" + "Exhibit " + exhibit+ "\n");



    }


    public String displayInfo() {
        return "Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Species:" + species +
                "\n" + "Exhibit " + exhibit;


    }
}
