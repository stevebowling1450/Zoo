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
        for (int i = 0; i < anim.size(); i++)
        System.out.println(anim.get(i));}

    public static void viewVisitor(){
        for (int i = 0; i < visitor.size(); i++)
        System.out.println(visitor.get(i));}

    public static void viewEmployee(){
        for (int i = 0; i < people.size(); i++)
        System.out.println(people.get(i));
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

}
