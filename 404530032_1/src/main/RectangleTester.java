package main;

class Rectangle {
	int height,width,x,y;
	double Area,Perimeter;
	
	Rectangle(){
		
	}
	
	Rectangle(int _height,int _width,int _x,int _y)
	{
		this.height = _height;
		this.width = _width;
		this.x = _x;
		this.y = _y;	
		
	}
	
	int getHeight(){
		return this.height;
	}
	int getWidth(){
		return this.width;
	}
	int getX() {
		return this.x;
	}

	int getY() {
		return this.y;
	}
	public String toString(){
		return "java.Rectangle[x=" + x +",y=" + y +",width=" + width +",height=" + height +"]" ;
	}
	
	
	
	
}
public class RectangleTester
{
	public static void main(String[] args) 
	{
		double area,perimeter;
		
		Rectangle r0 = new Rectangle();
		Rectangle r1 = new Rectangle(18,57,15,25);
		Rectangle r2 = new Rectangle(47,60,0,12);
		area = r1.getWidth()*r1.getHeight();
		perimeter = (r1.getWidth()+r1.getHeight())*2;
		System.out.println(r1.toString());
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter + "\n");
		
		area = r2.getWidth()*r2.getHeight();
		perimeter = (r2.getWidth()+r2.getHeight())*2;
		System.out.println(r2.toString());
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter+"\n\n"+"End of Output!");
	}
	
}