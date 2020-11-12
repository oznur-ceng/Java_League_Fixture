package staj.phisoftware.lig;

import java.util.List;
import java.util.Random;

import staj.phisoftware.lig.enums.Pozisyon;

public class Ozellik {
	private int value;
	private List<Pozisyon> pozisyonlar;

	public Ozellik(List<Pozisyon> pozisyonlar) {
		this.pozisyonlar = pozisyonlar;

	}

	public void calculateValue(boolean isHomeGame) {
		int altLimit = isHomeGame ? 60 : 10;
		int ustLimit = isHomeGame ? 100 : 50;

		Random rnd = new Random();
		this.value = rnd.nextInt(ustLimit - altLimit) + altLimit;
	}

	public void calculateValue(Pozisyon futbolcuPozisyonu) {
		int altLimit = 10;
		int ustLimit = 100;
		if (this.pozisyonlar != null) {
			boolean contains = this.pozisyonlar.contains(futbolcuPozisyonu);
			altLimit = contains ? 60 : 10;
			ustLimit = contains ? 100 : 50;
		}
		Random rnd = new Random();
		this.value = rnd.nextInt(ustLimit - altLimit) + altLimit;
	}

	public int getValue() {
		return value;
	}

}
