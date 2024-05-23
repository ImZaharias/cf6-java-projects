package gr.aueb.cf.ch0;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start date (day month year): ");
        int startDay = scanner.nextInt();
        int startMonth = scanner.nextInt();
        int startYear = scanner.nextInt();

        System.out.println("Enter the end date (day month year): ");
        int endDay = scanner.nextInt();
        int endMonth = scanner.nextInt();
        int endYear = scanner.nextInt();

        scanner.close();

        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
        LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between the two dates: " + daysBetween);
    }
}