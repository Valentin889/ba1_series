package serie3;

public class Rebonds1 {
	
	public static void main(String[] args) {
	
		double h = 25;
		final double G = 9.81;
		final double EPS = 0.9;
		double v = Math.sqrt(2*h*G);
		int nbr = 10;
		double hFinal = 0;
		
		for (int i = 0; i < nbr; i++) {
			
			v = EPS*v;
			hFinal = Math.pow(v, 2)/(2*G);
			
		}
		
		
		System.out.println(hFinal);
	}
}
