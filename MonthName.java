package general;

public class MonthName {

	public static String findMonthName(int n) {
		String[] s = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December", "Invalid Number" };
		if (n >= 1 && n <= 12) {
			return s[n - 1];
		} else {
			return s[12];
		}
	}

	public static void main(String[] args) {
	}
}
