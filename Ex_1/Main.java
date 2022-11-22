/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 2. Вывести все простые числа от 1 до 1000
 * 3. Реализовать простой калькулятор
 * 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class Main {
	public static void main(String[] args) {

		System.out.println("Input any number: ");
		UserInViaScanner uInput = new UserInViaScanner(); //Ввод данных


		TriangleAndFactorial t = new TriangleAndFactorial(); // Задание 1
		TriangleAndFactorial fSimple = new TriangleAndFactorial<>();
		TriangleAndFactorial fRecur = new TriangleAndFactorial();

		t.setUserInput(uInput.num);
		fSimple.setUserInput(uInput.num);

		System.out.println("Факториал рекурсивный: " + fRecur.getFactorialRecur(uInput.num));
		System.out.println("Факториал простой: " + fSimple.getFactorialSimple());
		System.out.println("Треугольник из " + t.getTriangleNumber() + " элементов");

		SimpleNumbers result = new SimpleNumbers(); // Задание 2
		result.getSimpleNum();
	}
}

//for(int item:array) System.out.print(item+" ");



