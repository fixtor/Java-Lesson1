public class Main {
	public static void main(String[] args) {

		TriangleNumber t = new TriangleNumber();
		TriangleNumber fSimple = new TriangleNumber<>();
		TriangleNumber fRecur  = new TriangleNumber();

		t.setUserInput(3);
		fSimple.setUserInput(5);

		System.out.println("Факториал: " + fRecur.getFactorialRecur(5));
		System.out.println("Факториал: " + fSimple.getFactorialSimple());
		System.out.println("Треугольник из " + t.getTriangleNumber() + " элементов");
	}
}
