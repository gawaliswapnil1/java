
public class MainClass {

	int instanceVariable;
	static  int staticVariable;
	final int finalInstance;
//	final int  instanceFinalVariable;
	//final static int staticFinalVariable;
	
	{
	
	}
	static 
	{
		
	
	}
	public MainClass() 
	{
		finalInstance=10;
	}
	public static void main(String[] args) throws AgeException 
	{
/*		MainClass m1=new MainClass();
		m1.method();
		
		System.out.println("Static variable initialized");
		System.out.println(staticVariable);
*/	
		if(true)
		{
			throw new AgeException("You are in exception");
		}
	}

	public void method()
	{
		System.out.println(instanceVariable);
	}
}
