package staj.phisoftware.lig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Lig {

	private List<Takim> takimlar = new ArrayList<Takim>();
	private HashMap<Integer, List<Mac>> fikstur = new HashMap<Integer, List<Mac>>();

	public void fiksturOlustur() {
		int takimSize = 18;
		for (int i = 1; i <= takimSize; i++) {
			takimlar.add(new Takim());
		}

		List<Takim> temp = new ArrayList<Takim>(takimlar);
		List<Takim> ilkHafta = new ArrayList<Takim>();
		for (int i = 0; i < takimSize; i++) {
			int index = new Random().nextInt(temp.size());
			ilkHafta.add(temp.get(index));
			temp.remove(index);
		}

		createWeek(1, ilkHafta);

		for (int i = 0; i < 16; i++) {
			Takim sonTakim = ilkHafta.get(takimSize - 1);
			ilkHafta.remove(takimSize - 1);
			ilkHafta.add(1, sonTakim);
			createWeek(i + 2, ilkHafta);
		}
	}

	private void createWeek(int hafta, List<Takim> takimlar) {

		List<Mac> haftaninMaclari = new ArrayList<Mac>();
		List<Mac> rovansMaclari = new ArrayList<Mac>();
		for (int i = 0; i < 9; i++) {
			haftaninMaclari.add(new Mac(takimlar.get(i), takimlar.get(17 - i)));
			rovansMaclari.add(new Mac(takimlar.get(17 - i), takimlar.get(i)));

		}
		fikstur.put(hafta, haftaninMaclari);
		fikstur.put(hafta + 17, rovansMaclari);

	}

	public static void main(String[] args) {

		Lig lig = new Lig();
		lig.fiksturOlustur();

		for (int i = 1; i <= 34; i++) {
			List<Mac> macs = lig.getFikstur().get(i);

			System.out.println("  ");
			System.out.println("  ");
			System.out.println(i + ". hafta maçlarý");
			for (Mac mac : macs) {
				mac.yazdir();
			}

			for (Mac mac : macs) {
				mac.hazirla();
				mac.macOyna();
			}

			System.out.println("  ");
			System.out.println("  ");
			System.out.println(i + ". hafta maç sonuçlarý");
			for (Mac mac : macs) {
				mac.yazdir();
			}

			System.out.println("  ");
			System.out.println("  ");
			System.out.println(i + ". hafta  puan sýralamasý");
			List<Takim> temp = new ArrayList<Takim>(lig.getTakimlar());
			for (int a = 0; a < temp.size() - 1; a++) {
				Takim takim = temp.get(a);
				int index = a;
				for (int b = a + 1; b < temp.size(); b++) {
					if (isSmall(temp.get(b), takim)) {
						takim = temp.get(b);
						index = b;
					}

				}

				if (index != a) {
					temp.remove(index);
					temp.add(index, temp.get(a));
					temp.remove(a);
					temp.add(a, takim);
				}
			}

			for (Takim takim : temp) {
				System.out.println(takim);
			}

		}

	}

	private static boolean isSmall(Takim takim, Takim takim2) {

		if (takim.getPuan() != takim2.getPuan())
			return takim.getPuan() > takim2.getPuan();

		if (takim.getAVG() != takim2.getAVG())
			return takim.getAVG() > takim2.getAVG();
		if (takim.getGolAt() != takim2.getGolAt())
			return takim.getGolAt() > takim2.getGolAt();

		return takim.getGal() > takim2.getGal();

	}

	public List<Takim> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(List<Takim> takimlar) {
		this.takimlar = takimlar;
	}

	public HashMap<Integer, List<Mac>> getFikstur() {
		return fikstur;
	}

	public void setFikstur(HashMap<Integer, List<Mac>> fikstur) {
		this.fikstur = fikstur;
	}
}
