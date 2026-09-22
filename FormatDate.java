public class FormatDate{ 
	
	public static void american(int day, String month, int year, String weekday) {
		System.out.println(weekday + ", " + month + " " +day + ", " + year);
	}
		public static void european(int day, String month, int year, String weekday) {
		System.out.println(weekday + " " + day +" "+ month +" "+ year);
	}

	public static void main(String[] arg) {
		american(22, "September", 2026, "Tuesday");
		european(22, "September", 2026, "Tuesday");
	}
}
