package api.payload.tata.proposalCompose;

public class ConstructionDetails {
	String construction_no_of_floors;
	public String getConstruction_no_of_floors() {
		return construction_no_of_floors;
	}
	public void setConstruction_no_of_floors(String construction_no_of_floors) {
		this.construction_no_of_floors = construction_no_of_floors;
	}
	public String getAge_of_building() {
		return age_of_building;
	}
	public void setAge_of_building(String age_of_building) {
		this.age_of_building = age_of_building;
	}
	public String getDistance_btw_risk() {
		return distance_btw_risk;
	}
	public void setDistance_btw_risk(String distance_btw_risk) {
		this.distance_btw_risk = distance_btw_risk;
	}
	String age_of_building;
	String distance_btw_risk;
	public ConstructionDetails(String construction_no_of_floors, String age_of_building, String distance_btw_risk) {
		super();
		this.construction_no_of_floors = construction_no_of_floors;
		this.age_of_building = age_of_building;
		this.distance_btw_risk = distance_btw_risk;
	}

}
