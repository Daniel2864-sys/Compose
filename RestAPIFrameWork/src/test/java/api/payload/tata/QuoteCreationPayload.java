package api.payload.tata;

public class QuoteCreationPayload {
  String	aigc_product;
  String	channel_type;
  String	banca_channel;
  String	gstin;
  String	business_discription;
  String	si_limit;
  String	loss_claim_yn;
  String[] claims;
 SiDetails siDetails;
 InsuredDetails insuredDetails;
 String	optional_burglary_first_loss_perc;
 String	hypothication;
 String	terrorismOpted;
 PropersDetails proposerDetails;
 String	risk_address_line1;
 String	risk_address_line2;
 String	risk_address_line3;
 String	risk_pincode;
 String	iib_code;
 OptionalSI optionalSi;
 String	optional_burglary_theft_applicable;
 String	broker_producer_name;
 String	broker_producer_code;
 String	office_location_name;
	OptionalValues optionalValue;
	
	String	tag;
	String	p1_option;
	String	p1_name;
	int	p1_ld;
	String	p2_option;
	String	p2_name;
	int	p2_ld;
	String	p3_option;
	String	p3_name;
	int	p3_ld;
	

	

  public QuoteCreationPayload(String aigc_product, String channel_type, String banca_channel, String gstin,
		String business_discription, String si_limit, String loss_claim_yn, String[] claims, SiDetails siDetails,
		InsuredDetails insuredDetails, String optional_burglary_first_loss_perc, String hypothication,
		String terrorismOpted, PropersDetails proposerDetails, String risk_address_line1, String risk_address_line2,
		String risk_address_line3, String risk_pincode, String iib_code, OptionalSI optionalSi,
		String optional_burglary_theft_applicable, String broker_producer_name, String broker_producer_code,
		String office_location_name, OptionalValues optionalValue, String tag, String p1_option, String p1_name,
		int p1_ld, String p2_option, String p2_name, int p2_ld, String p3_option, String p3_name, int p3_ld) {
	super();
	this.aigc_product = aigc_product;
	this.channel_type = channel_type;
	this.banca_channel = banca_channel;
	this.gstin = gstin;
	this.business_discription = business_discription;
	this.si_limit = si_limit;
	this.loss_claim_yn = loss_claim_yn;
	this.claims = claims;
	this.siDetails = siDetails;
	this.insuredDetails = insuredDetails;
	this.optional_burglary_first_loss_perc = optional_burglary_first_loss_perc;
	this.hypothication = hypothication;
	this.terrorismOpted = terrorismOpted;
	this.proposerDetails = proposerDetails;
	this.risk_address_line1 = risk_address_line1;
	this.risk_address_line2 = risk_address_line2;
	this.risk_address_line3 = risk_address_line3;
	this.risk_pincode = risk_pincode;
	this.iib_code = iib_code;
	this.optionalSi = optionalSi;
	this.optional_burglary_theft_applicable = optional_burglary_theft_applicable;
	this.broker_producer_name = broker_producer_name;
	this.broker_producer_code = broker_producer_code;
	this.office_location_name = office_location_name;
	this.optionalValue = optionalValue;
	this.tag = tag;
	this.p1_option = p1_option;
	this.p1_name = p1_name;
	this.p1_ld = p1_ld;
	this.p2_option = p2_option;
	this.p2_name = p2_name;
	this.p2_ld = p2_ld;
	this.p3_option = p3_option;
	this.p3_name = p3_name;
	this.p3_ld = p3_ld;
}
public String getAigc_product() {
	return aigc_product;
}
public void setAigc_product(String aigc_product) {
	this.aigc_product = aigc_product;
}
public String getChannel_type() {
	return channel_type;
}
public void setChannel_type(String channel_type) {
	this.channel_type = channel_type;
}
public String getBanca_channel() {
	return banca_channel;
}
public void setBanca_channel(String banca_channel) {
	this.banca_channel = banca_channel;
}
public String getGstin() {
	return gstin;
}
public void setGstin(String gstin) {
	this.gstin = gstin;
}
public String getBusiness_discription() {
	return business_discription;
}
public void setBusiness_discription(String business_discription) {
	this.business_discription = business_discription;
}
public String getSi_limit() {
	return si_limit;
}
public void setSi_limit(String si_limit) {
	this.si_limit = si_limit;
}
public String getLoss_claim_yn() {
	return loss_claim_yn;
}
public void setLoss_claim_yn(String loss_claim_yn) {
	this.loss_claim_yn = loss_claim_yn;
}
public String[] getClaims() {
	return claims;
}
public void setClaims(String[] claims) {
	this.claims = claims;
}
public SiDetails getSiDetails() {
	return siDetails;
}
public void setSiDetails(SiDetails siDetails) {
	this.siDetails = siDetails;
}
public InsuredDetails getInsuredDetails() {
	return insuredDetails;
}
public void setInsuredDetails(InsuredDetails insuredDetails) {
	this.insuredDetails = insuredDetails;
}
public String getOptional_burglary_first_loss_perc() {
	return optional_burglary_first_loss_perc;
}
public void setOptional_burglary_first_loss_perc(String optional_burglary_first_loss_perc) {
	this.optional_burglary_first_loss_perc = optional_burglary_first_loss_perc;
}
public String getHypothication() {
	return hypothication;
}
public void setHypothication(String hypothication) {
	this.hypothication = hypothication;
}
public String getTerrorismOpted() {
	return terrorismOpted;
}
public void setTerrorismOpted(String terrorismOpted) {
	this.terrorismOpted = terrorismOpted;
}
public PropersDetails getProposerDetails() {
	return proposerDetails;
}
public void setProposerDetails(PropersDetails proposerDetails) {
	this.proposerDetails = proposerDetails;
}
public String getRisk_address_line1() {
	return risk_address_line1;
}
public void setRisk_address_line1(String risk_address_line1) {
	this.risk_address_line1 = risk_address_line1;
}
public String getRisk_address_line2() {
	return risk_address_line2;
}
public void setRisk_address_line2(String risk_address_line2) {
	this.risk_address_line2 = risk_address_line2;
}
public String getRisk_address_line3() {
	return risk_address_line3;
}
public void setRisk_address_line3(String risk_address_line3) {
	this.risk_address_line3 = risk_address_line3;
}
public String getRisk_pincode() {
	return risk_pincode;
}
public void setRisk_pincode(String risk_pincode) {
	this.risk_pincode = risk_pincode;
}
public String getIib_code() {
	return iib_code;
}
public void setIib_code(String iib_code) {
	this.iib_code = iib_code;
}
public OptionalSI getOptionalSi() {
	return optionalSi;
}
public void setOptionalSi(OptionalSI optionalSi) {
	this.optionalSi = optionalSi;
}
public String getOptional_burglary_theft_applicable() {
	return optional_burglary_theft_applicable;
}
public void setOptional_burglary_theft_applicable(String optional_burglary_theft_applicable) {
	this.optional_burglary_theft_applicable = optional_burglary_theft_applicable;
}
public String getBroker_producer_name() {
	return broker_producer_name;
}
public void setBroker_producer_name(String broker_producer_name) {
	this.broker_producer_name = broker_producer_name;
}
public String getBroker_producer_code() {
	return broker_producer_code;
}
public void setBroker_producer_code(String broker_producer_code) {
	this.broker_producer_code = broker_producer_code;
}
public String getOffice_location_name() {
	return office_location_name;
}
public void setOffice_location_name(String office_location_name) {
	this.office_location_name = office_location_name;
}
public OptionalValues getOptionalValue() {
	return optionalValue;
}
public void setOptionalValue(OptionalValues optionalValue) {
	this.optionalValue = optionalValue;
}
public String getTag() {
	return tag;
}
public void setTag(String tag) {
	this.tag = tag;
}
public String getP1_option() {
	return p1_option;
}
public void setP1_option(String p1_option) {
	this.p1_option = p1_option;
}
public String getP1_name() {
	return p1_name;
}
public void setP1_name(String p1_name) {
	this.p1_name = p1_name;
}
public int getP1_ld() {
	return p1_ld;
}
public void setP1_ld(int p1_ld) {
	this.p1_ld = p1_ld;
}
public String getP2_option() {
	return p2_option;
}
public void setP2_option(String p2_option) {
	this.p2_option = p2_option;
}
public String getP2_name() {
	return p2_name;
}
public void setP2_name(String p2_name) {
	this.p2_name = p2_name;
}
public int getP2_ld() {
	return p2_ld;
}
public void setP2_ld(int p2_ld) {
	this.p2_ld = p2_ld;
}
public String getP3_option() {
	return p3_option;
}
public void setP3_option(String p3_option) {
	this.p3_option = p3_option;
}
public String getP3_name() {
	return p3_name;
}
public void setP3_name(String p3_name) {
	this.p3_name = p3_name;
}
public int getP3_ld() {
	return p3_ld;
}
public void setP3_ld(int p3_ld) {
	this.p3_ld = p3_ld;
}




	

}
