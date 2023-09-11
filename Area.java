import java.util.Scanner;

class Oop2
{
	double rad, len, bre, side, area;
	Scanner sc=new Scanner(System.in);
	public void areaRect()
	{	
		System.out.println("Enter length and breadth of rectangle");
		len = sc.nextDouble();
		bre = sc.nextDouble();
		area = len*bre;
		System.out.println("The area of rectangle is "+area);
	}
	public void areaSquare()
	{	
		System.out.println("Enter side of square");
		side= sc.nextDouble();
		area = side*side;
		System.out.println("The area of square is "+area);
	}
	public void areaCircle()
	{	
		System.out.println("Enter radius of circle");
		rad = sc.nextDouble();
		area = 3.14*rad*rad;
		System.out.println("The area of circle is "+area);
	}

}

public class Area
{
	public static void main(String arg[])
	{
		Oop2 obj=new Oop2();
		obj.areaSquare();
		obj.areaRect();
		obj.areaCircle();
	}
}
