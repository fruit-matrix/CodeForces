import java.util.Scanner;

public class MaximumIncrease
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int max = 0;

		int temp = 0;

		for(int i = 0; i < n; i++)
		{
			temp = 1;

			for(int j = i; j < n-1; j++)
			{
				if(arr[j] < arr[j+1])
					temp++;
				else
					break;
			}

			if(temp > max)
				max = temp;
		}

		System.out.println(max);
	}
}