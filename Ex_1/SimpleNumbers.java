public class SimpleNumbers {
	/**
	 * 2. Вывести все простые числа от 1 до 1000
	 */
	public void getSimpleNum() {

		for (int j = 3; j < 1000; j++) {
			int flag1 = 0;
			for (int i = 1; i < j + 1; i++) if (j % i == 0) flag1++;
			if (flag1 == 2) System.out.print(j + " ");
		}
	}
}





