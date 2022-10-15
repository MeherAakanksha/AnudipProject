
public class SwitchArithmatic {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		String choice="Substraction";
		switch(choice)
		{
		  case "addition":
		    System.out.println("Addition"+" "+(a+b));
		    break;
		  case "Substraction":
		    System.out.println("Substraction "+" "+(a-b));
		    break;
		  case "Multiplication":
		    System.out.println("Multiplication"+ " "+(a*b));
		    break;
		  case "division":
		    System.out.println("divide"+" "+(a/b));
		    break;
		  case "Modulus":
			    System.out.println("Modulace"+" "+(a%b));
			    break;
		 
		  default:
			  System.out.println("None of the above ");
			    
		}
		

	}

}
		