// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		Vec2D position = new Vec2D(32.12, 58.5);
		Entity entity = new Player(position);
		assert entity.getPosition() == position;
		assert entity.getPosition().x == 32.12 && entity.getPosition().y == 58.5;
	}
}