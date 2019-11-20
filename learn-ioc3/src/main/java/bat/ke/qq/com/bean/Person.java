package bat.ke.qq.com.bean;

import bat.ke.qq.com.service.MyService;



public class Person {

	private Cat cat;

	public Person() {
	}

	public Person(Cat cat) {
		System.out.println(cat+"===Fox(Cat cat)=====");
	}

	@Override
	public String toString() {
		return "Person{" +
				"cat=" + cat +
				'}';
	}
}
