package app.model;

public class Commensal extends State {

	public Commensal(User aUser) {
		super();
		this.setUser(aUser);
	}
	public Boolean reTypify(Integer aNumber) {
		if (aNumber < 40) {
			return false;
		} else {
			this.getUser().setType(new Gourmet(this.getUser()));
			return false;
		}
	}
	
}
