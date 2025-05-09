import java.util.Scanner;

class Rectangle
{
    protected int l,b;
    Scanner sc = new Scanner(System.in);
    Rectangle()
	{
	l = b = 1;
	}
	Rectangle(int x,int y)
	{
		l = x;
		b = y;
	}
    public void input()
    {
        System.out.print("Enter Length : ");
        l = sc.nextInt();
        System.out.print("Enter Breadth : ");
        b = sc.nextInt();

    }
    public void show()
    {
        System.out.println("Length is "+l);
        System.out.println("Breadth is "+b);

    }
    public void area()
    {
        System.out.println("Area is "+(l*b));
    }

}
class Cuboid extends Rectangle
{
	private int h;
	Cuboid()
	{
		super();
		h = 1;
	}
	Cuboid(int x,int y,int z)
	{
		super(x,y); // Fixed missing semicolon
		h = z;
	}
	public void input()
	{
		super.input();
		System.out.print("Enter height : ");
		h = sc.nextInt();
	}
	public void show()
	{
		super.show();
		System.out.println("Height is "+h);
	}
	public void area()
	{
		int a;
		a = 2*(l*b+b*h+h*l);
		System.out.println("Area is "+a);
	}

}
public class Inh1
{
    public static void main(String args[])
    {
	Cuboid c = new Cuboid();
	Rectangle r = new Rectangle();
	c.input();
	c.show();
	c.area();
	r.input();
	r.show();
	r.area();
}
}
