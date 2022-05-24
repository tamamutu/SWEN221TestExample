// The answer must have balanced parentheses
[???]

public class Exercise {
	public static void main(String[] args) {
		Student student = new Student("Tamati", 132);
		assert student.getName().equals("Tamati");
		assert student.getID().equals(132);
		assert new Student("Joe", 121).getName().equals("Joe");
		assert new Student("Hariata", 555).getID().equals(555);
	}
}