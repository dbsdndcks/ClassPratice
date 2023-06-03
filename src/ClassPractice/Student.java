package ClassPractice;

public class Student {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("¿õÂù");
		student.setNum(26);
		System.out.println(student.getName());
		System.out.println(student.getNum());
	}


	
	
}
