import java.util.Scanner;
class AssQ6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius=");
		int r=sc.nextInt();
		float a=3.14F*r*r;
		System.out.println("Area of Circle ="+a);
		float c=2*3.14F*r;
		System.out.println("Circumference of the circle ="+c);
	}
}