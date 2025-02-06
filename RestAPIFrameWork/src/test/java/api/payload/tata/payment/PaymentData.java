package api.payload.tata.payment;

public class PaymentData {
	
		  String payment_id;
		  String producer_code;
		  String office_location_code;
		  String office_location_name;
		  String policy_start_date;
		  String payment_amount;
		  String pan_no;
		  String payer_type;
		  String payer_id;
		  String payer_name;
		  String payer_relationship;
		  String consumerAppTransId;
		  String transactionStatus;
		  String gateway_txn_id;
		  String txn_start_time;
		public String getPayment_id() {
			return payment_id;
		}
		public void setPayment_id(String payment_id) {
			this.payment_id = payment_id;
		}
		public String getProducer_code() {
			return producer_code;
		}
		public void setProducer_code(String producer_code) {
			this.producer_code = producer_code;
		}
		public String getOffice_location_code() {
			return office_location_code;
		}
		public void setOffice_location_code(String office_location_code) {
			this.office_location_code = office_location_code;
		}
		public String getOffice_location_name() {
			return office_location_name;
		}
		public void setOffice_location_name(String office_location_name) {
			this.office_location_name = office_location_name;
		}
		public String getPolicy_start_date() {
			return policy_start_date;
		}
		public void setPolicy_start_date(String policy_start_date) {
			this.policy_start_date = policy_start_date;
		}
		public String getPayment_amount() {
			return payment_amount;
		}
		public void setPayment_amount(String payment_amount) {
			this.payment_amount = payment_amount;
		}
		public String getPan_no() {
			return pan_no;
		}
		public void setPan_no(String pan_no) {
			this.pan_no = pan_no;
		}
		public String getPayer_type() {
			return payer_type;
		}
		public void setPayer_type(String payer_type) {
			this.payer_type = payer_type;
		}
		public String getPayer_id() {
			return payer_id;
		}
		public void setPayer_id(String payer_id) {
			this.payer_id = payer_id;
		}
		public String getPayer_name() {
			return payer_name;
		}
		public void setPayer_name(String payer_name) {
			this.payer_name = payer_name;
		}
		public String getPayer_relationship() {
			return payer_relationship;
		}
		public void setPayer_relationship(String payer_relationship) {
			this.payer_relationship = payer_relationship;
		}
		public String getConsumerAppTransId() {
			return consumerAppTransId;
		}
		public void setConsumerAppTransId(String consumerAppTransId) {
			this.consumerAppTransId = consumerAppTransId;
		}
		public String getTransactionStatus() {
			return transactionStatus;
		}
		public void setTransactionStatus(String transactionStatus) {
			this.transactionStatus = transactionStatus;
		}
		public String getGateway_txn_id() {
			return gateway_txn_id;
		}
		public void setGateway_txn_id(String gateway_txn_id) {
			this.gateway_txn_id = gateway_txn_id;
		}
		public String getTxn_start_time() {
			return txn_start_time;
		}
		public void setTxn_start_time(String txn_start_time) {
			this.txn_start_time = txn_start_time;
		}
		public PaymentData(String payment_id, String producer_code, String office_location_code,
				String office_location_name, String policy_start_date, String payment_amount, String pan_no,
				String payer_type, String payer_id, String payer_name, String payer_relationship,
				String consumerAppTransId, String transactionStatus, String gateway_txn_id, String txn_start_time) {
			super();
			this.payment_id = payment_id;
			this.producer_code = producer_code;
			this.office_location_code = office_location_code;
			this.office_location_name = office_location_name;
			this.policy_start_date = policy_start_date;
			this.payment_amount = payment_amount;
			this.pan_no = pan_no;
			this.payer_type = payer_type;
			this.payer_id = payer_id;
			this.payer_name = payer_name;
			this.payer_relationship = payer_relationship;
			this.consumerAppTransId = consumerAppTransId;
			this.transactionStatus = transactionStatus;
			this.gateway_txn_id = gateway_txn_id;
			this.txn_start_time = txn_start_time;
		}
		

}
