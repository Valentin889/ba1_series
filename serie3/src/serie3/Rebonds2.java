package serie3;

public class Rebonds2 {
	
	public static void main(String[] args) {
		
		double h = 10;
		double hFinal = 0;
		double hVoulu = 2;
		
		
		final double G = 9.81;
		final double EPS = 0.9;

		double v = Math.sqrt(2*h*G);
		
		int nbr = 0;
		
		do {
			v = EPS*v;
			hFinal = Math.pow(v, 2)/(2*G);
			nbr++;
			
		}while(hFinal > hVoulu);
		
		
		System.out.println(nbr);
	}
}
