package melissa.api

class Response {

	static void readResponse(String responseString){
		println responseString;
		def response = new XmlSlurper().parseText(responseString);
		
		response.Records.ResponseRecord.children().each{ele ->
			if(!ele.text().isEmpty())
				println ele.name() + ": " + ele.text();
		}
		
		printResults(response.Records.ResponseRecord.Results.text());
		printGeneralResults(response.TransmissionResults.text());
	};

	private static void printResults(String resultCodesList) {
		String[] resultCodes = resultCodesList.split(",");
		for(int i = 0; i < resultCodes.length; i++) {
			//println resultCodes[i];
			switch(resultCodes[i]) {
				case("AE01"):
					println(resultCodes[i] + ": Zip Code Error;  ");
					break;
				case("AE02"):
					println(resultCodes[i] + ": Unknown Street;  ");
					break;
				case("AE03"):
					println(resultCodes[i] + ": Component Error;  ");
					break;
				case("AE04"):
					println(resultCodes[i] + ": Non-Deliverable Address;  ");
					break;
				case("AE05"):
					println(resultCodes[i] + ": Address Matched to Multiple Records;  ");
					break;
				case("AE06"):
					println(resultCodes[i] + ": Address Matched to Early Warning System;  ");
					break;
				case("AE07"):
					println(resultCodes[i] + ": Empty Address Input;  ");
					break;
				case("AE08"):
					println(resultCodes[i] + ": Suite Range Error;  ");
					break;
				case("AE09"):
					println(resultCodes[i] + ": Suite Range Missing;  ");
					break;
				case("AE10"):
					println(resultCodes[i] + ": Primary Range Error;  ");
					break;
				case("AE11"):
					println(resultCodes[i] + ": Primary Range Missing;  ");
					break;
				case("AE12"):
					println(resultCodes[i] + ": Box Number Error from PO Box or RR;  ");
					break;
				case("AE13"):
					println(resultCodes[i] + ": PO Box Number Missing from PO Box or RR;  ");
					break;
				case("AE14"):
					println(resultCodes[i] + ": Input Address Matched to CMRA but secondary number not present;  ");
					break;
				case("AE17"):
					println(resultCodes[i] + ": A suite number was entered but no suite information found for primary address; ");
					break;
				case("AS01"):
					println(resultCodes[i] + ": Address matched to postal database;  ");
					break;
				case("AS02"):
					println(resultCodes[i] + ": Address matched to non-postal database;  ");
					break;
				case("AS03"):
					println(resultCodes[i] + ": Address not deliverable by USPS, but exists;  ");
					break;
				case("AS09"):
					println(resultCodes[i] + ": Foreign Postal Code Detected;  ");
					break;
				case("AS10"):
					println(resultCodes[i] + ": Address matched to CMRA;  ");
					break;
				case("AS11"):
					println(resultCodes[i] + ": Address Vacant;  ");
					break;
				case("AS12"):
					println(resultCodes[i] + ": Address has been updated by the Move action;  ");
					break;
				case("AS13"):
					println(resultCodes[i] + ": Address Updated By LACS;  ");
					break;
				case("AS14"):
					println(resultCodes[i] + ": Address Updated By Suite Link;  ");
					break;
				case("AS15"):
					println(resultCodes[i] + ": Address Updated By AddressPlus;  ");
					break;
				case("AS16"):
					println(resultCodes[i] + ": Address is vacant;  ");
					break;
				case("AS17"):
					println(resultCodes[i] + ": Alternate delivery;  ");
					break;
				case("AS18"):
					println(resultCodes[i] + ": Artificially created adresses detected,DPV processing terminated at this point;  ");
					break;
				case("AS20"):
					println(resultCodes[i] + ": Address Deliverable by USPS only;  ");
					break;
				case("AS23"):
					println(resultCodes[i] + ": Extraneous information found;  ");
					break;
				case("AC01"):
					println(resultCodes[i] + ": ZIP Code Change;  ");
					break;
				case("AC02"):
					println(resultCodes[i] + ": State Change;  ");
					break;
				case("AC03"):
					println(resultCodes[i] + ": City Change;  ");
					break;
				case("AC04"):
					println(resultCodes[i] + ": Base/Alternate Change;  ");
					break;
				case("AC05"):
					println(resultCodes[i] + ": Alias Name Change;  ");
					break;
				case("AC06"):
					println(resultCodes[i] + ": Address1/Address2 Swap;  ");
					break;
				case("AC07"):
					println(resultCodes[i] + ": Address1/Company Swap;  ");
					break;
				case("AC08"):
					println(resultCodes[i] + ": Plus4 Change;  ");
					break;
				case("AC09"):
					println(resultCodes[i] + ": Urbanization Change;  ");
					break;
				case("AC10"):
					println(resultCodes[i] + ": Street Name Change;  ");
					break;
				case("AC11"):
					println(resultCodes[i] + ": Street Suffix Change;  ");
					break;
				case("AC12"):
					println(resultCodes[i] + ": Street Directional Change;  ");
					break;
				case("AC13"):
					println(resultCodes[i] + ": Suite Name Change;  ");
					break;
				case("AC14"):
					println(resultCodes[i] + ": The suite unit number was changed or appended;  ");
					break;
				case("ES01"):
					println(resultCodes[i] + ": Email domain name confirmed as valid;  ");
					break;
				case("ES02"):
					println(resultCodes[i] + ": Invalid Email domain;  ");
					break;
				case("ES03"):
					println(resultCodes[i] + ": Unverified Email domain;  ");
					break;
				case("ES04"):
					println(resultCodes[i] + ": Mobile Email address;  ");
					break;
				case("ES10"):
					println(resultCodes[i] + ": Syntax changed;  ");
					break;
				case("ES11"):
					println(resultCodes[i] + ": Top level domain changed;  ");
					break;
				case("ES12"):
					println(resultCodes[i] + ": Domain changed(spelling);break;  ");
					break;
				case("ES13"):
					println(resultCodes[i] + ": Domain changed(update);break;  ");
					break;
				case("EE01"):
					println(resultCodes[i] + ": Syntax error;  ");
					break;
				case("EE02"):
					println(resultCodes[i] + ": Top level domain not found;  ");
					break;
				case("EE03"):
					println(resultCodes[i] + ": Mail server not found;  ");
					break;
				case("EE04"):
					println(resultCodes[i] + ": Invalid mailbox name;  ");
					break;
				case("EE05"):
					println(resultCodes[i] + ": Email object not initialized;  ");
					break;
				case("PS01"):
					println(resultCodes[i] + ": Phone number matched to 10 digit level;  ");
					break;
				case("PS02"):
					println(resultCodes[i] + ": Phone number matched to 7 digit level;  ");
					break;
				case("PS03"):
					println(resultCodes[i] + ": Corrected area code;  ");
					break;
				case("PS04"):
					println(resultCodes[i] + ": Phone number outside demo range;  ");
					break;
				case("PS05"):
					println(resultCodes[i] + ": Database is expired;  ");
					break;
				case("PS06"):
					println(resultCodes[i] + ": Updated area code;  ");
					break;
				case("PS07"):
					println(resultCodes[i] + ": Phone number on a cellular line;  ");
					break;
				case("PS08"):
					println(resultCodes[i] + ": Phone number on a land line;  ");
					break;
				case("PS09"):
					println(resultCodes[i] + ": Phone number on a VOIP line;  ");
					break;
				case("PS10"):
					println(resultCodes[i] + ": Phone number is a residential;  ");
					break;
				case("PS11"):
					println(resultCodes[i] + ": Phone number is a business;  ");
					break;
				case("PS12"):
					println(resultCodes[i] + ": Phone number is a SOHO;  ");
					break;
				case("PE01"):
					println(resultCodes[i] + ": Bad area code;  ");
					break;
				case("PE02"):
					println(resultCodes[i] + ": Blank phone number;  ");
					break;
				case("PE03"):
					println(resultCodes[i] + ": Bad phone number;  ");
					break;
				case("PE04"):
					println(resultCodes[i] + ": Multiple match;  ");
					break;
				case("PE05"):
					println(resultCodes[i] + ": Bad prefix;  ");
					break;
				case("PE06"):
					println(resultCodes[i] + ": Bad zip code;  ");
					break;
				case("VR01"):
					println(resultCodes[i] + ": Individual name and address match;  ");
					break;
				case("VR02"):
					println(resultCodes[i] + ": Individual name and phone match;  ");
					break;
				case("VR03"):
					println(resultCodes[i] + ": Individual name and email match;  ");
					break;
				case("VR04"):
					println(resultCodes[i] + ": Address and phone match;  ");
					break;
				case("VR05"):
					println(resultCodes[i] + ": Address and email match;  ");
					break;
				case("VR06"):
					println(resultCodes[i] + ": Phone and email match;  ");
					break;
				case("VR07"):
					println(resultCodes[i] + ": Organization name and address match;  ");
					break;
				case("VR08"):
					println(resultCodes[i] + ": Organization name and phone match;  ");
					break;
				case("VR09"):
					println(resultCodes[i] + ": Organization name and email match;	");
					break;
				case("VR10"):
					println(resultCodes[i] + ": Organization name and individual name match;	");
					break;
				case("VS00"):
					println(resultCodes[i] + ": Address not found in reference data;	");
					break;
				case("VS01"):
					println(resultCodes[i] + ": Match made to historical address;	");
					break;
				case("VS02"):
					println(resultCodes[i] + ": Match made to partial address (secondary range problems);   ");
					break;
				case("VS12"):
					println(resultCodes[i] + ": Match made to partial name (last name only);   ");
					break;
				case("VS13"):
					println(resultCodes[i] + ": Match made to partial name (first name only);   ");
					break;
				case("VS22"):
					println(resultCodes[i] + ": Match made to partial organization name;   ");
					break;
				case("VS30"):
					println(resultCodes[i] + ": Phone not found in reference data;   ");
					break;
				case("VS31"):
					println(resultCodes[i] + ": Match made to historical phone;   ");
					break;
				case("VS40"):
					println(resultCodes[i] + ": Email not found in reference data;   ");
					break;
				case("VS41"):
					println(resultCodes[i] + ": Match made to historical address;   ");
					break;
				case("GS01"):
					println(resultCodes[i] + ": Geocoded to Zip+4 or the full 6-digit postal code centroid;  ");
					break;
				case("GS02"):
					println(resultCodes[i] + ": Geocoded to Zip+2 centroid;  ");
					break;
				case("GS03"):
					println(resultCodes[i] + ": Geocoded to 5 digit (U.S.) or 3 digit (Canada) zip code centroid;  ");
					break;
				case("GS05"):
					println(resultCodes[i] + ": Geocoded to rooftop level;  ");
					break;
				case("GS06"):
					println(resultCodes[i] + ": Geocoded to interpolated rooftop level;  ");
					break;
				case("GE01"):
					println(resultCodes[i] + ": Invalid zip code entered;  ");
					break;
				case("GE02"):
					println(resultCodes[i] + ": Zip code not found;	");
					break;
				case("GE03"):
					println(resultCodes[i] + ": Demo mode;	");
					break;
				case("GE04"):
					println(resultCodes[i] + ": Data files expired;   ");
					break;
				case("GE05"):
					println(resultCodes[i] + ": License is not enabled for this country;   ");
					break;
				case("DA00"):
					println(resultCodes[i] + ": Address appended;   ");
					break;
				case("DA10"):
					println(resultCodes[i] + ": Name appended;   ");
					break;
				case("DA20"):
					println(resultCodes[i] + ": Company appended;   ");
					break;
				case("DA30"):
					println(resultCodes[i] + ": Phone appended;   ");
					break;
				case("DA40"):
					println(resultCodes[i] + ": Email appended;   ");
					break;
			}
		}
	}

	// Output General XML Results
	private static void printGeneralResults(String resultCodesList) {
		String[] resultCodes = resultCodesList.split(",");

		if(!resultCodes[0].equals(""))
		{
			switch(resultCodes[0])
			{
				case("SE01"):
					println(resultCodes[0] + ": Web Service Internal Error;  ");
					break;
				case("GE01"):
					println(resultCodes[0] + ": Empty XML Request Structure;  ");
					break;
				case("GE02"):
					println(resultCodes[0] + ": Empty XML Request Record Structure;  ");
					break;
				case("GE03"):
					println(resultCodes[0] + ": Counted records send more than number of records allowed per request;  ");
					break;
				case("GE04"):
					println(resultCodes[0] + ": CustomerID empty;  ");
					break;
				case("GE05"):
					println(resultCodes[0] + ": CustomerID not valid;  ");
					break;
				case("GE06"):
					println(resultCodes[0] + ": CustomerID disabled;  ");
					break;
				case("GE07"):
					println(resultCodes[0] + ": XML Request invalid;  ");
					break;
				case("GE20"):
					println(resultCodes[0] + ": Verify package not activated;  ");
					break;
				case("GE21"):
					println(resultCodes[0] + ": Append package not activated;  ");
					break;
				case("GE22"):
					println(resultCodes[0] + ": Move package not activated;  ");
					break;
				case("GE23"):
					println(resultCodes[0] + ": No Valid Action Requested;  ");
					break;
			}
		}
	}
}
