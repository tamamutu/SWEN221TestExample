// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		int[] items = {3, 7, 9, 2};
		Printer<Integer> printer1 = new Printer<>(32);
		Printer<String> printer2 = new Printer<>("cool");
		Printer<Integer[]> printer3 = new ArrayPrinter<>(items);
		Printer<Double[]> printer4 = new ArrayPrinter<>(3.4, 2.7, 5.5, 4.2);
		assert printer1.print().equals("32");
		assert printer2.print().equals("cool");
		assert printer3.print().equals("[3, 7, 9, 2]");
		assert printer4.print().equals("[3.4, 2.7, 5.5, 4.2]");
		assert printer3.item == items;
	}
}