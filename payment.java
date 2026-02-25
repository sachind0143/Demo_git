package com.paymentsystem;
interface pay {
	public void Payment();
}
abstract class payment {
	abstract public void processPayment();
}
class CreditCardPayment extends payment implements pay{
	public void processPayment() {
		System.out.println("Enter Your Credit Card Number: ");
	}
	public void Payment() {
		System.out.print("Successfully payment Done via CreditCard of:");
	}
}
class UPIPayment extends payment implements pay{
	public void processPayment() {
		System.out.println("Write Your UPI id");
	}
	public void Payment() {
		System.out.print("Successfully payment Done via upi of:");
	}
}

