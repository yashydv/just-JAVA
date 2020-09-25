import java.util.Scanner;
class automorphicNo
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" the no. plzz");
		int n=sc.nextInt();
		int sq=n*n;
		String num=String.valueOf(n);
		String squre=String.valueOf(sq);
		if (squre.endsWith(num)) {
			System.out.println(n+" the no. is Automorphic");
			
		}else {
			System.out.println(n+" the no. is not Automorphic ,chalajaaaaaaa b@#k");
		}
	}
}