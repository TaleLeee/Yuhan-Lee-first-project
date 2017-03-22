public class TestCircle{
	public static void main(String[] args) {
		Circle circle = new Circle(1.0, "red", true);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("the radius is" + circle.getRadius());
	}
}