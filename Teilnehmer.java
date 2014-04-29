package se;

public class Teilnehmer {
		private String name;
		private String email;
		private String Status;
		public Teilnehmer(String name, String email, String status) {
			super();
			this.name = name;
			this.email = email;
			Status = status;
		}
		
		private void teilnehmenWs(Teilnehmer teilnehmer, Workshop workshop) {
			workshop.addTeilnehmer(teilnehmer);
		}
		
		private void teilnehmenRp(Teilnehmer teilnehmer, Rahmenprogramm rahmenprogramm) {
			rahmenprogramm.addTeilnehmer(teilnehmer);
		}
		
}
