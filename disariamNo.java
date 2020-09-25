import java.util.Scanner;
class disariamNo
{
	public static void main(String[] args) 
	{
		int sum=0,temp,r,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("no. plzz");
		int n=sc.nextInt();
		temp=n;
		while (temp	!=0) 
		{
			temp=temp/10;
			count++;

		}
		temp=n;
		while (temp	!=0)
		 {
		 	r=temp%10;
		 	sum=sum+(int)Math.pow(r,count);
		 	temp=temp/10;
		 	count--;
			
		}
         if (sum==n) {
         	System.out.println(n + " no. is disariamNo ");
         	
         }
         sselse 
         {
         	System.out.println(n +"no. is not disariamNo ");
         }
		
	}
}