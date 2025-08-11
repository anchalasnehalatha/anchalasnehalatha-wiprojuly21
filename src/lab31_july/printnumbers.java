package lab31_july;

public class printnumbers {
	public static void main(String[] args) {
		printnumbers(1);
	}
		
		static void printnumbers(int num) {
			if(num<=100) {
				System.out.println(num);
				printnumbers(num+1);
			}
		}
	}


