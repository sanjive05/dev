package core.java.oops.studentapp;

public class Student {
	private static int id = 1000;
	private int studentId;
	private String name;
	private String std;
	private String bloodGroup;
	public Student() {
		id++;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "id= "+studentId+"  name=" + name + ", std=" + std + ", bloodGroup=" + bloodGroup ;
	}
	
}
