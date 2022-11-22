public class Main {
	public static void main(String[] args) {

		Us


		TriangleNumber t = new TriangleNumber();
		TriangleNumber fSimple = new TriangleNumber<>();
		TriangleNumber fRecur  = new TriangleNumber();

		t.setUserInput(3);
		fSimple.setUserInput(5);

		System.out.println("Факториал рекурсивный: " + fRecur.getFactorialRecur(10));
		System.out.println("Факториал простой: " + fSimple.getFactorialSimple());
		System.out.println("Треугольник из " + t.getTriangleNumber() + " элементов");
	}
}
