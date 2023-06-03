package ClassPractice.»ø·¯¸®¸Ç;

public class SalaryMan {
	int salary;
	public int getAnnualGross() {
		return salary * 5;
	}
	public SalaryMan() {
		this.salary = 10000000;
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
//	========================================================
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	
	}
	
		
}
