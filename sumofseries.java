package file;

import java.util.Scanner;

public class sumofseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		String argss[]=new String[2];
		for(int i=0;i<2;i++)
		{
		      argss[i] = sc.next();
		}
		if (argss.length != 2) {
			System.out.println("Usage: java SeriesSum <x> <n>");
			System.exit(1);
		}

		double x = Double.parseDouble(argss[0]);
		int n = Integer.parseInt(argss[1]);

		double sum = 1;
		double term = 1;

		for (int i = 1; i <= n; i++) {
			term *= x / i;
			sum += term;
		}

		System.out.println("The sum of the series is: " + sum);
	}
}
