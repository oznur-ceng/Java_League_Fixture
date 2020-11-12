package staj.phisoftware.lig;

import java.util.Random;

public class Mac {
	private Takim homeTeam;
	private Takim awayTeam;
	private int golHome;
	private int golAway;
	private boolean isOver;

	public Mac(Takim homeTeam, Takim awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;

	}

	public void hazirla() {
		homeTeam.macaHazirlan(true);
		awayTeam.macaHazirlan(false);
	}

	public void macOyna() {

		isOver = true;
		double buMaclikToplamGucHome = random() * homeTeam.getAvgGuc();
		double buMaclikToplamGucAway = random() * awayTeam.getAvgGuc();

		double atkHome = buMaclikToplamGucHome * homeTeam.getAvgHucum() / 100;
		atkHome = random() * atkHome;

		double defHome = buMaclikToplamGucHome * homeTeam.getAvgSavunma() / 100;
		defHome = random() * defHome;

		double atkAway = buMaclikToplamGucAway * awayTeam.getAvgHucum() / 100;
		atkAway = random() * atkAway;

		double defAway = buMaclikToplamGucAway * awayTeam.getAvgSavunma() / 100;
		defAway = random() * defAway;

		atkHome = atkHome * (100 - defAway) / 100;

		atkAway = atkAway * (100 - defHome) / 100;

		double golHome = random() * atkHome;
		golHome = golHome * (100 - defAway) / 100;

		golHome = random() * golHome;

		double golAway = random() * atkAway;
		golAway = golAway * (100 - defHome) / 100;

		golAway = random() * golAway;
		this.golHome = (int) Math.round(golHome);
		this.golAway = (int) Math.round(golAway);
		homeTeam.macSonuclandi(this.golHome, this.golAway);
		awayTeam.macSonuclandi(this.golAway, this.golHome);

	}

	public void yazdir() {
		if (isOver) {
			System.out.println(
					homeTeam.getIsim() + " " + this.golHome + " vs " + this.golAway + " " + awayTeam.getIsim());
		} else {
			System.out.println(homeTeam.getIsim() + " vs " + awayTeam.getIsim());
		}
	}

	private double random() {

		return new Random().nextDouble();
	}

	public Takim getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Takim homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Takim getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Takim awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getGolHome() {
		return golHome;
	}

	public void setGolHome(int golHome) {
		this.golHome = golHome;
	}

	public int getGolAway() {
		return golAway;
	}

	public void setGolAway(int golAway) {
		this.golAway = golAway;
	}

	public boolean isOver() {
		return isOver;
	}

	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}

}
