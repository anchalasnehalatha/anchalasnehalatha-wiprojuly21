package lab24_july;

abstract class Billingsystem{
	abstract void generatebill();
	

}
//subclass1
class electricitybill extends Billingsystem{
	int unitsconsumed;
	double costperunit;
	electricitybill(int unitsconsumed,double costperunit){
		this.unitsconsumed=unitsconsumed;
		this.costperunit=costperunit;
	}

	@Override
	void generatebill() {
		double totalelectricitybill=unitsconsumed*costperunit;
		System.out.println("total electricity bill is :" +totalelectricitybill);
		
	}
}
//subclass2
class waterbill extends Billingsystem{
	double totallitres;
	double costperlitre;
	 waterbill(double totallitres,double costperlitre){
		this.totallitres=totallitres;
		this.costperlitre=costperlitre;
	}
	@Override
	void generatebill() {
		double totalwaterbill=totallitres*costperlitre;
		System.out.println("total water bill is : " +totalwaterbill);
		
	}
}
public class Mainclass6{
	public static void main(String[] args) {
		electricitybill eb=new electricitybill(115,1.5);
		eb.generatebill();
		waterbill wb=new waterbill(123,2);
		wb.generatebill();
		
		
	}
}
