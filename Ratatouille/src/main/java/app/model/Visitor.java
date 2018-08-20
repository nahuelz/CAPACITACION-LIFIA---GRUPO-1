package app.model;

public class Visitor extends State {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Visitor(User aUser) {
		super();
		this.setUser(aUser);
	}

	public Boolean reTypify(Integer aNumber) {
		if (aNumber < 20) {
			return false;
		} else {
			this.getUser().setType(new Commensal(this.getUser()));
			return false;
		}
	}
	
}
