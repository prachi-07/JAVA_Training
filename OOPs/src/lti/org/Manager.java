package lti.org;

public class Manager extends Employee {
	private double commission;

	public Manager() {

	}

	public Manager(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Comission : "+commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}

}
