package app.dto;

public class AdressDTO {


	private Long id;
	private String country;
	private String state;
	private String city;
	private String street;
	private Integer altitude;
	private String departament;
	
	public AdressDTO() {
		
	}
	
	public AdressDTO(String country, String state, String city, String street, Integer altitude, String departament) {
		this.setCountry(country);
		this.setState(state);
		this.setCity(city);
		this.setStreet(street);
		this.setAltitude(altitude);
		this.setDepartament(departament);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getAltitude() {
		return altitude;
	}
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}
	public String getDepartament() {
		return departament;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
}
