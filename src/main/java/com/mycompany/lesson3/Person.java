package com.mycompany.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "{" + "name: " + this.name +", " + "age: " + this.age + "}";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("John", 22);
		Person p2 = new Person("Michael", 34);
		Person p3 = new Person("Jake", 25);
		Person p4 = new Person("Andrew", 47);
		
		List <Person> persons = new ArrayList<>();
		
		persons.add(p1);
		
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
		//List<Person> sortPersons = new ArrayList<>(persons.stream().sorted((obj1, obj2) -> obj1.getName().compareTo(obj2.getName())));
		
		persons
		.stream()
		.sorted((obj1, obj2) -> obj2.getName().compareTo(obj1.getName()));
		System.out.println(persons);
		
	}
}
