public class SimpleNumbers {
	/**
	 * 2. Вывести все простые числа от 1 до 1000
	 */
	public void getSimpleNum() {

		for (int  i = 3; i < 1000; i++) {
			int flag1 = 0;
			for (int j = 1; j < i + 1; j++) if (i % j == 0) flag1++;
			if (flag1 == 2) System.out.print(i + " ");
		}
		System.out.println();
	}
}





