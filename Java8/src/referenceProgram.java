
public class referenceProgram 
{
	public static void main(String[] args) 
	{
		final int[] a= {1,2,3,4,5};
		methodM1(a);
		System.out.println(a[1]);
		
		String str1="3DPLM";
		stringMethod(str1);
		System.out.println(str1);
	}
	
	static void methodM1(int[] a)
	{
		a[1]=24;
		System.out.println(a[1]);
	}
	
	static void stringMethod(String str1)
	{
		str1="3DS";
		System.out.println(str1);
	}
}
