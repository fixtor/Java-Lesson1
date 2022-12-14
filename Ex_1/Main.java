import java.util.Scanner;

/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 2. Вывести все простые числа от 1 до 1000
 * 3. Реализовать простой калькулятор
  */

public class Main {
	public static void main(String[] args) {

		System.out.println("Input any number: ");
		Scanner uInt1 = new Scanner(System.in); //Ввод данных
		int numFactorial = uInt1.nextInt();


		TriangleAndFactorial triangleNum = new TriangleAndFactorial(); // Задание 1
		TriangleAndFactorial factorial = new TriangleAndFactorial<>();
		TriangleAndFactorial factorialRecursion = new TriangleAndFactorial();

		triangleNum.setUserInput(numFactorial);
		factorial.setUserInput(numFactorial);

		System.out.println("Задание 1. Факториал рекурсивный: " + factorialRecursion.getFactorialRecur(numFactorial));
		System.out.println("Задание 1. Факториал простой: " + factorial.getFactorialSimple());
		System.out.println("Задание 1. Треугольник из " + triangleNum.getTriangleNumber() + " элементов\n");

		SimpleNumbers result = new SimpleNumbers(); // Задание 2
		System.out.println("Задание 2. Простые числа до 1000");
		result.getSimpleNum();

		System.out.println("\nЗадание 3. Введите арифметическое выражение x [пробел] <действие> [пробел] y: ");
		Scanner uInt2 = new Scanner(System.in); //Ввод данных
		Calc newData = new Calc();
		newData.setData(uInt2.nextLine());

		if (newData.getIntResult() == 0) System.out.println(newData.getResultDiv());
		else System.out.println(newData.getIntResult());
	}
}





