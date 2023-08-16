/* W.A Java program to create 2 classis, in 1st class create data_members
   and data_methods & in another class create 1 main method and access data
   members and data_methods from before class through the object.
   ( perform area of square ). */

class G1
{
	int l = 10;
	void Square()
	{
		System.out.println("Area of square = " + l*l );
	}
}

class G
{
	public static void main(String[] args)
	{
		G1 obj = new G1();
		obj.Square();
	}
}
