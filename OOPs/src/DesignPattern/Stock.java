package DesignPattern;

public class Stock implements Client, Stakeholder, Manager {
	private Stock() {
	}

	private static final Stock st = new Stock();

	public void viewQuote() {
		System.out.println("viewQuote access");
	}  

	public void getQuote() {
		System.out.println("getQuote access");
	}
 
	public void setQuote() {
		System.out.println("setQuote access");
	}

	public static Stock getSt() {
		return st;
	}
}