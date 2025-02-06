package api.payload.tata.proposalCompose;

public class ProposalPayload {
	String quote_id;
	String pro_policy_start_dt;
	String insured_same_property;
	String other_insurance_declined;
		String sp_code;
	String part_branch;
	
	String part_employee_code;
	String part_employee_name;
	String q_emp_code;
	String proposer_accno;
	String proposer_loanno;
	String proposer_partno;
	String part_customer_id;
	String sol_id_rac;
	String add_field_1;
	String add_field_2;
	String sp_name;
	CustomerDetails customer_details;
	OtherInsurane other_insurance;
	ConstructionDetails construction_details;
	Generic generic;
	boolean isKYCVerified;
	KycData kyc_data;
	
	public ProposalPayload(String quote_id, String pro_policy_start_dt, String insured_same_property,
			String other_insurance_declined, String sp_code, String part_branch, String part_employee_code,
			String part_employee_name, String q_emp_code, String proposer_accno, String proposer_loanno,
			String proposer_partno, String part_customer_id, String sol_id_rac, String add_field_1, String add_field_2,
			String sp_name, CustomerDetails customer_details, OtherInsurane other_insurance,
			ConstructionDetails construction_details, Generic generic, boolean isKYCVerified, KycData kyc_data) {
		super();
		this.quote_id = quote_id;
		this.pro_policy_start_dt = pro_policy_start_dt;
		this.insured_same_property = insured_same_property;
		this.other_insurance_declined = other_insurance_declined;
		this.sp_code = sp_code;
		this.part_branch = part_branch;
		this.part_employee_code = part_employee_code;
		this.part_employee_name = part_employee_name;
		this.q_emp_code = q_emp_code;
		this.proposer_accno = proposer_accno;
		this.proposer_loanno = proposer_loanno;
		this.proposer_partno = proposer_partno;
		this.part_customer_id = part_customer_id;
		this.sol_id_rac = sol_id_rac;
		this.add_field_1 = add_field_1;
		this.add_field_2 = add_field_2;
		this.sp_name = sp_name;
		this.customer_details = customer_details;
		this.other_insurance = other_insurance;
		this.construction_details = construction_details;
		this.generic = generic;
		this.isKYCVerified = isKYCVerified;
		this.kyc_data = kyc_data;
	}
	
	public String getProposer_accno() {
		return proposer_accno;
	}
	public void setProposer_accno(String proposer_accno) {
		this.proposer_accno = proposer_accno;
	}
	public String getProposer_loanno() {
		return proposer_loanno;
	}
	public void setProposer_loanno(String proposer_loanno) {
		this.proposer_loanno = proposer_loanno;
	}

	
	
	
	public String getQuote_id() {
		return quote_id;
	}
	public void setQuote_id(String quote_id) {
		this.quote_id = quote_id;
	}
	public String getPro_policy_start_dt() {
		return pro_policy_start_dt;
	}
	public void setPro_policy_start_dt(String pro_policy_start_dt) {
		this.pro_policy_start_dt = pro_policy_start_dt;
	}
	public String getInsured_same_property() {
		return insured_same_property;
	}
	public void setInsured_same_property(String insured_same_property) {
		this.insured_same_property = insured_same_property;
	}
	public String getOther_insurance_declined() {
		return other_insurance_declined;
	}
	public void setOther_insurance_declined(String other_insurance_declined) {
		this.other_insurance_declined = other_insurance_declined;
	}
	public String getSp_code() {
		return sp_code;
	}
	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}
	public String getPart_branch() {
		return part_branch;
	}
	public void setPart_branch(String part_branch) {
		this.part_branch = part_branch;
	}
	public String getPart_employee_code() {
		return part_employee_code;
	}
	public void setPart_employee_code(String part_employee_code) {
		this.part_employee_code = part_employee_code;
	}
	public String getPart_employee_name() {
		return part_employee_name;
	}
	public void setPart_employee_name(String part_employee_name) {
		this.part_employee_name = part_employee_name;
	}
	public String getQ_emp_code() {
		return q_emp_code;
	}
	public void setQ_emp_code(String q_emp_code) {
		this.q_emp_code = q_emp_code;
	}
	public String getProposer_partno() {
		return proposer_partno;
	}
	public void setProposer_partno(String proposer_partno) {
		this.proposer_partno = proposer_partno;
	}
	public String getPart_customer_id() {
		return part_customer_id;
	}
	public void setPart_customer_id(String part_customer_id) {
		this.part_customer_id = part_customer_id;
	}
	public String getSol_id_rac() {
		return sol_id_rac;
	}
	public void setSol_id_rac(String sol_id_rac) {
		this.sol_id_rac = sol_id_rac;
	}
	public String getAdd_field_1() {
		return add_field_1;
	}
	public void setAdd_field_1(String add_field_1) {
		this.add_field_1 = add_field_1;
	}
	public String getAdd_field_2() {
		return add_field_2;
	}
	public void setAdd_field_2(String add_field_2) {
		this.add_field_2 = add_field_2;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public CustomerDetails getCustomer_details() {
		return customer_details;
	}
	public void setCustomer_details(CustomerDetails customer_details) {
		this.customer_details = customer_details;
	}
	public OtherInsurane getOther_insurance() {
		return other_insurance;
	}
	public void setOther_insurance(OtherInsurane other_insurance) {
		this.other_insurance = other_insurance;
	}
	public ConstructionDetails getConstruction_details() {
		return construction_details;
	}
	public void setConstruction_details(ConstructionDetails construction_details) {
		this.construction_details = construction_details;
	}
	public Generic getGeneric() {
		return generic;
	}
	public void setGeneric(Generic generic) {
		this.generic = generic;
	}
	public boolean isKYCVerified() {
		return isKYCVerified;
	}
	public void setKYCVerified(boolean isKYCVerified) {
		this.isKYCVerified = isKYCVerified;
	}
	public KycData getKyc_data() {
		return kyc_data;
	}
	public void setKyc_data(KycData kyc_data) {
		this.kyc_data = kyc_data;
	}
	
		

}
