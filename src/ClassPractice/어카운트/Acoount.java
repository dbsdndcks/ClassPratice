package ClassPractice.��ī��Ʈ;

import java.util.Scanner;

public class Acoount {
	private String owner;
	private long balance;
	
	
	//���� ����
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	//��� ������
	public Acoount() {
		super();
	}
	
	
	public Acoount(String owner) {
		super();
		this.owner = owner;
	}
	
	
	public Acoount(long balance) {
		super();
		this.balance = balance;
	}
	
	public Acoount(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	//����7 ����߰� �޼ҵ�
	public long deposit(long amount) {
		return	this.balance += amount;
	}
	
	public long withdraw(long amount) {
		if(amount > this.balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		return this.balance -= amount;

	}
	
//	main=============================================
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Acoount acoount = new Acoount();
	
		
		System.out.println(acoount.deposit(sc.nextLong()));
	
		System.out.println(acoount.withdraw(sc.nextLong()));
		System.out.println("���� �ܾ� : " + acoount.balance);
		
		System.err.println(acoount.withdraw(sc.nextLong()));
	}
	
	
}
