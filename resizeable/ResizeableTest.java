package resizeable;


public class ResizeableTest {

	public static void main(String[] args) {

		Circle[] circles = new Circle[3];
		
		circles[0] = new Circle(3.6);
		circles[1] = new Circle();
		circles[2] = new Circle(3.5, "indigo", false);
		
		System.out.println("Pre-sorted:");
		for (Circle circle : circles) {
			System.out.println(circle);
		}
		
		circles[0].resize(0.12);
		circles[1].resize(0.12);
		circles[2].resize(0.12);

		System.out.println("After-sorted:");
		for (Circle circle : circles) {
			System.out.println(circle);
		}
		
	}

}
