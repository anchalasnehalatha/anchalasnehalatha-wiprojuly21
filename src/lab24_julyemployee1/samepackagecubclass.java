package lab24_julyemployee1;

public class samepackagecubclass extends class1 {
	 
		public void read() {
			System.out.println("reading");
		}
		public static void main(String[] args) {
		samepackagecubclass obj=new samepackagecubclass();
		obj.read();//own method
		obj.display();//inherited
        obj.fetchempid();
		obj.fetchempadd();
		
		
	
	}
}
