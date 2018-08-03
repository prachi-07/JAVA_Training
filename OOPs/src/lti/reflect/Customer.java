package lti.reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("Stay away") {});
		System.out.println("Name: " + name);
	}

	@Override 
	public String toString() {
		return "Name: " + name;
	}

	// private void abc() {
	//
	// }

}
