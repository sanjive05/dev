package core.java.oops.studentapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Service {
	
	private ArrayList<Student> students = new ArrayList<>();
	private HashMap<Integer,Student> hash = new HashMap<>();

	public void getAllData() {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer,Student> set :hash.entrySet()) {
			System.out.println(set.getValue().toString());
		}
			
	}

	public void getStudentData(int id) {
		if(hash.containsKey(id)) {
			System.out.println(hash.get(id).toString());
		}
		else {
			System.out.println("Sorry No data...");
		}
	}

	public String addStudentData(String name, String std, String bloodGroup) {
		Student student = new Student();
		student.setStudentId(student.getId());
		student.setName(name);
		student.setStd(std);
		student.setBloodGroup(bloodGroup);
		
		hash.put(student.getStudentId(), student);
		
		return "Student added succssfully...";
	}

	public String removeStudentData(int id) {
		if(hash.containsKey(id)) {
			hash.remove(id);
		}
		return "Data removed..";
	}
	

}
