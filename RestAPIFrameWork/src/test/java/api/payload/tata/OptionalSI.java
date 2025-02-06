package api.payload.tata;

public class OptionalSI {
	
	
String	money_in_counter_si;
String	money_in_safe_si;
String	money_in_transit_acl_si;
String	money_in_transit_scl_si;

public OptionalSI(String money_in_counter_si, String money_in_safe_si, String money_in_transit_acl_si,
		String money_in_transit_scl_si) {
	super();
	this.money_in_counter_si = money_in_counter_si;
	this.money_in_safe_si = money_in_safe_si;
	this.money_in_transit_acl_si = money_in_transit_acl_si;
	this.money_in_transit_scl_si = money_in_transit_scl_si;
}
public String getMoney_in_counter_si() {
	return money_in_counter_si;
}
public void setMoney_in_counter_si(String money_in_counter_si) {
	this.money_in_counter_si = money_in_counter_si;
}
public String getMoney_in_safe_si() {
	return money_in_safe_si;
}
public void setMoney_in_safe_si(String money_in_safe_si) {
	this.money_in_safe_si = money_in_safe_si;
}
public String getMoney_in_transit_acl_si() {
	return money_in_transit_acl_si;
}
public void setMoney_in_transit_acl_si(String money_in_transit_acl_si) {
	this.money_in_transit_acl_si = money_in_transit_acl_si;
}
public String getMoney_in_transit_scl_si() {
	return money_in_transit_scl_si;
}
public void setMoney_in_transit_scl_si(String money_in_transit_scl_si) {
	this.money_in_transit_scl_si = money_in_transit_scl_si;
}

	

}
