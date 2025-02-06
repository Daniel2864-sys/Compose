package api.payload.tata;

public class InsuredDetails {
	String insured_title;
	String insured_first_name;
	String insured_middle_name;
	String insured_last_name;
	String insured_mobile;
	String insured_email;
	String insured_name;
	public String getInsured_name() {
		return insured_name;
	}
	public void setInsured_name(String insured_name) {
		this.insured_name = insured_name;
	}
	public InsuredDetails(String insured_title, String insured_first_name, String insured_middle_name,
			String insured_last_name,String insured_name, String insured_mobile, String insured_email) {
		super();
		this.insured_title = insured_title;
		this.insured_first_name = insured_first_name;
		this.insured_middle_name = insured_middle_name;
		this.insured_last_name = insured_last_name;
		this.insured_name=insured_name;
		this.insured_mobile = insured_mobile;
		this.insured_email = insured_email;
	}
	public String getInsured_title() {
		return insured_title;
	}
	public void setInsured_title(String insured_title) {
		this.insured_title = insured_title;
	}
	public String getInsured_first_name() {
		return insured_first_name;
	}
	public void setInsured_first_name(String insured_first_name) {
		this.insured_first_name = insured_first_name;
	}
	public String getInsured_middle_name() {
		return insured_middle_name;
	}
	public void setInsured_middle_name(String insured_middle_name) {
		this.insured_middle_name = insured_middle_name;
	}
	public String getInsured_last_name() {
		return insured_last_name;
	}
	public void setInsured_last_name(String insured_last_name) {
		this.insured_last_name = insured_last_name;
	}
	public String getInsured_mobile() {
		return insured_mobile;
	}
	public void setInsured_mobile(String insured_mobile) {
		this.insured_mobile = insured_mobile;
	}
	public String getInsured_email() {
		return insured_email;
	}
	public void setInsured_email(String insured_email) {
		this.insured_email = insured_email;
	}
	

}
