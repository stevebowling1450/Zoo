package _001Zoo;
import java.util.InputMismatchException;
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
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to do: \n 1 Enter employee Info. \n 2 Enter animal Info. \n" +
                    " 3 Enter Visitor Info. \n 4 to View list of animals. \n 5 to View a list of Employees.\n " +
                    "6 View Visitor Info.");
            donx = sc.nextInt();

            switch (donx) {
                case 1:
                    employeeinfo();
                    break;
                case 2:
                    Animal.specie();
                    break;
                case 3:
                    Visitor.visitorinfo();
                    break;
                case 4:
                    Zoo.viewAnimals();
                    break;
                case 5:
                    Zoo.viewEmployee();
                    break;
                case 6:
                    Zoo.viewVisitor();
                    break;
                default:
                    System.out.println("Please enter a number from 1 to 6");
                    employee();
                    break;
            }
            Menu.menu();
        }catch (InputMismatchException ime) {
            System.out.println("Please enter a number 1 to 6");
            employee();
        }
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

        people.add("Name: " + name + "\n"
                + "Age" + age + "\n" +
                "Gender: " + gender + "\n" +
                "Phone number: " + phone + "\n" +
                "Zip code: " + zip + "\n" +
                "Employee number " + employee +
                "\n" + "Exhibit " + exhibit);
    }

}



