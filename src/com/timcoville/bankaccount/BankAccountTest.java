package com.timcoville.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println(b.getCheckingBalance());
		b.depositChecking(500.50);
		b.depositSavings(1200.75);
		System.out.println(b.getCheckingBalance());
		System.out.println(b.getSavingsBalance());
		b.depositChecking(500.50);
		b.bankDeposits();
		BankAccount b2 = new BankAccount();
		b2.depositChecking(500.33);
		b.bankDeposits();
		Object w1 = b2.withdrawChecking(50);
		System.out.println(w1);
		b.bankDeposits();
	}
}
