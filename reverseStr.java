class reverseStr
{
	public static void main(String[] args) 
	{
		String y="yashy2";
		String rev="";
		for (int i=y.length()-1;i>=0 ;i-- )
		 {
			rev=rev+ y.charAt(i);
		}
		System.out.println("the str before rev is- "+y);
		System.out.println("the rev strint is- "+rev);


		if(y.equals(rev)){
			System.out.println("hai yo");
		}else {
			System.out.println("yo nhi hai");
		}
	}


}