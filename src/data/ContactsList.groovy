package data

class ContactsList {
	
	static def getContactsList() {
		def contactList = [];
		Contact v1 = new Contact("1","", "", "148 MADISO", "2-C", "", "", "10002", "", "", "");
		contactList << v1;
		return contactList
	}

	//Contact V1 = new Contact("1","", "", "148 MADISO", "2-C", "", "", "10002", "", "", "");
}
