package ClassPractice.사각형;

public class Rectangle {
	double garo;
	double sero;
	
	public Rectangle(double garo, double sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	public double getArea() {
		return garo * sero;
	}
	
	public double getCircumference() {
		return 2*(garo + sero);
	}
	
//	=======================================
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3.82, 8.65);
		System.out.println("면적: " + rectangle.getArea());
		System.out.println("둘레: " + rectangle.getCircumference());
	}
}
