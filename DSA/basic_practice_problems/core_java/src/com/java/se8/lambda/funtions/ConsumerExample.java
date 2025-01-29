package com.java.se8.lambda.funtions;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExample {
	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
		
		PersonRepository p = new PersonRepository();
		
		Consumer<Person> p1 = (person) -> System.out.println(person.getName().toUpperCase());
		
		p1.accept(p.getPerson());
		
		List<Person> list = p.getAllPersons();
		
		list.forEach(p1);
		
		
		list.forEach((per ->{
			if(per.getGender().equals("Male")) {
				System.out.println(per);
			}
		}
		 ));
		
	}

}
