class PrimitiveDataTypes
{
	public static void main(String args[])
	{
		int x=4;
		int y=x*x+3*x-7;
		System.out.println("A) y= "+y);
		int y1=x++ + ++x;
		System.out.println("B) y1= "+y1+" x= "+x);
		int y2=5;
		int z=x++ - --y2 - --x + x++;
		System.out.println("C) x= "+x+" y2= "+y2+" z= "+z);
		boolean a= true;
		boolean b= true;
		boolean c= a && b || !(a || b);
		System.out.println("D)c= "+c);
 
		
		
		
	}
}
