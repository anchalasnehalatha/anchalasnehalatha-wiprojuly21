package Day8;
class currentexecutingthread implements Runnable {
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println("Id is :" +th.getId()+"Name is :"+th.getName()+"priority is :"+th.getPriority());
	}
public class Mainclass1{
	public static void main(String[] args) {
		Thread th1=new Thread(new currentexecutingthread());
		th1.setName("sneha");
		th1.setPriority(10);
		th1.start();
		
	}
}

}
