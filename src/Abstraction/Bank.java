package Abstraction;

public abstract class Bank {

	public abstract void loan();
	
	public void credit() {
		System.out.println("Bank--credit");
	}
	
	public void debit() {
		System.out.println("Bank--debit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
