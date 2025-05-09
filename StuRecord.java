import java.util.*;
class Student
{

    //visibility mode/ access specifier / scope
    private int admno;
    String name;
    float marks;

    Scanner sc = new Scanner(System.in);



    public void input(){
        System.out.println("Enter Admission No.");
        admno = sc.nextInt();
        sc.nextLine(); // It removes the Enter key from //input buffer before taking string input for name
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Marks");
        marks = sc.nextFloat();
        }

    public void show(){
        System.out.println("Admission No. : "+admno);
        System.out.println("Name : "+name);
        System.out.println("Marks :"+marks);
        

    }

}

    class StuRecord
    {
        public static void main(String args[])
        {
            Student a,b;      // Declaring the references

            a=new Student();  //Allocating the memory
            b=new Student();
            a.input();
            b.input();
            a.show();
            b.show();

            if(a.marks > b.marks)
            {
                System.out.println(a.name+ " has scored more marks than "+b.name);
            }

            else
            {
                System.out.println(b.name+ " has scored more marks than "+a.name);
            }

        }
    }
