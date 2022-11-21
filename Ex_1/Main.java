public class Main {
	public static void main(String[] args) {

		TriangleNumber t = new TriangleNumber();
		TriangleNumber t1 = new TriangleNumber<>();
		t.setUserInput(3);
		t1.setUserInput(10);

		System.out.println("Треугольник из " + t.triangleNumber() + " элементов");
		System.out.println("Треугольник из " + t1.triangleNumber() + " элементов");

	}
}
