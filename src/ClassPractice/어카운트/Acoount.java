package ClassPractice.어카운트;

import java.util.Scanner;

public class Acoount {
	private String owner;
	private long balance;
	
	
	//게터 세터
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
	
	
	//모든 생성자
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
	
	//문제7 기능추가 메소드
	public long deposit(long amount) {
		return	this.balance += amount;
	}
	
	public long withdraw(long amount) {
		if(amount > this.balance) {
			System.out.println("잔액이 부족합니다.");
		}
		return this.balance -= amount;

	}
	
//	main=============================================
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Acoount acoount = new Acoount();
	
		
		System.out.println(acoount.deposit(sc.nextLong()));
	
		System.out.println(acoount.withdraw(sc.nextLong()));
		System.out.println("남은 잔액 : " + acoount.balance);
		
		System.err.println(acoount.withdraw(sc.nextLong()));
	}
	
	
}
