
public class Calculator {
	//
	public int Addition(int n1,int n2)
	{
		return n1+n2;
	}
	public double Addition(double n1,double n2)
	{
		return n1+n2;
	}
	//
	public int Subtraction(int n1,int n2)
	{
		return n1+n2;
	}
	public double Subtraction(double n1,double n2)
	{
		return n1+n2;
	}
	//
	public int Multiplication(int n1,int n2)
	{
		return n1+n2;
	}
	public double Multiplication(double n1,double n2)
	{
		return n1+n2;
	}
	//
	public int Division(int n1,int n2)
	{
		return n1+n2;
	}
	public double Division(double n1,double n2)
	{
		return n1+n2;
	}
	//variable args method....
	public int Addition(int...n1)
	{
		int n=0;
		for(int i=0;i<n1.length;i++)
		{
			n+=n1[i];
		}
		return n;
	}
	public static void main(String[] args) {
		Calculator calcii=new Calculator();
		//int n=calcii.Addition(4,8);
		System.out.println("addition of two int  " +calcii.Addition(3,6));
		System.out.println("addition of two double  " +calcii.Addition(12.7,71.2));
		System.out.println("addition of two int  " +calcii.Subtraction(17,8));
		System.out.println("addition of two double  " +calcii.Subtraction(12.7,71.2));
		System.out.println("addition of two int " +calcii.Multiplication(7,72));
		System.out.println("addition of two double " +calcii.Multiplication(45.7,71.2));
		System.out.println("addition of two int " +calcii.Division(7,4));
		System.out.println("addition of two double " +calcii.Division(45.7,11.5));
		
		
	}

}
