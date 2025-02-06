package api.payload.tata;

public class OptionalValues {
	String optional_machinery_max_age;
	String optional_machinery_max_value;
	String optional_pa_max_value;
	String optional_portable_max_value;
	
	
	
	public OptionalValues(String optional_electronic_max_value, String optional_machinery_max_age,
			String optional_machinery_max_value, String optional_pa_max_value, String optional_portable_max_value) {
		super();
		this.optional_electronic_max_value = optional_electronic_max_value;
		this.optional_machinery_max_age = optional_machinery_max_age;
		this.optional_machinery_max_value = optional_machinery_max_value;
		this.optional_pa_max_value = optional_pa_max_value;
		this.optional_portable_max_value = optional_portable_max_value;
	}
	
	String optional_electronic_max_value;
	public String getOptional_electronic_max_value() {
		return optional_electronic_max_value;
	}
	public void setOptional_electronic_max_value(String optional_electronic_max_value) {
		this.optional_electronic_max_value = optional_electronic_max_value;
	}
	public String getOptional_machinery_max_age() {
		return optional_machinery_max_age;
	}
	public void setOptional_machinery_max_age(String optional_machinery_max_age) {
		this.optional_machinery_max_age = optional_machinery_max_age;
	}
	public String getOptional_machinery_max_value() {
		return optional_machinery_max_value;
	}
	public void setOptional_machinery_max_value(String optional_machinery_max_value) {
		this.optional_machinery_max_value = optional_machinery_max_value;
	}
	public String getOptional_pa_max_value() {
		return optional_pa_max_value;
	}
	public void setOptional_pa_max_value(String optional_pa_max_value) {
		this.optional_pa_max_value = optional_pa_max_value;
	}
	public String getOptional_portable_max_value() {
		return optional_portable_max_value;
	}
	public void setOptional_portable_max_value(String optional_portable_max_value) {
		this.optional_portable_max_value = optional_portable_max_value;
	}
	


}
