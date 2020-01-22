package com.company;

import java.util.Scanner;

public class IffyLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean again = true;

        while (again) {
            System.out.println("Are you eyes red: (y/yes)");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                redEyes(true);//print method for true
                System.out.println("Would you like to continue");
                response = scan.nextLine();//if yes, restart loop. if no, end loop.
            } if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")) {
                redEyes(false);
                again = false;//stopping loop
            }
        }
    }

    public static void redEyes(boolean redEyes){
        if(redEyes = true){
            System.out.println("Get some sleep!");
        } else {
            System.out.println("You look great!");
        }
    }
}
