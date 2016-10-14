package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/14/16.
 */
public class Snake extends Animal {
    public Snake(String n, int a, String g) {
        super(n, a, g);
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
        Exhibits newSign = Exhibits.valueOf("snake".toUpperCase());
        place=newSign.getLocation();

        anim.add("Animal Specie : SNAKE "+"\n"+"Name: " + name + "\n"
                + "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Exhibit: "+place + "\n");
        Menu.menu();
    }
}
