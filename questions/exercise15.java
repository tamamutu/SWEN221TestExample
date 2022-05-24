// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		Node<Integer> chain = new Node<>(2, new Node<>(71, new Node<>(35, null)));
		assert chain.toString().equals("2 71 35");
		assert chain.next().toString().equals("71 35");
		assert chain.next().next().toString().equals("35");
	}
}