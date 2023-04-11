package file;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double baseSalaryPerDay = sc.nextDouble();
		double salaryPerMonth = baseSalaryPerDay * 30;
		double totalPayDue = salaryPerMonth + (salaryPerMonth * 0.1); 
		System.out.printf("Salary per month: Rs. %.2f%n", salaryPerMonth);
		System.out.printf("Total pay due (including bonus): Rs. %.2f%n", totalPayDue);


	}

}
