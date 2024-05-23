package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please insert one of the following:");
            System.out.println("1. One-Player game");
            System.out.println("2. Two-Player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");
            System.out.println("Please insert your choice");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one player game\n");
                    break;
                case 2:
                    System.out.println("Start Two player game\n");
                    break;
                case 3:
                    System.out.println("Start Team game\n");
                    break;
                case 4:
                    System.out.println("Exit game\n");
                    break;
            }
        } while (choice !=4);

        System.out.println("Goodbye!");
    }
}