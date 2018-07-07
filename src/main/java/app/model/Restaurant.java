package app.model;

public class Restaurant {
	
	private Integer id;
	private String name;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String name) {
		this.setName(name);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
