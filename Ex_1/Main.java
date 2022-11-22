import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Input any number: ");
		UserInViaScanner uInput = new UserInViaScanner();
		TriangleNumber t = new TriangleNumber();
		TriangleNumber fSimple = new TriangleNumber<>();
		TriangleNumber fRecur  = new TriangleNumber();

		t.setUserInput(uInput.num);
		fSimple.setUserInput(uInput.num);

		System.out.println("Факториал рекурсивный: " + fRecur.getFactorialRecur(uInput.num));
		System.out.println("Факториал простой: " + fSimple.getFactorialSimple());
		System.out.println("Треугольник из " + t.getTriangleNumber() + " элементов");
	}
}
