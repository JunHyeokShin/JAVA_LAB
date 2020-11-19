package chapter11.object;

public class Student {
	int studentID;
	String name;

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ", " + studentID;
	}
}