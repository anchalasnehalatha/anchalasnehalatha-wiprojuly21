package lab24_july;

abstract class Bankaccount {
	double accountnumber;
	double bal;
	Bankaccount(double accountnumber,double bal){
		this.accountnumber=accountnumber;
		this.bal=bal;
	}
	abstract void calculateintrest();
	 void balanceprinting() {
		 System.out.println("accountnumber is :" +accountnumber);
		 System.out.println("balance is "+bal);
	 }
		
}
//subclass
class Savingsaccount extends Bankaccount{
	Savingsaccount(double accountnumber,double bal){
		super(accountnumber,bal);
	}
	@Override
	void calculateintrest() {
		double intrest=bal*0.04;
		System.out.println(intrest);
	}
	
}
//subclass
class Depositaccount extends Bankaccount{
	Depositaccount(double accountnumber,double bal){
		super(accountnumber,bal);
	}
	@Override
	void calculateintrest() {
		double intrest=bal*0.065;
		System.out.println(intrest);
		
	}
	
}


