public class TriangleNumber<userInput> {
	//	1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
	private int userInput;

	{this.userInput = 1;}

	public TriangleNumber() {}

	private boolean isCorrect(int userInput) {
		return (userInput > 0);
	}

	public void setUserInput(int userInput) {
		if (isCorrect(userInput)) {
			this.userInput = userInput;
		}
	}

	public int getUserInput() {
		return userInput;
	}

	int triangleNumber() {
		return (this.userInput * (this.userInput + 1)) / 2;
	}

//	int factorialNumber()
}
