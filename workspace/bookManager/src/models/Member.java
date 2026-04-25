package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Member {
	private int memberId;
	private String firstName;
	private String lastName;
	private String memberEmail;
	private String dob;
	private LocalDate membershipDate;
	private List<Book> checkedOutBooks;

	
	public Member(int id, String first, String last, String email, String dob) {
		this.memberId = id;
		this.firstName = first;
		this.lastName = last;
		this.memberEmail = email;
		this.dob = dob;
		this.membershipDate = LocalDate.now();
		this.checkedOutBooks = new ArrayList<>();
		
	}
}
