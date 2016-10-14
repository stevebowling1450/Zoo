package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/14/16.
 */
public class Lion extends Animal{
    public Lion(String n, int a, String g) {
        super(n, a, g );
    }

    static String place;



    public static void animalinfo() {


        Scanner sc = new Scanner(System.in);
        System.out.println("What is the animal's name?");
        name = sc.nextLine();
        System.out.println("What is the animal's gender?");
        gender = sc.nextLine();
        System.out.println("What is the animal's age?");
        age = sc.nextInt();
        Exhibits newSign = Exhibits.valueOf("lion".toUpperCase());
        place=newSign.getLocation();

        //Animal a1 = new Animal(name, age, gender, exhibit);
        //System.out.println("ANIMAL INFO:");
        //System.out.println(a1.displayInfo());

        anim.add("Animal Specie : LION "+"\n"+"Name: " + name + "\n"
                + "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Exhibit: " + place + "\n");
        Menu.menu();
    }
}
