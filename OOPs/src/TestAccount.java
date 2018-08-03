
import lti.bank.AccountFactory;
import lti.bank.Bank;
import lti.bank.BanlanceException;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 * Account ac = new Account("Polo", 5000); ac.summary();
		 * 
		 * ac.deposit(3000); System.out.println(ac.getBalance());
		 * 
		 * ac.withdraw(4000); System.out.println(ac.getBalance());
		 * 
		 * ac.withdraw(7000);
		 * 
		 */
		/*
		 * Savings sa = new Savings("polo"); sa.summary();
		 * 
		 * sa.withdraw(1000);
		 */
		/*
		 * Current c = new Current("Polo"); c.summary(); c.withdraw(3000);
		 * c.withdraw(7000);
		 * 
		 * c.summary(); c.deposit(2000); c.deposit(4000);
		 * 
		 * 
		 * c.summary();
		 */
		Bank sav = AccountFactory.openAccount("current", "Polo");
		// sav.summary();

		sav.deposit(2000);
		sav.deposit(4000);

		try {
			 sav.withdraw(3000);
			sav.withdraw(7000);
		} catch (BanlanceException e) {
			//e.printStackTrace(); //for developers to troubleshoot
			//System.out.println(e); // for logging purpose to audit
			System.out.println(e.getMessage());//for end users
		}

		sav.statement();

	}
 
}
