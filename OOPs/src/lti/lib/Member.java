package lti.lib;

public class Member {
	private String name;
	private Book b;

	public Member() {

	}

	public Member(String s) {
		this.name = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public void getBook() {
		if (b!=null) {
			System.out.println(name + " issued "+b.getTitle());
		} else {
			System.out.println(name+" not issued any book");
		}

	}
}