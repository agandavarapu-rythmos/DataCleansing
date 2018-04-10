package data

class Contact {
	String uid;
	String firstName;
	String lastName;
	String address;
	String address2;
	String city;
	String state;
	String zipcode;
	String country;
	String phoneNum;
	String email;
	
	
	public Contact(String uid, String firstName, String lastName, String address,
			String address2, String city, String state, String zipcode,
			String country, String phoneNum, String email) {
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.phoneNum = phoneNum;
		this.email = email;		
	}
}
