package se;

import java.util.ArrayList;
import java.util.List;

public class Rahmenprogramm {
	private String bezeichnung;
	private String datum;
	private String zeit;
	private String ort;
	public List<Teilnehmer> teilnehmerRp = new ArrayList<Teilnehmer>();
	public Rahmenprogramm(String bezeichnung, String datum, String zeit,
			String ort) {
		super();
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
	}
	
	public void addTeilnehmer(Teilnehmer teilnehmer) {
		teilnehmerRp.add(teilnehmer);
	}
	
}
