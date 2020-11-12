package staj.phisoftware.lig;

import java.util.Arrays;

import staj.phisoftware.lig.enums.Pozisyon;

public class GoalKeeping extends RootOzellik {
	private Ozellik aerialAbility;
	private Ozellik commandOfArea;
	private Ozellik eccentricity;
	private Ozellik handling;
	private Ozellik kicking;
	private Ozellik reflexes;
	private Ozellik rushingOut;
	private Ozellik tendencyToPunch;
	public GoalKeeping() {
		super();


	}
	@Override
	protected double getAvgGuc() {

		return (aerialAbility.getValue() + commandOfArea.getValue()
				+ eccentricity.getValue() + handling.getValue()
				+ kicking.getValue() + reflexes.getValue()
				+ rushingOut.getValue() + tendencyToPunch.getValue() + throwing
					.getValue()) / 9;
	}
	private Ozellik throwing;
	@Override
	protected void generate(Pozisyon futbolcuPozisyonu) {
		this.aerialAbility = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.aerialAbility.calculateValue(futbolcuPozisyonu);

		this.commandOfArea = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.commandOfArea.calculateValue(futbolcuPozisyonu);

		this.eccentricity = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.eccentricity.calculateValue(futbolcuPozisyonu);

		this.handling = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.handling.calculateValue(futbolcuPozisyonu);

		this.kicking = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.kicking.calculateValue(futbolcuPozisyonu);

		this.reflexes = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.reflexes.calculateValue(futbolcuPozisyonu);

		this.rushingOut = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.rushingOut.calculateValue(futbolcuPozisyonu);

		this.tendencyToPunch = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.tendencyToPunch.calculateValue(futbolcuPozisyonu);

		this.throwing = new Ozellik(Arrays.asList(Pozisyon.KALE));
		this.throwing.calculateValue(futbolcuPozisyonu);

		
	}
	public Ozellik getAerialAbility() {
		return aerialAbility;
	}
	public void setAerialAbility(Ozellik aerialAbility) {
		this.aerialAbility = aerialAbility;
	}
	public Ozellik getCommandOfArea() {
		return commandOfArea;
	}
	public void setCommandOfArea(Ozellik commandOfArea) {
		this.commandOfArea = commandOfArea;
	}
	public Ozellik getEccentricity() {
		return eccentricity;
	}
	public void setEccentricity(Ozellik eccentricity) {
		this.eccentricity = eccentricity;
	}
	public Ozellik getHandling() {
		return handling;
	}
	public void setHandling(Ozellik handling) {
		this.handling = handling;
	}
	public Ozellik getKicking() {
		return kicking;
	}
	public void setKicking(Ozellik kicking) {
		this.kicking = kicking;
	}
	public Ozellik getReflexes() {
		return reflexes;
	}
	public void setReflexes(Ozellik reflexes) {
		this.reflexes = reflexes;
	}
	public Ozellik getRushingOut() {
		return rushingOut;
	}
	public void setRushingOut(Ozellik rushingOut) {
		this.rushingOut = rushingOut;
	}
	public Ozellik getTendencyToPunch() {
		return tendencyToPunch;
	}
	public void setTendencyToPunch(Ozellik tendencyToPunch) {
		this.tendencyToPunch = tendencyToPunch;
	}
	public Ozellik getThrowing() {
		return throwing;
	}
	public void setThrowing(Ozellik throwing) {
		this.throwing = throwing;
	}

}
