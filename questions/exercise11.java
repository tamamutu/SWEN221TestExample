// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		try {
			throwChecked();
		} catch (SuperCheckedException e) {
			assert e.getMessage().equals("cool");
		}
	}

	public static void throwChecked() throws SuperCheckedException {
		throw new CheckedException("cool");
	}
}