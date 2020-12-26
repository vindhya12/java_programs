import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no:");
		int n=sc.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			int r=n*i;
			System.out.println(n+" X " +i+" = "+r);
		}
	}
}