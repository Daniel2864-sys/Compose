package api.payload.tata.proposalCompose;

public class PAddress {
	String country;
	String line1;
	String line2;
	String state;
	String city;
	String pincode;

	public PAddress(String country, String line1, String line2, String state, String city, String pincode) {
		super();
		this.country = country;
		this.line1 = line1;
		this.line2 = line2;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
