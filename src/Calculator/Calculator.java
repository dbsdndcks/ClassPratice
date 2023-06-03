package Calculator;

public class Calculator {
	int left, right;
	static double PI = 3.14;
	public void setNum(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.err.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
