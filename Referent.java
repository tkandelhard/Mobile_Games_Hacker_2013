package se;

public class Referent extends Teilnehmer{
	private String firma;

	public Referent(String name, String email, String status, String firma) {
		super(name, email, status);
		this.firma = firma;
	}
	
	private void leiten(Referent referent, Workshop workshop) {
		workshop.setLeitung(referent);
	}
	
	
}
