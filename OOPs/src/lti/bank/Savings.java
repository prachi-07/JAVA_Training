package lti.bank;

public class Savings extends Account {

	public Savings() {

	}
   
	public Savings(String holder) { 
		super(holder, MIN_SAV_BAL); 
		txns[idx++] = new Transaction("OB", balance, balance);
	}  
 
	@Override
	public void withdraw(double amount) throws BanlanceException {
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			txns[idx++] = new Transaction("Dr", amount, balance);
		} else
			throw new BanlanceException("Insufficient fund");
	}

}
