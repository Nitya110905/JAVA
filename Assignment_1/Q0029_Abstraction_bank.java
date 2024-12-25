package Assignment_1;

abstract class bank{
	abstract int getBalance();
}

class BankA extends bank{
	private int balance = 100;
	@Override
	int getBalance() {
		return balance;
		// TODO Auto-generated method stub
		
	}
	
}

class BankB extends bank{
	private int balance = 150;
	@Override
	int getBalance() {
		return balance;
		// TODO Auto-generated method stub
		
	}
	
}

class BankC extends bank{
	private int balance = 200;
	@Override
	int getBalance() {
		return balance;
		// TODO Auto-generated method stub
		
	}
	
}

public class Q0029_Abstraction_bank {
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		System.out.println("Balance in BankA : $" + a.getBalance());
		System.out.println("Balance in BankB : $" + b.getBalance());
		System.out.println("Balance in BankC : $" + c.getBalance());
	}
}
