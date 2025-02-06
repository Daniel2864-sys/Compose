package api.payload.tata.proposalCompose;

public class CustomerDetails {
	String gstin_no;
	String client_email;
	String client_mobile_number;
	String account_number;
	String aadhar_number;
	String pan_number;
	String employee_id;
	boolean prop_flag;
	String prop_name;
	String landline_number;
	String lan_contract_no;
	
	public String getGstin_no() {
		return gstin_no;
	}
	public void setGstin_no(String gstin_no) {
		this.gstin_no = gstin_no;
	}
	public String getClient_email() {
		return client_email;
	}
	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}
	public String getClient_mobile_number() {
		return client_mobile_number;
	}
	public void setClient_mobile_number(String client_mobile_number) {
		this.client_mobile_number = client_mobile_number;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public boolean isProp_flag() {
		return prop_flag;
	}
	public void setProp_flag(boolean prop_flag) {
		this.prop_flag = prop_flag;
	}
	public String getProp_name() {
		return prop_name;
	}
	public void setProp_name(String prop_name) {
		this.prop_name = prop_name;
	}
	public String getLandline_number() {
		return landline_number;
	}
	public void setLandline_number(String landline_number) {
		this.landline_number = landline_number;
	}
	public String getLan_contract_no() {
		return lan_contract_no;
	}
	public void setLan_contract_no(String lan_contract_no) {
		this.lan_contract_no = lan_contract_no;
	}
	
	public CustomerDetails(String gstin_no, String client_email, String client_mobile_number, String account_number,
			String aadhar_number, String pan_number, String employee_id, boolean prop_flag, String prop_name,
			String landline_number, String lan_contract_no) {
		super();
		this.gstin_no = gstin_no;
		this.client_email = client_email;
		this.client_mobile_number = client_mobile_number;
		this.account_number = account_number;
		this.aadhar_number = aadhar_number;
		this.pan_number = pan_number;
		this.employee_id = employee_id;
		this.prop_flag = prop_flag;
		this.prop_name = prop_name;
		this.landline_number = landline_number;
		this.lan_contract_no = lan_contract_no;
	}

}
