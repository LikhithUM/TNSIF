package Assignment01;
import java.util.*;

public class SkyAirLines {
	
	private String name,source,dest;
	public  void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Sky Airlines Services");
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Source");
		source=sc.next();
		System.out.println("Enter Destination");
		dest=sc.next();
	}
	void output()
	{
		System.out.println("Dear "+name+",Welcome onboard with service from "+source+" to "+dest+".Thank you for choosing Sky Airlines. Enjoy your flight.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkyAirLines obj=new SkyAirLines();
		obj.input();
		obj.output();
	}

}
