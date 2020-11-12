package staj.phisoftware.lig;

import phisoftware.staj.util.UtilMethods;
import staj.phisoftware.lig.enums.Pozisyon;

public class Futbolcu {
	private int yas;
	private String isim;
	private Pozisyon pozisyon;
	private FizikselOzellik fizikselOzellik;
	private TeknikOzellik teknikOzellik;
	private MentalOzellik mentalOzellik;
	private GoalKeeping goalKeeping;

	public Futbolcu(Pozisyon pozisyon) {
		yas = 18 + (int) Math.random() * 17;
		isim = UtilMethods.isimOlusturma();
		this.pozisyon = pozisyon;
		fizikselOzellik = fizikselOzellikOlustur();
		teknikOzellik = teknikOzellikOlustur();
		mentalOzellik = mentalOzellikOlustur();
		goalKeeping = goalKeepingOlustur();

	}

	public double getAvgGuc() {
		return (teknikOzellik.getAvgGuc() + fizikselOzellik.getAvgGuc() + mentalOzellik.getAvgGuc()
				+ goalKeeping.getAvgGuc()) / 4;
	}

	private MentalOzellik mentalOzellikOlustur() {
		MentalOzellik mentalOzellik = new MentalOzellik();
		mentalOzellik.generate(this.pozisyon);
		return mentalOzellik;
	}

	private TeknikOzellik teknikOzellikOlustur() {
		TeknikOzellik teknikOzellik = new TeknikOzellik();
		teknikOzellik.generate(this.pozisyon);
		return teknikOzellik;
	}

	private FizikselOzellik fizikselOzellikOlustur() {
		FizikselOzellik fizikselOzellik = new FizikselOzellik();
		fizikselOzellik.generate(this.pozisyon);
		return fizikselOzellik;
	}

	private GoalKeeping goalKeepingOlustur() {
		GoalKeeping goalKeeping = new GoalKeeping();
		goalKeeping.generate(this.pozisyon);
		return goalKeeping;
	}

	public FizikselOzellik getFizikselOzellik() {
		return fizikselOzellik;
	}

	public void setFizikselOzellik(FizikselOzellik fizikselOzellik) {
		this.fizikselOzellik = fizikselOzellik;
	}

	public TeknikOzellik getTeknikOzellik() {
		return teknikOzellik;
	}

	public void setTeknikOzellik(TeknikOzellik teknikOzellik) {
		this.teknikOzellik = teknikOzellik;
	}

	public MentalOzellik getMentalOzellik() {
		return mentalOzellik;
	}

	public void setMentalOzellik(MentalOzellik mentalOzellik) {
		this.mentalOzellik = mentalOzellik;
	}

	public GoalKeeping getGoalkeeping() {
		return goalKeeping;
	}

	public void setGoalkeeping(GoalKeeping goalkeeping) {
		this.goalKeeping = goalkeeping;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}
