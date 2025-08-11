package lab24_july;

//Methodoverriding:It is the concept of inheriting a method from superclass and changing the method defination while keeping same method declaration.

//Base class
class Payment {
public void pay() {
   System.out.println("Payment method selected.");
}
}

//Child class: CreditCard
class CreditCard extends Payment {
@Override
public void pay() {
   System.out.println("Paid using Credit Card.");
}
}

//Child class: UPI
class UPI extends Payment {
@Override
public void pay() {
   System.out.println("Paid using UPI.");
}
}

//Child class: NetBanking
class NetBanking extends Payment {
@Override
public void pay() {
   System.out.println("Paid using Net Banking.");
}
}





