import java.util.*;
class cal_of_area
{
	public static void main(String[] args)
	{
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("If enter 1 then area of a square will be print");
		System.out.println("If enter 2 then area of a circle will be print");
		System.out.println("If enter 3 then area of a rectangle will be print");
		System.out.println("By default area of a triangle will be print");
		System.out.print("enter the number to print areas = ");
		int a=sc.nextInt();
		switch (a)
		{
			case 1:
				System.out.print("enter the length of a sqaure = ");
				float b=sc.nextFloat();
				c=b*b;
				System.out.print("the area of a sqaure = "+c);
				break;
			case 2:
				System.out.print("enter the radius of a circle = ");
				double h=sc.nextDouble();
				c=3.14*h*h;
				System.out.print("enter the area of a circle = "+c);
				break;
			case 3:
				System.out.print("enter the length of a rectangle = ");
				float d=sc.nextFloat();
				System.out.print("enter the breadth of a rectangle = ");
				float e=sc.nextFloat();
				c=d*e;
				System.out.print("enter the area of a rectangle = "+c);
				break;
			default:
				System.out.print("enter the base of a triangle = ");
				float f=sc.nextFloat();
				System.out.print("enter the height of a triangle = ");
				float g=sc.nextFloat();
				c=(g*f)/2;
				System.out.print("enter the area of a triangle");
		}
	}
}