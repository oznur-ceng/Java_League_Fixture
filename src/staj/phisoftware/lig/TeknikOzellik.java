package staj.phisoftware.lig;

import java.util.Arrays;

import staj.phisoftware.lig.enums.Pozisyon;

public class TeknikOzellik extends RootOzellik {
	private Ozellik corners;
	private Ozellik crossing;
	private Ozellik dribbling;
	private Ozellik finishing;
	private Ozellik firstTouch;
	private Ozellik freeKickTaking;
	private Ozellik heading;
	private Ozellik longShots;
	private Ozellik longThrows;
	private Ozellik marking;
	private Ozellik passing;
	private Ozellik penaltyTaking;
	private Ozellik tackling;
	private Ozellik technique;

	public TeknikOzellik() {
		super();
	}

	@Override
	protected double getAvgGuc() {
		return (corners.getValue() + crossing.getValue() + dribbling.getValue() + finishing.getValue()
				+ firstTouch.getValue() + freeKickTaking.getValue() + heading.getValue() + longShots.getValue()
				+ longThrows.getValue() + marking.getValue() + passing.getValue() + penaltyTaking.getValue()
				+ tackling.getValue() + technique.getValue()) / 14;
	}

	@Override
	protected void generate(Pozisyon futbolcuPozisyonu) {
		this.corners = new Ozellik(Arrays.asList(Pozisyon.ORTA_SAHA));
		this.corners.calculateValue(futbolcuPozisyonu);

		this.crossing = new Ozellik(Arrays.asList(Pozisyon.ORTA_SAHA));
		this.crossing.calculateValue(futbolcuPozisyonu);

		this.dribbling = new Ozellik(Arrays.asList(Pozisyon.ORTA_SAHA));
		this.dribbling.calculateValue(futbolcuPozisyonu);

		this.finishing = new Ozellik(Arrays.asList(Pozisyon.HUCUM));
		this.finishing.calculateValue(futbolcuPozisyonu);

		this.firstTouch = new Ozellik(Arrays.asList(Pozisyon.HUCUM, Pozisyon.SAVUNMA));
		this.firstTouch.calculateValue(futbolcuPozisyonu);

		this.freeKickTaking = new Ozellik(null);
		this.freeKickTaking.calculateValue(futbolcuPozisyonu);

		this.heading = new Ozellik(Arrays.asList(Pozisyon.HUCUM, Pozisyon.SAVUNMA));
		this.heading.calculateValue(futbolcuPozisyonu);

		this.longShots = new Ozellik(Arrays.asList(Pozisyon.HUCUM, Pozisyon.ORTA_SAHA));
		this.longShots.calculateValue(futbolcuPozisyonu);

		this.longThrows = new Ozellik(Arrays.asList(Pozisyon.SAVUNMA));
		this.longThrows.calculateValue(futbolcuPozisyonu);

		this.marking = new Ozellik(Arrays.asList(Pozisyon.SAVUNMA));
		this.marking.calculateValue(futbolcuPozisyonu);

		this.passing = new Ozellik(Arrays.asList(Pozisyon.HUCUM, Pozisyon.ORTA_SAHA));
		this.passing.calculateValue(futbolcuPozisyonu);

		this.penaltyTaking = new Ozellik(null);
		this.penaltyTaking.calculateValue(futbolcuPozisyonu);

		this.tackling = new Ozellik(Arrays.asList(Pozisyon.SAVUNMA));
		this.tackling.calculateValue(futbolcuPozisyonu);

		this.technique = new Ozellik(Arrays.asList(Pozisyon.HUCUM, Pozisyon.ORTA_SAHA));
		this.technique.calculateValue(futbolcuPozisyonu);

	}

	public Ozellik getCorners() {
		return corners;
	}

	public void setCorners(Ozellik corners) {
		this.corners = corners;
	}

	public Ozellik getCrossing() {
		return crossing;
	}

	public void setCrossing(Ozellik crossing) {
		this.crossing = crossing;
	}

	public Ozellik getDribbling() {
		return dribbling;
	}

	public void setDribbling(Ozellik dribbling) {
		this.dribbling = dribbling;
	}

	public Ozellik getFinishing() {
		return finishing;
	}

	public void setFinishing(Ozellik finishing) {
		this.finishing = finishing;
	}

	public Ozellik getFirstTouch() {
		return firstTouch;
	}

	public void setFirstTouch(Ozellik firstTouch) {
		this.firstTouch = firstTouch;
	}

	public Ozellik getFreeKickTaking() {
		return freeKickTaking;
	}

	public void setFreeKickTaking(Ozellik freeKickTaking) {
		this.freeKickTaking = freeKickTaking;
	}

	public Ozellik getHeading() {
		return heading;
	}

	public void setHeading(Ozellik heading) {
		this.heading = heading;
	}

	public Ozellik getLongShots() {
		return longShots;
	}

	public void setLongShots(Ozellik longShots) {
		this.longShots = longShots;
	}

	public Ozellik getLongThrows() {
		return longThrows;
	}

	public void setLongThrows(Ozellik longThrows) {
		this.longThrows = longThrows;
	}

	public Ozellik getMarking() {
		return marking;
	}

	public void setMarking(Ozellik marking) {
		this.marking = marking;
	}

	public Ozellik getPassing() {
		return passing;
	}

	public void setPassing(Ozellik passing) {
		this.passing = passing;
	}

	public Ozellik getPenaltyTaking() {
		return penaltyTaking;
	}

	public void setPenaltyTaking(Ozellik penaltyTaking) {
		this.penaltyTaking = penaltyTaking;
	}

	public Ozellik getTackling() {
		return tackling;
	}

	public void setTackling(Ozellik tackling) {
		this.tackling = tackling;
	}

	public Ozellik getTechnique() {
		return technique;
	}

	public void setTechnique(Ozellik technique) {
		this.technique = technique;
	}

}
