package lti.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
		txns[idx++] = new CurrentTransaction("OB",balance,balance,overdraft);

	} 

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void statement() {
		// System.out.println("Statement of A/C: " + actNo);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i]);
	}

	@Override
	public void withdraw(double amount) throws BanlanceException {
		if (amount <= (overdraft + balance)) {
			balance -= amount; 
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance = MIN_CUR_BAL;

				// Transaction("Dr", amount, balance);

			}
			txns[idx++] = new CurrentTransaction("cr", amount, balance, overdraft);
		} else {
			throw new BanlanceException("Insufficient fund");
		}

	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;
		}
		txns[idx++] = new CurrentTransaction("dr", amount, balance, overdraft);
 
	}
}