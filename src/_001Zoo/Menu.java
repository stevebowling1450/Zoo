package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Menu {
    public static void menu(){
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which are you? \n 1. Employee. \n 2. Visitor.\n 3. Exit");
        choose= sc.nextInt();
        switch (choose){
            case 1:  Employee.employee();
                break;
            case 2: Visitor.visitor();
                break;
            case 3: System.out.println("Thanks for coming to the Zoo.");
                break;
        }

    }
}
