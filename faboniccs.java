import java.util.Scanner;
class fibonicss
{
	public static void main(String[] args) 
	{
	int a=0,b=1,c;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.");
	int user_no=sc.nextInt();

	while (true) {
		c=a+b;
		count++;
		if (c>=user_no) 
		{
			break;
			
		}
		a=b;
		b=c;
		System.out.println("\n fibonicss no " + count + "-> "+c);
	}
    


             
	}
}