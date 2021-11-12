package serie7;

public class Triange {
	private Point[] points;
	
	public Triange(Point p1, Point p2, Point p3) {
		points = new Point[] {p1,p2,p3};
		
	}
	
	
	public void afficherPerimetre() {
		System.out.println("le perimetre du triange est : "+calculerPerimetre());
	}
	
	public boolean isIsocele() {
		
		return false;
	}
	
	
	
	private double calculerPerimetre() {
		
		double perimetre = 0;
		
		
		for (int i = 0; i < points.length; i++) {
			Point p1 = points[i];
			Point p2 = i+1==points.length ? points[0] : points[i+1];
			double dist = Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));
			perimetre+=dist;
			
		}
		
		return perimetre;
		
	}
	
	
}
