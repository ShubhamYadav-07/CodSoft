package CodSoft;

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupees");
        System.out.println("2. Rupees to USD");
        System.out.println("3. Euro to Rupees");
        System.out.println("4. Rupees to Euro");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = sc.nextDouble();
            double Rupees = usdToRupees(USD);
            System.out.println("Converted amount in Rupee: " + Rupees);
        } else if (choice == 2) {
            System.out.print("Enter the amount in Rupees: ");
            double Rupees = sc.nextDouble();
            double USD = RupeesToUsd(Rupees);
            System.out.println("Converted amount in USD: " + USD);
        } else if (choice == 3) {
            System.out.print("Enter the amount in EURO: ");
            double EURO = sc.nextDouble();
            double Rupees = euroToRupees(EURO);
            System.out.println("Converted amount in USD: " + Rupees);
        } else if (choice == 4) {
            System.out.print("Enter the amount in Rupees: ");
            double Rupees = sc.nextDouble();
            double EURO = RupeesToEuro(Rupees);
            System.out.println("Converted amount in USD: " + EURO);
        }

        else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }

        sc.close();
    }

    public static double usdToRupees(double USD) {
        return USD * 83.47; // Date: 01/05/24
    }

    public static double RupeesToUsd(double Rupees) {
        return Rupees * 0.0119804; // Date 01/05/2024
    }

    public static double euroToRupees(double EURO) {
        return EURO * 89.10; // Date: 01/05/24
    }

    public static double RupeesToEuro(double Rupees) {
        return Rupees * 0.0113; // Date: 01/05/24
    }

}