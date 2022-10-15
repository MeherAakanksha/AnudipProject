
public class Alternate {
	public static int[] Alt(int g1[])
    {
		int l=0;
        int  g2[]=new int [g1.length/2];		
 for(int i=0;i<g1.length;i++)    //initialisation..
  {
	if(i%2!=0)  //condition check
	{
		g2[l]=g1[i];
		l++;
	}
	
  }
	return g2; //return value
	}
	
	public static void main(String[] args) {
		Alternate alt=new Alternate();
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	 int add=0;
	int b[]= alt.Alt(a);
	
for(int i=0;i<b.length;i++)    //initialisation..
{
	System.out.println(b[i]);
	add=add+b [i];
}

   System.out.println("addition of aaray "+add);
	}
}
