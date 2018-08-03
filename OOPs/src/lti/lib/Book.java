package lti.lib;

public class Book {
	private String title;
	private Member member;

	public Book() {

	}

	public Book(String s) {
		this.title = s;
	}

	public String getTitle() {
		return title;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void issueBook(Member m) {

		if (member != null) {
			System.out.println("Book issued to " + member.getName());
		} else {
			m.setB(this);
			this.member = m;
			System.out.println(title + " issued to " + m.getName());
		}

	}
/*
	public void MemberD() {
		if (b!=null) {
			System.out.println(name + " issued "+b.getTitle());
		} else {
			System.out.println(name+" not issued any book");
		}
*/
	public void returnBook(Member m) {
		if (member == null || !member.getName().equals(m.getName()) || m.getB() == null) {
			System.out.println(title+" not issued to "+m.getName());
		} else {
			m.setB(null);
			this.member= null;
			System.out.println(title +"is returned by "+m.getName());
		}
	}
}
