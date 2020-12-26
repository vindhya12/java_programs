class Ada1
{
	public static void main(String args[])
	{
		int m=140;
		int n=15;
		int ans=1;
		int i,sum=0;
		
		while(m>=0)
		{
			i=1;
			ans=ans*(ans+1);
			m=m-n;
			sum=sum+i;
			i++;
			
		}
		System.out.println("sum= "+sum);
	}
}