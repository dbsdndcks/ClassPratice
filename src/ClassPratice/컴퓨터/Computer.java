package ClassPratice.��ǻ��;

public class Computer {
	private String model;
	private int memory;
	public String[]osType = {"����7","����","�ȵ���̵�"};
	
	public Computer(int model, int memory) {
		super();
		this.model = osType[model];
		this.memory = memory;
	}

	
	public void print() {
		System.out.println("�ü��: " + model +", ���θ޸�: " + memory);
	}
	
//	=============================================
	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		pc.print();
		
		Computer apple = new Computer(1, 32);
		apple.print();
	}
	
	
	
}
