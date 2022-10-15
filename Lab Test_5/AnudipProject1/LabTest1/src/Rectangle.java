
public class Rectangle {
	
		int length;
		int width;
		Rectangle()  //default constructor call....
		{
			length=0;
			width=0;
		}
		  Rectangle(int length,int width)  //parametrised constructor call..
		{
			this.length=length;
			this.width=width;
		}
		  void area()    //method declaration
		  {
			  int area;
			  area=length*width;
			  System.out.println("area of rectangle"  +area);
		  }

		public static void main(String[] args) {
			Rectangle rec=new Rectangle();
			rec.area();
			Rectangle r1 =new Rectangle (6,2);
			r1.area();
		}

	}



	