package com.bridgelabz.lamdafunction;
import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		UserInputValidationTest userInputValidation = new UserInputValidationTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(UserInputValidationTest.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(UserInputValidationTest.isValidLastName(lastName) ? "Valid" : "In Valid");
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println(UserInputValidationTest.isValidEmail(email) ? "Valid" : "In Valid");
        System.out.println("Enter mobile number: ");
        String mobileNumber = scanner.next();
        System.out.println(UserInputValidationTest.isValidMobileNumber(mobileNumber) ? "Valid" : "In Valid");
        System.out.println("Enetr password: ");
        String password = scanner.next();
        System.out.println(UserInputValidationTest.isValidPassword(password) ? "Valid" : "In Valid");
        scanner.close();
	}
}    