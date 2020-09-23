import java.util.Scanner; 
class largestNo
{
	public static void main(String[] args) 
	{
	
		int max;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the fucking no.");
		int n=sc.nextInt();
         int [] a = new int[n];
         System.out.println("enter the  no.s");
         	

          for (int i=0;i<a.length ;i++ ) 
         {
         	 a[i]=sc.nextInt();
         }
         	max=a[0];
         	for (int i=1;i<a.length ;i++ ) 
         	{
         	 if(a[i]>max)
         	 {
         		max=a[i];
         	 }
         	}
         	
         
          System.out.println("the no."+ max);
	}
}