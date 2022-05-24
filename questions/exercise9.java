// The answer must have balanced parentheses

class Student {
	private String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return "Hohepa";
	}

	public int getID() {
		return 420;
	}
}

public class Exercise {
	public static void main(String[] args) {
		assert makeStudent("Joseph", 420).getName().equals("Joseph");
		assert makeStudent("Charlie", 33).getID() == 33;
	}

	public static Student makeStudent(String name, int id) {
		return [???];
	}
}