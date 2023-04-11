package file;


import java.util.ArrayList;
import java.util.Scanner;

public class TaxProgram {
	public static void main(String[] args) {
		double gstRate = 0.18;
		double totalSellingPrice = 0.0;
		double totalGst = 0.0;

		ArrayList<String> productList = new ArrayList<String>();
		ArrayList<Double> priceList = new ArrayList<Double>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter product name (or 'e' to end): ");
			String productName = sc.next();
			if (productName.equalsIgnoreCase("e")) {
				break;
			}
			System.out.print("Enter selling price: ");
			double sellingPrice = sc.nextDouble();
			productList.add(productName);
			priceList.add(sellingPrice);
			double gst = sellingPrice * gstRate;
			totalSellingPrice += sellingPrice;
			totalGst += gst;
		}
		sc.close();

		// Print the bill details
		System.out.println("\n\nBILL DETAILS");
		System.out.println("============");
		for (int i = 0; i < productList.size(); i++) {
			System.out.printf("%-20s : Rs. %.2f%n", productList.get(i), priceList.get(i));
		}
		System.out.printf("%-20s : Rs. %.2f%n", "Total selling price", totalSellingPrice);
		System.out.printf("%-20s : Rs. %.2f%n", "Total GST", totalGst);
		System.out.printf("%-20s : Rs. %.2f%n", "Total bill amount", totalSellingPrice + totalGst);
	}
}



