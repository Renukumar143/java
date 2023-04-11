package file;


import java.util.Random;
import java.util.Scanner;

public class LossOfPay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double baseSalaryPerDay = sc.nextDouble();
		int absentDays = new Random().nextInt(5);
		double salaryPerMonth = baseSalaryPerDay * (30 - absentDays);
		double lostAmount = absentDays * baseSalaryPerDay;
		System.out.println("Salary per day: Rs." +baseSalaryPerDay);
		System.out.println("Number of days absent:"+ absentDays);
		System.out.println("Amount lost: Rs. "+lostAmount);
		System.out.println("That month's salary: Rs. "+ salaryPerMonth);
	}
}



