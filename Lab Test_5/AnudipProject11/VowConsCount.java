import java.util.Scanner;

public class VowConsCount {

	 int vowCount = 0, consCount = 0;          // declare data type to count the vowels &  consonants  
		
	 String user_string;                       // data type to store user string 
	 void  input_string()                      // crate the method to input the data from user
		{
	      Scanner string1 = new Scanner(System.in);               // Create a Scanner object
		  System.out.println("Enter the string ");

	      user_string =  string1.nextLine();                               // Read user input
		  System.out.println("user enter String is: " +user_string);       // Output user input	                  
		}
	 void  count_vowe_cons()                            // crate the method to count the string each character is a vowel or consonant
		{	
		user_string= user_string.toLowerCase();            // convert string is lower case   
			 
		   
		 for(int i = 0; i < user_string.length(); i++)          // for loop to check the string each character is a vowel or consonant 
			 
		 {                                                               //Checks character is a vowel  using if condition
		 if(user_string.charAt(i) == 'a' || user_string.charAt(i) == 'e' || user_string.charAt(i) == 'i' || user_string.charAt(i) == 'o' || user_string.charAt(i) == 'u')
	     {    	            	   
		 vowCount++;                                                             //Increments the vowel counter   
		 }
	     else if(user_string.charAt(i) >= 'a' && user_string.charAt(i)<='z')   //Checks whether a character is a consonant 
	     {      
	     consCount++;                                                             //Increments the consonant counter 
	     }           
		 }
		 }
	 void display()                                                          // crate the method to display vowel and constant count               
	 {
	 System.out.println("Number of vowels:      " +  vowCount++);      
     System.out.println("Number of consonants:  " + consCount++ );
	  }
	            
	 
	 
	public static void main(String[] args) {  
		
	VowConsCount v =new VowConsCount();                                 // Create a class  object       
		v.input_string();                                               //call input_string method  
		v.count_vowe_cons();                                            // call string vowels and constant counting method
		v.display();                                                    // call display method 	
	}

{	 
	 
}
}

