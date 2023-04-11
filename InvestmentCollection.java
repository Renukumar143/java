package file;
import java.util.Scanner;

interface InterestCalculator {
    double calculateInterest(double p, int n, double r);
}

class SimpleInterest implements InterestCalculator {
    public double calculateInterest(double p, int n, double r) {
        return (p * n * r) / 100;
    }
}

class CompoundInterest implements InterestCalculator {
    public double calculateInterest(double p, int n, double r) {
        return p * Math.pow(1 + r / 100, n) - p;
    }
}

public class InvestmentCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Fixed Deposit Amount: ");
        double p = scanner.nextDouble();

        System.out.print("Please enter the Duration of deposit in years: ");
        int n = scanner.nextInt();

        System.out.print("Is interest cumulative or simple? (c/s): ");
        String interestType = scanner.next();

        InterestCalculator calculator;
        if (interestType.equals("c")) {
            calculator = new CompoundInterest();
        } else {
            calculator = new SimpleInterest();
        }

        double r = 6.5; // interest rate assumed as 6.5%
        double interest = calculator.calculateInterest(p, n, r);

        System.out.printf("Interest amount: Rs. %.2f%n", interest);
        System.out.printf("Total amount at maturity: Rs. %.2f%n", p + interest);

        scanner.close();
    }
}

