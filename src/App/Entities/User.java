package Entities;

@Entity
public class User {

	/**
	 * 
	 * @param args
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name="nombre", nullable=false, length=255)
	private String nombre;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	publis void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
