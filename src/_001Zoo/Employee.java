package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Employee extends People{
       static int employee;
       static String exhibit;

    public Employee(String n, int a, String g, int p, int z, int e,String x) {
        super(n, a ,g, p,z);
        employee=e;
        exhibit=x;}


    public static void employee(){
        int donx;
        Scanner sc= new Scanner(System.in);
        System.out.println("What do you want to do: \n 1 Enter employee Info. \n 2 Enter animal Info \n" +
                " 3 to View list of animals. \n 4 to View a list of Employees.");
        donx=sc.nextInt();
        if (donx==1){
            employeeinfo();
        }else if (donx==2){
            Animal.animalinfo();
        }else if (donx==3){
            Zoo.viewAnimals();
        }else if (donx==4){
            Zoo.viewEmployee();
        }Menu.menu();

    }




    public static void employeeinfo() {
        System.out.println("EMPLOYEE INFO:");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("What is your gender?");
        gender = sc.nextLine();
        System.out.println("What Exhibit do you work at?");
        exhibit = sc.nextLine();
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("What is your Phone Number?");
        phone = sc.nextInt();
        System.out.println("What is your Zip code?");
        zip = sc.nextInt();
        System.out.println("What is your Employee Number?");
        employee = sc.nextInt();


        Employee e1 = new Employee(name, age, gender, phone, zip, employee, exhibit);
        //System.out.println( e1.displayInfo());
        people.add("Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Phone number: " + phone + "\n" +
                "Zip code: " + zip + "\n" +
                "Employee number " + employee +
                "\n" + "Exhibit " + exhibit);


    }


    public String displayInfo() {
        return "Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Phone number: " + phone + "\n" +
                "Zip code: " + zip + "\n" +
                "Employee number " + employee +
                "\n" + "Exhibit " + exhibit;
    }
}



