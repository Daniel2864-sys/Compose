package api.payload.tata.proposalCompose;

public class KycData {
	String ckyc_number;
	String registered_name;
	   PAddress	p_address;
	   C_Address c_address;
	   String req_id;
	   boolean success;
	   String error_message;
	   String ckyc_remarks;
	   String age;
	   String FATHERS_NAME;
	   String KYC_DATE;
	   String UPDATED_DATE;
	   String idNum;
	   
	public String getCkyc_number() {
		return ckyc_number;
	}
	public void setCkyc_number(String ckyc_number) {
		this.ckyc_number = ckyc_number;
	}
	public String getRegistered_name() {
		return registered_name;
	}
	public void setRegistered_name(String registered_name) {
		this.registered_name = registered_name;
	}
	public PAddress getP_address() {
		return p_address;
	}
	public void setP_address(PAddress p_address) {
		this.p_address = p_address;
	}
	public C_Address getC_address() {
		return c_address;
	}
	public void setC_address(C_Address c_address) {
		this.c_address = c_address;
	}
	public String getReq_id() {
		return req_id;
	}
	public void setReq_id(String req_id) {
		this.req_id = req_id;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public String getCkyc_remarks() {
		return ckyc_remarks;
	}
	public void setCkyc_remarks(String ckyc_remarks) {
		this.ckyc_remarks = ckyc_remarks;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFATHERS_NAME() {
		return FATHERS_NAME;
	}
	public void setFATHERS_NAME(String fATHERS_NAME) {
		FATHERS_NAME = fATHERS_NAME;
	}
	public String getKYC_DATE() {
		return KYC_DATE;
	}
	public void setKYC_DATE(String kYC_DATE) {
		KYC_DATE = kYC_DATE;
	}
	public String getUPDATED_DATE() {
		return UPDATED_DATE;
	}
	public void setUPDATED_DATE(String uPDATED_DATE) {
		UPDATED_DATE = uPDATED_DATE;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
public KycData(String ckyc_number, String registered_name, PAddress p_address, C_Address c_address, String req_id,
		boolean success, String error_message, String ckyc_remarks, String age, String fATHERS_NAME, String kYC_DATE,
		String uPDATED_DATE, String idNum) {
	super();
	this.ckyc_number = ckyc_number;
	this.registered_name = registered_name;
	this.p_address = p_address;
	this.c_address = c_address;
	this.req_id = req_id;
	this.success = success;
	this.error_message = error_message;
	this.ckyc_remarks = ckyc_remarks;
	this.age = age;
	FATHERS_NAME = fATHERS_NAME;
	KYC_DATE = kYC_DATE;
	UPDATED_DATE = uPDATED_DATE;
	this.idNum = idNum;
}




}
