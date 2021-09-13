import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double P = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int t = scanner.nextInt();

        double A = P * (1 + (r/100) * t);

        System.out.println(String.format("After %s years at %s%%, the investment will be worth $%.2f.",
                t, r, A));
    }
}
