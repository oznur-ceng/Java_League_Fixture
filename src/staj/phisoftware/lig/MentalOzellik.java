package staj.phisoftware.lig;

import java.util.Arrays;

import staj.phisoftware.lig.enums.Pozisyon;

public class MentalOzellik extends RootOzellik {
	private Ozellik aggression;
	private Ozellik anticipation;
	private Ozellik bravery;
	private Ozellik composure;
	private Ozellik concentration;
	private Ozellik decisions;
	private Ozellik determination;
	private Ozellik flair;
	private Ozellik leadership;
	private Ozellik offTheBall;
	private Ozellik positioning;
	private Ozellik teamwork;
	private Ozellik vision;
	private Ozellik workRate;

	public MentalOzellik() {
		super();
	}

	@Override
	protected double getAvgGuc() {
		return (aggression.getValue() + anticipation.getValue() + bravery.getValue() + composure.getValue()
				+ concentration.getValue() + decisions.getValue() + determination.getValue() + flair.getValue()
				+ leadership.getValue() + offTheBall.getValue() + positioning.getValue() + teamwork.getValue()
				+ vision.getValue() + workRate.getValue()) / 14;
	}

	@Override
	protected void generate(Pozisyon futbolcuPozisyonu) {
		this.aggression = new Ozellik(Arrays.asList(Pozisyon.SAVUNMA));
		this.aggression.calculateValue(futbolcuPozisyonu);

		this.anticipation = new Ozellik(null);
		this.anticipation.calculateValue(futbolcuPozisyonu);

		this.bravery = new Ozellik(Arrays.asList(Pozisyon.SAVUNMA));
		this.bravery.calculateValue(futbolcuPozisyonu);

		this.composure = new Ozellik(null);
		this.composure.calculateValue(futbolcuPozisyonu);

		this.concentration = new Ozellik(null);
		this.concentration.calculateValue(futbolcuPozisyonu);

		this.decisions = new Ozellik(null);
		this.decisions.calculateValue(futbolcuPozisyonu);

		this.determination = new Ozellik(null);
		this.determination.calculateValue(futbolcuPozisyonu);

		this.flair = new Ozellik(null);
		this.flair.calculateValue(futbolcuPozisyonu);

		this.leadership = new Ozellik(null);
		this.leadership.calculateValue(futbolcuPozisyonu);

		this.offTheBall = new Ozellik(null);
		this.offTheBall.calculateValue(futbolcuPozisyonu);

		this.positioning = new Ozellik(null);
		this.positioning.calculateValue(futbolcuPozisyonu);

		this.teamwork = new Ozellik(null);
		this.teamwork.calculateValue(futbolcuPozisyonu);

		this.vision = new Ozellik(null);
		this.vision.calculateValue(futbolcuPozisyonu);

		this.workRate = new Ozellik(null);
		this.workRate.calculateValue(futbolcuPozisyonu);

	}

	public Ozellik getAggression() {
		return aggression;
	}

	public void setAggression(Ozellik aggression) {
		this.aggression = aggression;
	}

	public Ozellik getAnticipation() {
		return anticipation;
	}

	public void setAnticipation(Ozellik anticipation) {
		this.anticipation = anticipation;
	}

	public Ozellik getBravery() {
		return bravery;
	}

	public void setBravery(Ozellik bravery) {
		this.bravery = bravery;
	}

	public Ozellik getComposure() {
		return composure;
	}

	public void setComposure(Ozellik composure) {
		this.composure = composure;
	}

	public Ozellik getConcentration() {
		return concentration;
	}

	public void setConcentration(Ozellik concentration) {
		this.concentration = concentration;
	}

	public Ozellik getDecisions() {
		return decisions;
	}

	public void setDecisions(Ozellik decisions) {
		this.decisions = decisions;
	}

	public Ozellik getDetermination() {
		return determination;
	}

	public void setDetermination(Ozellik determination) {
		this.determination = determination;
	}

	public Ozellik getFlair() {
		return flair;
	}

	public void setFlair(Ozellik flair) {
		this.flair = flair;
	}

	public Ozellik getLeadership() {
		return leadership;
	}

	public void setLeadership(Ozellik leadership) {
		this.leadership = leadership;
	}

	public Ozellik getOffTheBall() {
		return offTheBall;
	}

	public void setOffTheBall(Ozellik offTheBall) {
		this.offTheBall = offTheBall;
	}

	public Ozellik getPositioning() {
		return positioning;
	}

	public void setPositioning(Ozellik positioning) {
		this.positioning = positioning;
	}

	public Ozellik getTeamwork() {
		return teamwork;
	}

	public void setTeamwork(Ozellik teamwork) {
		this.teamwork = teamwork;
	}

	public Ozellik getVision() {
		return vision;
	}

	public void setVision(Ozellik vision) {
		this.vision = vision;
	}

	public Ozellik getWorkRate() {
		return workRate;
	}

	public void setWorkRate(Ozellik workRate) {
		this.workRate = workRate;
	}

}
