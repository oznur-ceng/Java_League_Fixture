package phisoftware.staj.util;

import java.util.Random;

public class UtilMethods {
	public static String isimOlusturma() {
		Random rastgele = new Random();
		int rast = rastgele.nextInt(25) + 65;
		String isim = new Character((char) rast).toString();

		for (int i = 1; i < 10; i++) {
			rast = rastgele.nextInt(26) + 96;
			if (rast == 96)
				rast += 3;
			isim += new Character((char) rast).toString();
		}
		return isim;
	}

}
