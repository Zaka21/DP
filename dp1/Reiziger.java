package dp1;

import java.util.Date;

public class Reiziger {
	private String naam;
	private Date geboortedatum;

	public Reiziger(String nm, Date gbd) {
		naam = nm;
		geboortedatum = gbd;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String nm) {
		naam = nm;
	}

	public Date getGBdatum() {
		return geboortedatum;
	}

	public void setGBdatum(Date gbd) {
		geboortedatum = gbd;
	}

	public String toString() {
		String s = naam + " " + geboortedatum;
		return s;
	}

}