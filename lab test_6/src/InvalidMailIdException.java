import java.util.Scanner;

public class InvalidMailIdException {
			public static void main(String[] args)  {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter your mail address");
			 String s=sc.next();
			  try {
		 boolean b=s.contains("@")&& s.contains(".")&& s.contains("com")&& s.contains(" ");
				 
				 if(b==false) 
			  throw new IllegalArgumentException();
		      System.out.println("valid mail address");
			  
			  }
		      catch(ArrayException iae) {
			  System.out.println("invalid mail address");
		 }


		}
		}