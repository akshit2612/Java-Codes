import java.util.*;
class Distance
{
	private int km,meter;
	Scanner sc = new Scanner(System.in);

	public void input()
	{
	System.out.println("Enter kiolmeters ");
	km = sc.nextInt();
	System.out.println("Enter meters ");
	meter = sc.nextInt();
	
	}

	public void show()
	{
	System.out.println("Distance is "+ km +" km "+meter +" mt");
	}


}
class DisRec
{
	public static void main(String args[])
	{
		
		Distance a = new Distance();
		a.input();
		a.show();
	}
}