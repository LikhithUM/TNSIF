package Assignment01;
import java.util.*;
public class SmallestOfThreeNumbers {
	
	private int a,b,c;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		System.out.println("enter third number");
		c=sc.nextInt();
	}
	
	void smallestNumber()
	{
		if(a==b && b==c)
		{
			System.out.println("All numbers are equal");
		}
		else
		{
			int min=(a<b) ? ((a<c)?a:c) : ((b<c)? b:c);
			System.out.println("Smallest Number is: "+min);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestOfThreeNumbers obj=new SmallestOfThreeNumbers();
		obj.input();
		obj.smallestNumber();
	}

}
