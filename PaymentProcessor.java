package com.paymentsystem;
import java.util.*;
@FunctionalInterface
interface validator{
	boolean validate (String details);
}
public class PaymentProcessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Payment Method ");
		String payMethod = sc.nextLine();
		
		System.out.print("Enter the Amount: ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		String details="";
//		String CreditC = "creditcard";
//		PayMethod = PayMethod.toLowerCase();
			if(payMethod.equals("creditcard")) {
				CreditCardPayment paycc = new CreditCardPayment();
				paycc.processPayment();
				System.out.print("");
				details = sc.nextLine();
				validator v = d-> d.matches("\\d{10}");
				if(v.validate(details)) {
					paycc.Payment();
					System.out.print(amount);
				}else {
					System.out.println("Invalid Credit Card Number");
				}
			}

			if(payMethod.equals("upi")) {
				UPIPayment payUpi = new UPIPayment();
				payUpi.processPayment();
				System.out.println("");
				details = sc.nextLine();
				validator upiCheck = d -> d.contains("@");
				if(upiCheck.validate(details)) {
					payUpi.Payment();
					System.out.print(amount);
				}else {
					System.out.println("Invalid UPI id");
				}
			}
		
		sc.close();
	}
	}
