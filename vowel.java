	import java.util.*;
class vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("give a letter to indentify vowel & consonant : ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print("The given character "+ch+" is vowel");
				break;
			default:
				System.out.print("The given character "+ch+" is consonant");
		}
	}
}