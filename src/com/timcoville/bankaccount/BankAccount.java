package com.timcoville.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber = "";
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	
	private static Integer numOfAccounts = 0;
	private static double bankBalance = 0;
	
	public BankAccount () {
		numOfAccounts++;
		createAccountNumber();
	}
	
	private void createAccountNumber() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			accountNumber += rand.nextInt(10);
		}
		System.out.println(accountNumber);
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void depositChecking(double checkingBalance) {
		this.checkingBalance = checkingBalance;
		bankBalance += checkingBalance;
		System.out.println("New Bank Balance: " + bankBalance);
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void depositSavings(double savingsBalance) {
		this.savingsBalance = savingsBalance;
		bankBalance += savingsBalance;
		System.out.println("New Bank Balance: " + bankBalance);
	}
	
	public Object withdrawSavings(double amount) {
		if (savingsBalance < amount) {
			return "Sorry, not enough funds in savings";
		}
		savingsBalance -= amount;
		bankBalance -= amount;
		System.out.println("New Savings Balance: " + savingsBalance);
		return (Double) amount;
	}
	
	public Object withdrawChecking(double amount) {
		if (checkingBalance < amount) {
			return "Sorry, not enough funds in checking";
		}
		savingsBalance -= amount;
		bankBalance -= amount;
		System.out.println("New Checking Balance: " + checkingBalance);
		return (Double) amount;
	}
	
	public double getTotalBalance() {
		double total = savingsBalance + checkingBalance;
		return total;
	}
	
	public void bankDeposits() {
		System.out.println("Number of Accounts: " + numOfAccounts + ". Total Bank Deposits: " + bankBalance);
	}
	
}
