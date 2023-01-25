package entities;

public class Cambio {
	
		public static final double taxa = 1.06;

		public static double enchange(double dolarPrico, double quantidade) {
			return (dolarPrico * quantidade) * taxa;
		}
}
