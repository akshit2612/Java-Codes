import java.util.*;
class Time
{
	private int hours,mins,seconds;
	Scanner sc= new Scanner(System.in);
	public Time() //Default Constructor
	{
		hours = 12;
		mins = 30;
		seconds = 45;
	}
	public Time(int x,int y,int z) // Parameterized Constructor
	{
		hours = x;
		mins = y;
		seconds = z;
	}
	public void input()
	{
		System.out.print("Enter Hours : ");
		this.hours = sc.nextInt();
		System.out.print("Enter Minutes : ");
		this.mins = sc.nextInt();
		System.out.print("Enter Seconds : ");
		this.seconds = sc.nextInt();
	}
	public void show()
	{
		System.out.println("Time is "+hours+":"+mins+":"+seconds);
	}
	public int getHours() //Access Method
	{
		return hours;
	}
	public void setHours(int x) //Mutator Method
	{
		hours = x;
	}
	
	void increase()
	{
		seconds++;
	}
}
public class Clock
{
	public static void main(String args[])
	{
		Time t1,t2;
		t1 = new Time();
		t2 = new Time(10,30,20);
		t1.show();
		t2.show();
		t1.input();
		t2.input();
		t1.show();
		t2.show();
		if( t1.getHours() > t2.getHours())
			System.out.println("First Time is Greater");
		else
			System.out.println("Second Time is greater");
	}
}