import java.util.Scanner;
class evenOdd
{
	 public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fucking no.");
		int n=sc.nextInt();

		/* int n; n=67; */

		if(n%2==0)
		{
			System.out.println("no. is even");
		}
		else
		{
          System.out.println("no. is odd");
		}

	}
}