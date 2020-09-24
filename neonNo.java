import java. util.Scanner;
class neonNo
{
	public static void main(String[] args) {
		int sum=0;
		int sq;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no.");
		int n = sc.nextInt();
		sq=n*n;
		while (sq>0)
		 {
		 	sum=sum+sq%10;
		 	sq=sq/10;

		}
		if (sum==n) {
			System.out.println(n+" the no. is Neon");
			
		}else {
			System.out.println(n+" the no. is not Neon ,ghar jaa");
		}
	}
}