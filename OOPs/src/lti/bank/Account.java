/**
 * 
 * This class is represents generalised Bank account.
 * @author Sangita Padshala
 * @version 1.0
 * 
 */
package lti.bank;

public abstract class Account implements Bank {
	private int actNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected int idx;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.actNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating transaction array for the account
		txns = new Transaction[10];
		// Adding opening account transaction

	}

	public void summary() {
		System.out.println("A/C No: " + actNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("Cr", amount, balance);
	}

	// public abstract void withdraw(double amount);

	/*
	 * { if (amount <= balance) balance -= amount; else
	 * System.out.println("Insufficient funds!"); }
	 */
	public void statement() {
		System.out.println("Statement of A/C: " + actNo);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i]);
	}

}
