package lab24_julycustomer1;

public class defaultdata {
	//default
	String gamename="hockey";
	int gameid=121;
	String gametype="outdoor";
	void fetchgamename() {
		System.out.println("game name is "+gamename);
	}
	void fetchgameid() {
		System.out.println("game name is "+gameid);
	}
	void fetchgametype() {
		System.out.println("game name is "+gametype);
	}
	public static void main(String[] args) {
		defaultdata dd=new defaultdata ();
		dd.fetchgamename();
		dd.fetchgameid();
		dd.fetchgametype();
		
	}
	
			

}
