import static java.lang.Integer.parseInt;

public class Calc {

	private static final char PLUS = '+';
	private static final char MINUS = '-';
	private static final char MULTIPLY = '*';
	private static final char DIVIDE = '/';
	private static Integer x;
	private static Integer y;
	private char symbol;

	public Calc() {}

	{
		this.x = 1;
		this.y = 1;
	}

	private boolean notDivByZero() {
		if (this.y == 0) return false;
		else return true;
	}

	private boolean isCorrectMath(char arg) {
		if (arg == PLUS || arg == MINUS || arg == MULTIPLY || arg == DIVIDE) return true;
		else return false;
	}

	private boolean isCorrect(Integer arg) {
		if (this.x instanceof Integer && this.y instanceof Integer)
			return true;
		else return false;
	}

	public void setData(String arg) {

		String[] word = arg.split(" ");
		String x = word[0];
		String symbol = word[1];
		String y = word[2];
		this.x = parseInt(x);
		this.y = parseInt(y);
		this.symbol = symbol.charAt(0);
	}



	public Integer getIntResult() {
		if (this.symbol == PLUS) return this.x + this.y;
		if (this.symbol == MULTIPLY) return this.x * this.y;
		if (this.symbol == MINUS) return this.x - this.y;
		else return 0;
	}

	public Double getResultDiv() {
		if(notDivByZero()) return this.x.doubleValue() / this.y.doubleValue();
		else return 0.0;
	}
}



