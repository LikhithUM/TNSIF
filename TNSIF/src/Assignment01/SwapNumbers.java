package Assignment01;

import java.util.*;

public class SwapNumbers {
	
	private int first,second;
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		first=sc.nextInt();
		System.out.println("enter second number");
		second=sc.nextInt();
	}
	
	void swapping()
	{
		first = first^second;
		second = first^second;
		first = first^second;
	}
	
	void output()
	{
		System.out.println("After swapping--");
		System.out.println("first number: "+ first);
		System.out.println("Second number: "+ second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers obj = new SwapNumbers();
		obj.input();
		obj.swapping();
		obj.output();
	}

}
