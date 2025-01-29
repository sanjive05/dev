package com.java.se8.lambda.funtions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
	public static List<Person> getAllPersons(){
		Person p1 = new Person("John",165,2000,"Male",2,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("USA")));
		Person p2 = new Person("Angel",155,3000,"Female",1,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("UAE")));
		Person p3 = new Person("Nancy",178,2500,"Female",3,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("Japan")));
		Person p4 = new Person("Harper",177,2800,"Male",4,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("USA")));
		Person p5 = new Person("Alan",145,3500,"Male",5,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("Japan")));
		Person p6 = new Person("Dean",168,4300,"Male",1,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("UAE")));
		Person p7 = new Person("Campell",163,5600,"Female",2,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("USA")));
		
		return Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	}
	
	public static Person getPerson() {
		return new Person("John",165,2000,"Male",2,Arrays.asList("Swimming","Cricket"),Optional.of(new Address("USA")));
	}

}
