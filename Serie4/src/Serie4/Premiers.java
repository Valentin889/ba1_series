package Serie4;

public class Premiers {
	public static void main(String[] args) {
	
		
		final int NOMBRE = 100;
		for (int i = 2; i <= NOMBRE; i++) {
		
			if(i==2) {
				System.out.println(i);
			} else {
				
				boolean test = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						test = false;
						break;
					}
				}
				
				if(test) {
					System.out.println(i);
				}
				
			}
		}
	
	}
}
