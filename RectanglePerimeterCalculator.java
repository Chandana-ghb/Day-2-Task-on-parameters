public class RectanglePerimeterCalculator
{
	public static void calculatePerimeter(double length , double bredth)
	{
		System.out.println("Perimeter: "+(2*(length+bredth)));
	}
	public static void main(String []args)
	{
		calculatePerimeter(5.0 , 3.0);
	}
}
