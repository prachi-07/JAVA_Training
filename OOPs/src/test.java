

import lti.lib.Book;
import lti.lib.Member;

public class test {

	public static void main(String[] args) {
		Book alc = new Book("The Alchemist");
		Member m1 = new Member("Polo");
		
		m1.getBook();
		alc.issueBook(m1);
		
		m1.getBook();
		alc.issueBook(m1);
		
		alc.returnBook(m1);
		m1.getBook();
		
		alc.returnBook(m1);
		m1.getBook(); 
		
		
		
	}

}
