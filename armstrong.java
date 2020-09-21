import java.util.Scanner;
class armstrong
{
	public static void main(String[] args) {
		int temp=0,i=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();

        temp=n;
        while (n>0) 
        {
        	i=n%10;
        	n=n/10;
        	sum=sum+(i*i*i);
        }
        	if (sum==temp) 
        	{
        	System.out.println("no. is armstrong");	
        	}
        	else {
        		System.out.println("no. nhi hai armstrong ja.. ghar jaaa....");
        	}
        	
        

	}
}