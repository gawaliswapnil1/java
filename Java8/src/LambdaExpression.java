interface Inter
{
	public void m1(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter i=(a,b)->{System.out.println("Addition of a and b  is"+(a+b)); };
		i.m1(10,20);
	}

}
