import java.util.Scanner;
class happyNo
{
	public static void main(String[] args)
	 {
		int sum=0,r,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no plzz");
		int n=sc.nextInt();
		temp=n;
		while (sum!=1 && sum!=4) 
		{
			sum=0;
			while (n>0) 
			{
				r=n%10;
				sum=sum+(r*r);
				n=n/10;
				
			}
			n=sum;
			
		}

		if (sum==1)
		 { 
			System.out.println(temp+"no. is Happy no.");
		}else {
			System.out.println(temp+"no. is not Happy no. goo home..son");
		}
	}

}