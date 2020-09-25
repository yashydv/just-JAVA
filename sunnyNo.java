import java.util.Scanner;
class sunnyNO
{
	public static void main(String[] args) {
		double temp;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		temp= Math.sqrt(n+1);
		if (temp==(int)temp) {
			System.out.println("no. is sunny");

			
		}
		else {
			System.out.println("no. is  not sunny");
		}
	}
}