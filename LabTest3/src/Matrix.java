
public class Matrix {
	public void Display(int a1[][],int a2[][]) 
	{
		int a3[][]=new int [2][2];
		for(int i=0;i<a1.length;i++)    ////initialisation..
		{
			for(int j=0;j<a2.length;j++)     //initialisation..
			{
				  a3[i][j]=0;
				  for(int k=0;k<a3.length;k++)    //initialisation..
				  {
					 a3[i][j]=a1[i][j]*a2[i][j];
				  }
				  System.out.print(a3[i][j]+"  ");
			}
			 System.out.println();
		}		
	}

	public static void main(String[] args) {
		Matrix arr=new Matrix();
		int a1[][]= {{2,3},{7,4}};
		int a2[][]= {{3,5},{2,6}};
		arr.Display(a1,a2);   //method call....
		
	}

}
