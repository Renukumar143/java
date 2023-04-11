package file;

import java.util.Scanner;

public class GSTCalculator {
	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
		String productName = name.next();
		double sellingPrice = name.nextDouble();

		// Calculate the GST and total bill amount
		double gst = sellingPrice * 0.18;
		double totalBill = sellingPrice + gst;

		// Print the bill details
		System.out.println("Product Name: " + productName);
		System.out.printf("Selling Price: Rs. %.2f%n", sellingPrice);
		System.out.printf("GST (18%%): Rs. %.2f%n", gst);
		System.out.printf("Total Bill Amount: Rs. %.2f%n", totalBill);
	}
}



