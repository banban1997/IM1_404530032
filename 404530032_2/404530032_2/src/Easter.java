
public class Easter {

	static String calculateEaster(int Y) {
		int a, b, c, k, p, q, M, N, d, e;
		int aMonth = 0, aDay = 0;

		a = Y % 19;
		b = Y % 4;
		c = Y % 7;
		k = (Y / 100);// Math.floor(), -2
		p = ((13 + 8 * k) / 25);
		q = (k / 4);
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;

		if ((d + e) > 9) {
			aMonth = 4;
		} else {
			aMonth = 3;
		}

		if (aMonth == 3) {
			aDay = 22 + d + e;
		}
		if (aMonth == 4) {
			if (d == 29 && e == 6) {
				aDay = 19;
			} else if (d == 28 && e == 6 && (11 * M + 11) % 30 > 19) {
				aDay = 18;
			} else {
				aDay = d + e - 9;
			}

		}

		return "In " + Y + ", Easter Sunday is: month = " + aMonth + " and day =" + aDay;

	}
}
