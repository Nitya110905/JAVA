package Assignment_1;

import java.util.Scanner;

class Insufficient_balance extends Exception{
	public Insufficient_balance(String msg) {
		super(msg);
	}
}

class Bank_acc{
	private double balance;
	
	public Bank_acc(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amt) throws Insufficient_balance{
		if(amt>balance) {
			double shortage = amt - balance;
			throw new Insufficient_balance("Sorry, insufficient balance, you need more " + shortage + "Rs. to perform this transaction");
		}
		else {
			balance-=amt;
			System.out.println("Withdrawal successful. Remaining balance = " + balance);
		}
	}
	
	public double getBalance() {
		return balance;
		}
}
public class Q0037_Custom_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank_acc acc = new Bank_acc(2000);
		System.out.println("Account balance is : " + acc.getBalance());
		System.out.println("Enter the amt. to be withdrawn : ");
		double amt = sc.nextDouble();
		try {
			acc.withdraw(amt);
		} catch (Insufficient_balance e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
