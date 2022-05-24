// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		Player player = new Player();
		Key key = new Key();
		player.pickup(key);
		assert player.getHeldItem() == key;
	}
}