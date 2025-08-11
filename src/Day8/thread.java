package Day8;
class Samplethread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("samplethread");
	}
	}
	
	
}

public class thread {
	public static void main(String[] args) {
		Samplethread st=new Samplethread();
		
		st.start();
		for(int i=1;i<=5;i++) {
			System.out.println("mainthread");
		}
	}

}
