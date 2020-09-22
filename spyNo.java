 import java.util.Scanner;
 class spyNo
 {
 	public static void main(String[] args) {
 		int sum=0,mul=1,r,temp;
 		Scanner sc=new Scanner(System.in);
 		System.out.println(" the no. plzz");
 		int n=sc.nextInt();
 		temp=n;
         while (n>0) 
         {

          r=n%10;
          sum=sum+r;
          mul=mul*r;
          n=n/10;        	
         }
         if (sum==mul) {
         	System.out.println(temp+" the no. is spy");
         	
         }else {
         	System.out.println(n+" the no. is not  spy ,ghar jaa ");
         }


 	}
 }