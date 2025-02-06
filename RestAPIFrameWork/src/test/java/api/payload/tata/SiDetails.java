package api.payload.tata;

public class SiDetails {
	
	String content_si;
	String building_si;
	String top_location_si;
	
	public SiDetails(String content_si, String building_si, String top_location_si) {
		super();
		this.content_si = content_si;
		this.building_si = building_si;
		this.top_location_si = top_location_si;
	}
	public String getContent_si() {
		return content_si;
	}
	public void setContent_si(String content_si) {
		this.content_si = content_si;
	}
	public String getBuilding_si() {
		return building_si;
	}
	public void setBuilding_si(String building_si) {
		this.building_si = building_si;
	}
	public String getTop_location_si() {
		return top_location_si;
	}
	public void setTop_location_si(String top_location_si) {
		this.top_location_si = top_location_si;
	}


}
