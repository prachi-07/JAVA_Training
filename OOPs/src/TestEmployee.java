import lti.org.Employee;
import lti.org.Executive;
import lti.org.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee("Polo",5000); e1.payslip();
		 */
		Manager mgr = new Manager("Lili", 7000, 2000);
		showSalary(mgr);

		Executive exe = new Executive("Lilii", 7000, 3000);
		showSalary(exe);

	}

	/*private static void showSalary(Employee emp) {
		System.out.println("Employee Salary : " + emp.getSalary());
	}*/
	
	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary : " + emp.getSalary());
		else
			System.out.println("Executive Salary : " + emp.getSalary());
	}
	/*
	 * private static void showSalary(Manager mgr) {
	 * System.out.println("Manager Salary " + mgr.getSalary()); }
	 * 
	 * private static void showSalary(Executive exe) {
	 * System.out.println("Executive Salary " + exe.getSalary()); }
	 */

}
