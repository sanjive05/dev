package core.java.oops.studentapp;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Service service = new Service();
		Scanner sc = new Scanner (System.in);
		int n;
		do {
			System.out.println("!!!Welcome to Our Student Application!!!\nPlease enter the option : ");
			System.out.println("Press 1 for get all students data : ");
			System.out.println("Press 2 for student data      : ");
			System.out.println("Press 3 for add student data  :");
			System.out.println("Press 4 for remove student data:");
			n = sc.nextInt();
			switch (n) {
			case 1:
				service.getAllData();
				break;
			case 2:
				System.out.println("Enter the student Id : ");
				int sid=  sc.nextInt();
				service.getStudentData(sid);
				break;
			case 3:
				System.out.println("Enter student name : ");
				String name = sc.next();
				System.out.println("Enter student class : ");
				String std = sc.next();
				System.out.println("Enter student bloodgroup : ");
				String bloodGroup =sc.next();
				System.out.println(service.addStudentData(name,std,bloodGroup));
				
				break;
			
			case 4:
				System.out.println("Enter the student id : ");
				int id= sc.nextInt();
				service.removeStudentData(id);
				break;
			case 0:
				System.out.println("Application stopped...");
				break;
			default :
				System.out.println("Sorry wrong input...!!!");
				
		     }
		}
        while(n!=0);
		
		
		  

      }
}
