import java.util.Scanner;

public class Duplicate_Chars {
	
	public class DuplicateChars {
	     String user_string;                                             // data type to store user string 
	     int count; 
	     
	     void  input_string()                                                // crate the method to input the data from user
			{  
		      Scanner string1 = new Scanner(System.in);                         // Create a Scanner object
			  System.out.println("Enter the string ");  
		      user_string =  string1.nextLine();                               // Read user input
			  System.out.println("user enter String is: " +user_string);       // Output user input
			}
	     void check_duplicate()
			{
				  char string[] = user_string.toCharArray();                         //Converts given string into array  
				  System.out.println("Duplicate characters in a given string: ");     
				  for(int i = 0; i <string.length; i++)                              // nested for loop to check all character to other character
				  {  
			       count = 1;  
			       for(int j = i+1; j <string.length; j++) 
			       {  
			       if(string[i] == string[j] && string[i] != ' ')            // if condition to check the character is duplicate or not
			       {  
			       count++;  		                   
			       string[j] = '0';                                           // avoid printing visited character
			       }  
			       }  
			                                                                      
			      if(count > 1 && string[i] != '0')                           //A character is considered as duplicate if count is greater than 1
			      
			      System.out.println(string[i]);  
			       }     
			  }  
			
			

		public static void main(String[] args)
		{
		Duplicate_Chars D =new  Duplicate_Chars();                             // Create a class  object 
			     
		D.toString ();                                                    //call input_string method
		// D. DuplicateChars();                                                 // call method to check string duplicate word
		}
	    }

	

	
	}
	