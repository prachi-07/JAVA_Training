

public class Person implements Cloneable{
	private String name;
	private int age;

	public Person() { 
		this("Anonymous", -1); 

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tage: " + age);
	}

	@Override
	public String toString() {
		return "name=" + name + ", age= " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && age == p.age)
				return true;

		}
		return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more");
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		// Person p = new Person("polo", 23);
		// p.print();
		// Person p1 = new Person("polo", 23);
		// Person p2 = new Person("san", 20);
		// p2.print();
		//
		// System.out.println(p2.hashCode());
		// System.out.println(p.hashCode());
		// System.out.println(p2);
		// System.out.println(p.equals(p2));
		// System.out.println(p.equals(p1));
		
		/*Person p = null;

		for (int c = 1; c <= 5; c++) {
			p = new Person(); 
		}
		System.gc();    //requesting gc'  
*/	
		Person p1= new Person("Polo",21);
		Person pc = (Person)p1.clone();
		
		System.out.println(pc);
	}

}
