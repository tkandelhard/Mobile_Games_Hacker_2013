package se;

import java.util.ArrayList;
import java.util.List;


public class Workshop {
	private String name;
	private int nummer;
	private String datum;
	public Referent leitung; 
	public List<Teilnehmer> teilnehmerWs = new ArrayList<Teilnehmer>();
	//List<Player> players = new ArrayList<Player>();
	public Workshop(String name, int nummer, String datum) {
		super();
		this.name = name;
		this.nummer = nummer;
		this.datum = datum;
	}
	public void setLeitung(Referent leitung) {
		this.leitung = leitung;
	}
	
	public void addTeilnehmer(Teilnehmer teilnehmer) {
		teilnehmerWs.add(teilnehmer);
	}
	
	
}
