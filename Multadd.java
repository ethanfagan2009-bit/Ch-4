public class Multadd {
	
	public static double multadd(double a, double b, double c) {
		return a * c + b;
	}
	public static double multTrig(double sinx, double cosx) {
		return multadd(1.0, Math.sin(sinx), Math.cos(cosx)/2);
	}
	public static double multLog(double log1, double log2) {
		return multadd(1.0, Math.log(log1), Math.log(log2));
	}
	public static double expSum(double x) {
		return multadd(x, Math.pow(Math.E, -1*x), Math.sqrt(1-Math.pow(Math.E, -1*x)));
	}
	
	public static void main(String[] arg) {
		System.out.println(expSum(10));
		System.out.println(multTrig(Math.PI/4, Math.PI/4));
		System.out.println(multLog(10, 20));
	}
}
