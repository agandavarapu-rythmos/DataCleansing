package melissa.api

import data.Contact

class Request {

	static String url;
	private static String httpAddress = "//personator.melissadata.net/v3/WEB/ContactVerify/doContactVerify?";

	//Strings for input data
	private static String transmissionReference = "TEST";
	private static String customerID = "";
	private static String mockcustomerID = "qazxsw" + customerID;
	private static String actions = "check";
	private static String columns;
	private static String options;
	private static String recordID;


	private static String buildRequestaddress(Contact con){
		String rest = "t=" + transmissionReference + "&"
		//rest += "id=" + customerID + "&"
		rest += "id=" + mockcustomerID + "&"
		rest += "act=" + actions + "&";
		//+ "cols=" + columns + "&"
		//+ "opt=" + options + "&"
		if(!con.firstName.isEmpty())
			rest += "first=" + con.firstName + "&"
		if(!con.lastName.isEmpty())
			rest +=  "last=" + con.lastName + "&"
		//+ "full=&"
		//+ "comp=" + tCompanyName.getText() + "&"
		if(!con.address.isEmpty())
			rest +=  "a1=" + con.address + "&"
		if(!con.address2.isEmpty())
			rest +=  "a2=" + con.address2 + "&"
		if(!con.city.isEmpty())
			rest +=  "city=" + con.city + "&"
		if(!con.state.isEmpty())
			rest +=  "state=" + con.state + "&"
		if(!con.zipcode.isEmpty())
			rest +=  "postal=" + con.zipcode + "&"
		if(!con.country.isEmpty())
			rest +=  "ctry=" + con.country + "&"
		//+ "lastlines=" + tLastLine.getText() + "&"
		//+ "freeform=&"
		if(!con.email.isEmpty())
			rest +=  "email=" + con.email + "&"
		if(!con.phoneNum.isEmpty())
			rest +=  "phone=" + con.phoneNum + "&"
		rest += "reserved=";

		URI uri = new URI("https", httpAddress + rest, null);
		return uri.toURL().toString()
	};

	static String sendRequest(Contact con){
		String request = buildRequestaddress(con);
		println request;
		return new URL(request).getText();
	};

}
