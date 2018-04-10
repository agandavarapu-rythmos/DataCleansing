package cleanse

import data.*;
import melissa.api.*;

class Cleansing {

	static def contactList = ContactsList.getContactsList();

	public static void main(args) {
		for(contact in contactList){
			String response = Request.sendRequest(contact);
			Response.readResponse(response);
		}
	}
}
