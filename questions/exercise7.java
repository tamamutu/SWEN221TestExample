// The answer must have balanced parentheses

interface Car {
	Engine engine();
}

class Engine {

	public final String name;

	public Engine(String name) {
		this.name = name;
	}
}

[???]

public class Exercise {
	public static void main(String[] args) {
		SportsCar rx7 = new SportsCar("Mazda RX-7", new RotaryEngine("13B-REW"));
		Car car = rx7;
		RotaryEngine engine = rx7.engine();

		assert car.engine() == engine;
		assert car.engine().name.equals(engine.name);
	}
}