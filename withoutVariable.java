import java.util.Scanner;
class withoutVariable
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int a= sc.nextInt();
		int b= sc.nextInt();

		System.out.println(" the value before swipe a ="+ a +", b ="+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(" the value after swipe a ="+a+", b ="+b );



	}
}