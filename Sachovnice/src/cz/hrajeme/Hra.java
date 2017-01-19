package cz.hrajeme;

public class Hra {

	public static void main(String[] args) {
		int tahy = 1;
		int posun1 = Integer.parseInt(args[0]);
		int posun2 = Integer.parseInt(args[1]);
		int velikostpole = Integer.parseInt(args[2]);
		int cilovepole = Integer.parseInt(args[3]);

		int[] pole = new int[velikostpole];
		pole[0] = 0;

		for (int i = 0; i <= tahy; i++) {
			if (Integer.valueOf(pole[i + posun1]) == 0) {
				pole[i + posun1] = tahy;
				tahy++;
			}
			if (Integer.valueOf(pole[i + posun2]) == 0) {
				pole[i + posun2] = tahy;
				tahy++;
			}
			if (Integer.valueOf(pole[i - posun1]) == 0) {
				pole[i - posun1] = tahy;
				tahy++;
			}
			if (Integer.valueOf(pole[i - posun2]) == 0) {
				pole[i - posun2] = tahy;
				tahy++;
			}
		}
	}
}