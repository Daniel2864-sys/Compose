package api.payload.tata.proposalCompose;

public class Generic {
	String producer_name;
	String producer_email_id;
	String rm_code;
	String remarks;
	
	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getProducer_email_id() {
		return producer_email_id;
	}
	public void setProducer_email_id(String producer_email_id) {
		this.producer_email_id = producer_email_id;
	}
	public String getRm_code() {
		return rm_code;
	}
	public void setRm_code(String rm_code) {
		this.rm_code = rm_code;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Generic(String producer_name, String producer_email_id, String rm_code, String remarks) {
		super();
		this.producer_name = producer_name;
		this.producer_email_id = producer_email_id;
		this.rm_code = rm_code;
		this.remarks = remarks;
	}
	

}
