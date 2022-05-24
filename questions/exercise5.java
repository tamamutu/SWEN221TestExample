// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		Car car = sedan;
		Vehicle vehicle = sedan;
		assert car.drive().equals("driving");
		assert vehicle.move().equals("driving");
	}
}