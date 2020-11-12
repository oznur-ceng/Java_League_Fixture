package staj.phisoftware.lig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import phisoftware.staj.util.UtilMethods;
import staj.phisoftware.lig.enums.Pozisyon;

public class Takim {
	private List<Futbolcu> futbolcular = new ArrayList<Futbolcu>();
	private List<Futbolcu> ilkonbir = new ArrayList<Futbolcu>();
	private String isim;
	private Ozellik seyirciGucu;
	private double avgSavunma;
	private double avgHucum;
	private double avgGuc;
	private int oynadigi;
	private int golAt;
	private int golYe;
	private int puan;
	private int gal;
	private int mag;
	private int ber;

	public Takim() {
		isim = UtilMethods.isimOlusturma();
		futbolculariOlustur();
	}

	public void futbolculariOlustur() {
		for (int i = 0; i < 25; i++) {

			if (i < 3) {
				futbolcular.add(new Futbolcu(Pozisyon.KALE));
			}

			if (i >= 3 && i < 11) {
				futbolcular.add(new Futbolcu(Pozisyon.SAVUNMA));
			}

			if (i >= 11 && i < 19) {
				futbolcular.add(new Futbolcu(Pozisyon.ORTA_SAHA));
			}

			if (i >= 19) {
				futbolcular.add(new Futbolcu(Pozisyon.HUCUM));
			}
		}
	}

	public void macaHazirlan(boolean isHomeGame) {
		ilkonbir = ilkonbiriOlustur();
		seyirciGucu = new Ozellik(null);
		seyirciGucu.calculateValue(isHomeGame);
		avgSavunma = avgSavunmaHesapla();
		avgHucum = avgHucumHesapla();
		avgGuc = (seyirciGucu.getValue() + avgSavunma + avgHucum) / 3;
	}

	public void macSonuclandi(int golAt, int golYe) {
		this.oynadigi += 1;
		this.golAt += golAt;
		this.golYe += golYe;
		if (golAt > golYe) {
			this.puan += 3;
			this.gal += 1;
		} else if (golAt == golYe) {
			this.puan += 1;
			this.ber += 1;
		} else {
			this.mag += 1;
		}

	}

	private double avgHucumHesapla() {
		double total = 0;
		for (int i = 5; i < 11; i++) {
			Futbolcu temp = ilkonbir.get(i);
			double guc = temp.getAvgGuc();
			total += guc;
		}
		return total / 6;
	}

	private double avgSavunmaHesapla() {
		double total = 0;
		for (int i = 0; i < 9; i++) {
			Futbolcu temp = ilkonbir.get(i);
			double guc = temp.getAvgGuc();
			total += guc;
		}
		return total / 9;
	}

	private List<Futbolcu> ilkonbiriOlustur() {

		List<Futbolcu> kaleciler = new ArrayList<Futbolcu>(futbolcular.subList(0, 3));
		List<Futbolcu> savunmacilar = new ArrayList<Futbolcu>(futbolcular.subList(3, 11));
		List<Futbolcu> ortasahaOyunculari = new ArrayList<Futbolcu>(futbolcular.subList(11, 19));
		List<Futbolcu> hucumcular = new ArrayList<Futbolcu>(futbolcular.subList(19, 25));

		List<Futbolcu> ilkonbir = new ArrayList<Futbolcu>();
		for (int i = 0; i < 11; i++) {
			if (i < 1) {
				int index = new Random().nextInt(kaleciler.size());
				Futbolcu f = kaleciler.get(index);
				ilkonbir.add(f);
			}

			if (i >= 1 && i < 5) {
				int index = new Random().nextInt(savunmacilar.size());
				Futbolcu f = savunmacilar.get(index);
				ilkonbir.add(f);
				savunmacilar.remove(f);
			}

			if (i >= 5 && i < 9) {
				int index = new Random().nextInt(ortasahaOyunculari.size());
				Futbolcu f = ortasahaOyunculari.get(index);
				ilkonbir.add(f);
				ortasahaOyunculari.remove(f);
			}

			if (i >= 9 && i < 11) {
				int index = new Random().nextInt(hucumcular.size());
				Futbolcu f = hucumcular.get(index);
				ilkonbir.add(f);
				hucumcular.remove(f);
			}
		}
		return ilkonbir;
	}

	@Override
	public String toString() {
		return ((int) avgGuc) + " " + isim + " O:" + oynadigi + " G:" + gal + " B:" + ber + " M:" + mag + " A:" + golAt
				+ " Y:" + golYe + " AVG:" + (golAt - golYe) + " P:" + puan;
	}

	public List<Futbolcu> getFutbolcular() {
		return futbolcular;
	}

	public void setFutbolcular(List<Futbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}

	public List<Futbolcu> getIlkonbir() {
		return ilkonbir;
	}

	public void setIlkonbir(List<Futbolcu> ilkonbir) {
		this.ilkonbir = ilkonbir;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getAvgSavunma() {
		return avgSavunma;
	}

	public void setAvgSavunma(double avgSavunma) {
		this.avgSavunma = avgSavunma;
	}

	public double getAvgHucum() {
		return avgHucum;
	}

	public void setAvgHucum(double avgHucum) {
		this.avgHucum = avgHucum;
	}

	public double getAvgGuc() {
		return avgGuc;
	}

	public void setAvgGuc(double avgGuc) {
		this.avgGuc = avgGuc;
	}

	public Ozellik getSeyirciGucu() {
		return seyirciGucu;
	}

	public void setSeyirciGucu(Ozellik seyirciGucu) {
		this.seyirciGucu = seyirciGucu;
	}

	public int getOynadigi() {
		return oynadigi;
	}

	public void setOynadigi(int oynadigi) {
		this.oynadigi = oynadigi;
	}

	public int getGolAt() {
		return golAt;
	}

	public void setGolAt(int golAt) {
		this.golAt = golAt;
	}

	public int getGolYe() {
		return golYe;
	}

	public void setGolYe(int golYe) {
		this.golYe = golYe;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getGal() {
		return gal;
	}

	public void setGal(int gal) {
		this.gal = gal;
	}

	public int getMag() {
		return mag;
	}

	public void setMag(int mag) {
		this.mag = mag;
	}

	public int getBer() {
		return ber;
	}

	public void setBer(int ber) {
		this.ber = ber;
	}

	public int getAVG() {

		return golAt - golYe;
	}

}
