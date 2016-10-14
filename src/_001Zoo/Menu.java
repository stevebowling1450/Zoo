package _001Zoo;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Menu {
    public static void menu(){
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which are you? \n 1. Employee. \n 2. Visitor.");
        choose= sc.nextInt();
        if (choose==1){
            Employee.employee();

        }else if (choose==2){
            Visitor.visitor();


        }
    }
}
