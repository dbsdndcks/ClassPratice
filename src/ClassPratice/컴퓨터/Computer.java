package ClassPratice.컴퓨터;

public class Computer {
	private String model;
	private int memory;
	public String[]osType = {"윈도7","애플","안드로이드"};
	
	public Computer(int model, int memory) {
		super();
		this.model = osType[model];
		this.memory = memory;
	}

	
	public void print() {
		System.out.println("운영체제: " + model +", 메인메모리: " + memory);
	}
	
//	=============================================
	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		pc.print();
		
		Computer apple = new Computer(1, 32);
		apple.print();
	}
	
	
	
}
