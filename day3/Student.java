package week3.day3;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Id of the student: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Id of the student: " + id+ ",  "
				+ " Name of the student: " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {

		System.out.println("Email of the student: " + email + ",  "
				+ " Phone number of the Student: " + phoneNumber);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentInfo(12345);
		student.getStudentInfo(12345, "kumar");
		student.getStudentInfo("kumar1234@gmail.com", 9234567890l);

	}

}
