package app.model;

public class Visitor extends State {
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
