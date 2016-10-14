package _001Zoo;

import com.sun.tools.classfile.ReferenceFinder;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Visitor extends People{

       static int vPass;
        int v;
    public Visitor(String n, int a, String g, int p, int z, int v) {
        super(n, a, g, p, z);

        vPass=v;}
    public static void visitor(){
        int donx;
        Scanner sc= new Scanner(System.in);
        System.out.println("What do you want to do: \n 1 Enter your Visitor  Info. \n" +
                " 2 to View list of animals. \n 3 to View a list of Visitor.");
        donx=sc.nextInt();
        switch (donx){
            case 1: visitorinfo();
                break;
            case 2: Zoo.viewAnimals();
                break;
            case 3: Zoo.viewVisitor();
                break;
        }Menu.menu();


    }

    public static void visitorinfo() {
        System.out.println("VISITOR INFO:");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("What is your gender?");
        gender = sc.nextLine();
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("What is your Phone Number?");
        phone = sc.nextInt();
        System.out.println("What is your Zip code?");
        zip = sc.nextInt();
        System.out.println("What is your Visitor Pass Number?");
        vPass = sc.nextInt();


        visitor.add("Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Phone number: " + phone + "\n" +
                "Zip code: " + zip + "\n" +
                "Visitor Pass Number: " + vPass);


    }

}

