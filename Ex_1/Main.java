public class Main {
	public static void main(String[] args) {

	TriangleNumber t = new TriangleNumber(); t.setUserInput(3);
	TriangleNumber t1 = new TriangleNumber<>(); t1.setUserInput(10);

	System.out.println("Треугольник из " + t.triangleNumber() + " элементов");
	System.out.println("Треугольник из " + t1.triangleNumber() + " элементов");

	}
}
