package DesignPattern;

public class TestPattern {

	public static void main(String[] args) {

		Client c = Stock.getSt();
		System.out.println("Client's Access: ");
		c.viewQuote(); 

		Stakeholder s = Stock.getSt();
		System.out.println("Stakeholder's Access: ");
 
		s.viewQuote();
		s.getQuote();

		Manager m = Stock.getSt();
		System.out.println("Manager's Access: ");

		m.getQuote();
		m.viewQuote();
		m.setQuote(); 
	}
}
