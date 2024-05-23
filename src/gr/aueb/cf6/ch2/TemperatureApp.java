package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isTempBelowZero = (temp < 0);

        System.out.println("Temperature is below zero:" + isTempBelowZero );
    }
}
