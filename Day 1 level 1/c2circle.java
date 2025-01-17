public class main {
	public static void main(String args[]){
		circle obj = new circle();
		obj.claculateArea(5);
		
	}
}
class circle{
	public 
	double radius;
	public void claculateArea(double radius){
		this.radius=radius;
		System.out.println("Area of the square = "+ 3.14 *radius *radius);
		System.out.println("Circumference of the circle is = "+ 2 * 3.14 * radius); 
	}
}