package lab25_july;
interface Bankaccount{
	void deposit(double amount);
	void withdraw(double amount);
	void calculateintrest();
	void viewbalance();
}
class savingsaccount implements Bankaccount{
	double balance;
	double intrestrate=0.5;
	savingsaccount(double balance){
		this.balance=balance;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited amount is :"+balance);
		
	}
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("withdrawed amount is : "+balance);
	}
	public void calculateintrest() {
		double intrest=balance*intrestrate;
		balance+=intrest;
		System.out.println("intrest is : " +intrest);
		
	}
	public void viewbalance() {
		System.out.println("the viewed balance is :"+balance);
	}
	//uniquefeature
	public void savingsfeature() {
		System.out.println("it is the account only for savings");
	}
	
}
class currentaccount implements Bankaccount{
	double balance;
	double intrestrate=0.5;
	currentaccount(double balance){
		this.balance=balance;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited amount is :"+balance);
		
	}
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("withdrawed amount is : "+balance);
	}
	public void calculateintrest() {
		double intrest=balance*intrestrate;
		balance+=intrest;
		System.out.println("intrest is : " +intrest);
		
	}
	public void viewbalance() {
		System.out.println("the viewed balance is :"+balance);
	}
	//uniquefeature
	public void currentfeature() {
		System.out.println("it is the account only for current");
	}
	
}
	
	

public class Mainclass3 {
	public static void main(String[] args) {
		savingsaccount sa=new savingsaccount(500);
		sa.deposit(10000);
		sa.withdraw(500);
		sa.calculateintrest();
		sa.viewbalance();
		currentaccount ca=new currentaccount(1000);
		ca.deposit(10000);
		ca.withdraw(500);
		ca.calculateintrest();
		ca.viewbalance();
	}

}
