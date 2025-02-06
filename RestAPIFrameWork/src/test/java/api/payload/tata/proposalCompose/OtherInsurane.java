package api.payload.tata.proposalCompose;

public class OtherInsurane {
	String prev_policy_year;
	String insurer_name;
	String details_specify;
	String insurance_details_specify;

	public OtherInsurane(String prev_policy_year, String insurer_name, String details_specify,
			String insurance_details_specify) {
		super();
		this.prev_policy_year = prev_policy_year;
		this.insurer_name = insurer_name;
		this.details_specify = details_specify;
		this.insurance_details_specify = insurance_details_specify;
	}
	public String getPrev_policy_year() {
		return prev_policy_year;
	}
	public void setPrev_policy_year(String prev_policy_year) {
		this.prev_policy_year = prev_policy_year;
	}
	public String getInsurer_name() {
		return insurer_name;
	}
	public void setInsurer_name(String insurer_name) {
		this.insurer_name = insurer_name;
	}
	public String getDetails_specify() {
		return details_specify;
	}
	public void setDetails_specify(String details_specify) {
		this.details_specify = details_specify;
	}
	public String getInsurance_details_specify() {
		return insurance_details_specify;
	}
	public void setInsurance_details_specify(String insurance_details_specify) {
		this.insurance_details_specify = insurance_details_specify;
	}
	
}
