package Day1and2;

public class staticvariables {
	public static String studentName="sneha";
	public String college="chandigarh University";
	public static int studid=787;
	public static void main(String[] args) {
		staticvariables sv=new staticvariables();
		//accessing static variables
		System.out.println(studentName);
		System.out.println(studid);
		//accessing the non-static variables
		System.out.println(sv.college);
}

}
