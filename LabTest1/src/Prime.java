
public class Prime {
	       void  Pnumber  (int b)   
		{
			  for (int i = 1; i <= b; i++)   //initialisation...  
			  {
			 int count = 0;		
			       for (int j = 2; j <= i / 2; j++)  //initialisation..
			       {
			        if (i % j == 0) {             
			       	count++;
			         break;
			         }
			         }
			       
			     if (count == 0) {     //check condition              
			    System.out.println(i);                
			   }
			  }	
			}		
		public static void main(String[] args)
		{		
			Prime Number =new Prime();     
			Number.Pnumber(20); // set the value to check the prime no  
		}
		}
