// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		int[] elems = {42, 27, 2, 0};
		int i = 1; // declaring i outside of loop so we can reference it later - kinda ugly
		try {
			for (; i < elems.length; ++i) {
				int result = Divider.divide(elems[i - 1], elems[i]);
				assert result == elems[i - 1] / elems[i];
			}
		} catch (ZeroDivisionError e) {
			assert i == 3;
			return;
		}
		assert false;
	}
}