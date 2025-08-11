package lab24_july;

public class Mainclass3 {
public static void main(String[] args) {
	Savingsaccount sa=new Savingsaccount(123456.00,10000.00);
	sa.calculateintrest();
	sa.balanceprinting();
	Depositaccount fda=new Depositaccount(123456.00,20000.00);
	fda.calculateintrest();
	fda.balanceprinting();
	
}
}
