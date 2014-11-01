package Easy;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	byte age;
	int gf;
	String name;
//	Scanner string = new Scanner(System.in);
	
	System.out.println("How old are you?");
	age = scan.nextByte();
	System.out.println("How many gfs have you had");
	gf = scan.nextInt();
		
	String s = new String();
	s = scan.next();
	System.out.println(s);
	System.out.println("you are this many year years old" + age);
	System.out.println(" you have had this many gfs"+gf);
	
	
	
	
	
	
	
	}

}
