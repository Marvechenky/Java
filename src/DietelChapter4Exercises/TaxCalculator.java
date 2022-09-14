package DietelChapter4Exercises;

import java.util.Scanner;

public class TaxCalculator {
    private static Scanner input = new Scanner(System.in);
    private String name;
    private static double earnings;
    private static double rate;


    public static void calculateTax(){
        double tax;
        int numberOfCitizens = 1;
        double sumOfTax = 0.0;
        int citizen = 1;

        while (numberOfCitizens <= 3) {
            System.out.printf("Enter name of citizen %d: ", citizen);
            String name = input.nextLine();
            System.out.printf("Enter earnings of citizen %d: ", citizen);
            double earnings = input.nextDouble();
            input.nextLine();
            if(earnings <=30_000.00) tax = earnings * 0.15;
            else tax = earnings * 0.20;
            numberOfCitizens += 1;
            System.out.printf("The tax of citizen %d is %.2f : ", citizen, tax);
            System.out.println();
            lineSeparator();
            citizen++;
            sumOfTax = sumOfTax + tax;
        }
        System.out.println("The total tax for all three citizen is: "+ sumOfTax);
        lineSeparator();
    }


    public static void lineSeparator(){
        System.out.printf("===============================================%n");
    }


    public static void main(String[] args) {
        System.out.println("Welcome To Tax Calculator");
        lineSeparator();
        calculateTax();;
    }
}
