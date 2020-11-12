package staj.phisoftware.lig;

import staj.phisoftware.lig.enums.Pozisyon;

public class FizikselOzellik extends RootOzellik {

	private Ozellik acceleration;
	private Ozellik agility;
	private Ozellik balance;
	private Ozellik jumpingReach;
	private Ozellik naturalFitness;
	private Ozellik pace;
	private Ozellik stamia;
	private Ozellik strength;

	public FizikselOzellik() {
		super();

	}

	@Override
	protected double getAvgGuc() {
		return (acceleration.getValue() + agility.getValue() + balance.getValue() + jumpingReach.getValue()
				+ naturalFitness.getValue() + pace.getValue() + stamia.getValue() + strength.getValue()) / 8;
	}

	@Override
	protected void generate(Pozisyon futbolcuPozisyonu) {
		this.acceleration = new Ozellik(null);
		this.acceleration.calculateValue(futbolcuPozisyonu);

		this.agility = new Ozellik(null);
		this.agility.calculateValue(futbolcuPozisyonu);

		this.balance = new Ozellik(null);
		this.balance.calculateValue(futbolcuPozisyonu);

		this.jumpingReach = new Ozellik(null);
		this.jumpingReach.calculateValue(futbolcuPozisyonu);

		this.naturalFitness = new Ozellik(null);
		this.naturalFitness.calculateValue(futbolcuPozisyonu);

		this.pace = new Ozellik(null);
		this.pace.calculateValue(futbolcuPozisyonu);

		this.stamia = new Ozellik(null);
		this.stamia.calculateValue(futbolcuPozisyonu);

		this.strength = new Ozellik(null);
		this.strength.calculateValue(futbolcuPozisyonu);

	}

	public Ozellik getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Ozellik acceleration) {
		this.acceleration = acceleration;
	}

	public Ozellik getAgility() {
		return agility;
	}

	public void setAgility(Ozellik agility) {
		this.agility = agility;
	}

	public Ozellik getBalance() {
		return balance;
	}

	public void setBalance(Ozellik balance) {
		this.balance = balance;
	}

	public Ozellik getJumpingReach() {
		return jumpingReach;
	}

	public void setJumpingReach(Ozellik jumpingReach) {
		this.jumpingReach = jumpingReach;
	}

	public Ozellik getNaturalFitness() {
		return naturalFitness;
	}

	public void setNaturalFitness(Ozellik naturalFitness) {
		this.naturalFitness = naturalFitness;
	}

	public Ozellik getPace() {
		return pace;
	}

	public void setPace(Ozellik pace) {
		this.pace = pace;
	}

	public Ozellik getStamia() {
		return stamia;
	}

	public void setStamia(Ozellik stamia) {
		this.stamia = stamia;
	}

	public Ozellik getStrength() {
		return strength;
	}

	public void setStrength(Ozellik strength) {
		this.strength = strength;
	}

}
