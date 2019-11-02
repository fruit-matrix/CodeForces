import java.util.Scanner;

public class ForgettingThings
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a == b)
		{
			System.out.println(a + "1 " + b + "2");
		}
		else if(b - a == 1)
		{
			System.out.println(a + "9 " + b + "0");
		}
		else if(b == 1 && a == 9)
		{
			System.out.println(a + "9 " + b + "00");
		}
		else
		{
			System.out.println("-1");
		}
	}
}