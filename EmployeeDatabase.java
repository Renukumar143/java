package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class EmployeeDatabase {

	private static final String FILE_PATH = "employees.properties";

	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			FileInputStream inputStream = new FileInputStream(FILE_PATH);
			properties.load(inputStream);
			inputStream.close();
		} catch (IOException e) {
			System.out.println("File not found. Creating a new one.");
		}

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Insert employee record");
			System.out.println("2. Update employee record");
			System.out.println("3. Select employee record");
			System.out.println("4. Delete employee record");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter employee number:");
				int empNo = scanner.nextInt();

				System.out.println("Enter employee name:");
				String empName = scanner.next();

				properties.setProperty(String.valueOf(empNo), empName);
				System.out.println("Employee record inserted successfully.");
				break;

			case 2:
				System.out.println("Enter employee number:");
				empNo = scanner.nextInt();

				if (properties.containsKey(String.valueOf(empNo))) {
					System.out.println("Enter employee name:");
					empName = scanner.next();

					properties.setProperty(String.valueOf(empNo), empName);
					System.out.println("Employee record updated successfully.");
				} else {
					System.out.println("Employee record not found.");
				}
				break;

			case 3:
				System.out.println("Enter employee number:");
				empNo = scanner.nextInt();

				if (properties.containsKey(String.valueOf(empNo))) {
					empName = properties.getProperty(String.valueOf(empNo));
					System.out.println("Employee name: " + empName);
				} else {
					System.out.println("Employee record not found.");
				}
				break;

			case 4:
				System.out.println("Enter employee number:");
				empNo = scanner.nextInt();

				if (properties.containsKey(String.valueOf(empNo))) {
					properties.remove(String.valueOf(empNo));
					System.out.println("Employee record deleted successfully.");
				} else {
					System.out.println("Employee record not found.");
				}
				break;

			case 5:
				try {
					FileOutputStream outputStream = new FileOutputStream(FILE_PATH);
					properties.store(outputStream, "Employee database");
					outputStream.close();
				} catch (IOException e) {
					System.out.println("Error saving data to file.");
				}
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
