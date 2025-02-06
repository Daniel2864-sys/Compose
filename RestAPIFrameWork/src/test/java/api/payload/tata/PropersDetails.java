package api.payload.tata;

public class PropersDetails {
String	proposer_address_line1;
String	proposer_address_line2;
String	proposer_address_line3;
String	proposer_pincode;

public PropersDetails(String proposer_address_line1, String proposer_address_line2, String proposer_address_line3,
		String proposer_pincode) {
	super();
	this.proposer_address_line1 = proposer_address_line1;
	this.proposer_address_line2 = proposer_address_line2;
	this.proposer_address_line3 = proposer_address_line3;
	this.proposer_pincode = proposer_pincode;
}
public String getProposer_address_line1() {
	return proposer_address_line1;
}
public void setProposer_address_line1(String proposer_address_line1) {
	this.proposer_address_line1 = proposer_address_line1;
}
public String getProposer_address_line2() {
	return proposer_address_line2;
}
public void setProposer_address_line2(String proposer_address_line2) {
	this.proposer_address_line2 = proposer_address_line2;
}
public String getProposer_address_line3() {
	return proposer_address_line3;
}
public void setProposer_address_line3(String proposer_address_line3) {
	this.proposer_address_line3 = proposer_address_line3;
}
public String getProposer_pincode() {
	return proposer_pincode;
}
public void setProposer_pincode(String proposer_pincode) {
	this.proposer_pincode = proposer_pincode;
}


}
