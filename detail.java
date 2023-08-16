import java.util.*;
class detail
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the name of a student = ");
		String a=sc.next();
		System.out.print("enter the roll number of a student = ");
		int b=sc.nextInt();
		System.out.print("enter the marks of first subject = ");
		int c=sc.nextInt();
		System.out.print("enter the marks of second subject = ");
		int d=sc.nextInt();
		System.out.print("enter the marks of thrid subject = ");
		int e=sc.nextInt();
		System.out.println("The name of a student is "+a);
		System.out.println("Roll number of student is "+b);
		System.out.println("Marks of first subject is "+c);
		System.out.println("Marks of second subject is "+d);
		System.out.println("Marks of thrid subject is "+e);
	}
}