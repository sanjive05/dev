package core.java.oops.studentapp;

import java.util.ArrayList;

public class Service {
	
	private ArrayList<Student> students = new ArrayList<>();

	public void getAllData() {
		// TODO Auto-generated method stub
		for(Student student : students) {
			System.out.println(student.toString());
		}
			
	}

	public void getStudentData() {
		// TODO Auto-generated method stub
		
	}

	public String addStudentData(String name, String std, String bloodGroup) {
		Student student = new Student();
		student.setStudentId(student.getId());
		student.setName(name);
		student.setStd(std);
		student.setBloodGroup(bloodGroup);
		students.add(student);
		return "Student added succssfully...";
	}

	public String removeStudentData(int id) {
		for(Student student :students) {
			if(student.getStudentId()==id) {
				students.remove(student);
				break;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	

}
