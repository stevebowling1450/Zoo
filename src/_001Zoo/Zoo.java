package _001Zoo;

import java.util.ArrayList;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Zoo {
    static ArrayList<String> visitor= new ArrayList<>();
    static ArrayList<String> people= new ArrayList<>();
  static ArrayList<String> anim= new ArrayList<>();
    public static void viewAnimals(){
        System.out.println(anim);}
    public static void viewVisitor(){
        System.out.println(visitor);}
    public static void viewEmployee(){
        System.out.println(people);
    }



  static  public int age;
   static public String name;
  static  public String gender;


    public Zoo(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String displayInfo() {
        return " Name: " + name + "\n"
                + " Age" + age + "\n" +
                " Gender: " + gender + "\n";
    }
}
