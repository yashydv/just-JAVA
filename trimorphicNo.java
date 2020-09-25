import java.util.Scanner;
class trimorphicNo
{
	public static void main(String[] args) {
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("no. plzzz");
		int n = sc.nextInt();
		temp=n;
		int c=n*n*n;
		String num=String.valueOf(n);
        String cube =String.valueOf(c);
		if (cube.endsWith(num))
		 {
			System.out.println(temp+"no. is trimorphic no.");
			
		}
		else 
		{
			System.out.println(temp+"no. is not trimorphic no.");
		}
	}
}