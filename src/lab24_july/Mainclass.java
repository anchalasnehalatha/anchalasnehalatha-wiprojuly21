package lab24_july;

	public class Mainclass{
		public static void main(String[] args) {
		   Payment p;

		   p = new CreditCard();
		   p.pay();

		   p = new UPI();
		   p.pay();

		   p = new NetBanking();
		   p.pay();
		}
		}


