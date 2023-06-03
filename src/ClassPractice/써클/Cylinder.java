package ClassPractice.Ω·≈¨;

public class Cylinder {
	Circle circle;
	double high;
	
	public Cylinder(Circle circle, double high) {
		this.circle = circle;
		this.high = high;
	}
	
	public double getVolume() {
		return circle.getArea() * high;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(2.8);
		Cylinder cylinder = new Cylinder(new Circle(2.8),5.6);
		System.out.println(cylinder.getVolume());
		
		
		
		
	}
}
