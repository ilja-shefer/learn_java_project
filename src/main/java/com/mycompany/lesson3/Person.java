package com.mycompany.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		return "{" + this.name +", " + this.age + "}";
	}
	
	public static void main(String[] args) {
		mp_func();
	}
	
	public static void mp_func() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John", 22));
		persons.add(new Person("Michael", 34));
		persons.add(new Person("Jake", 25));
		persons.add(new Person("Jake", 11));
		persons.add(new Person("Andrew", 47));
		
		//TODO MP: write your own custom comparators; their use would look like this
		//Collections.sort(persons, new MyComparatorByName());
		//Collections.sort(persons, new MyComparatorByAge());
		//Collections.sort(persons, new MyComparatorByNameThenAge());
		
		
		//TODO MP: then read the second tutorial; exactly the same code can be written like this:
		System.out.println("Initial: " + persons);
		
		Collections.sort(persons, Comparator.comparing(Person::getName));
		System.out.println("By name: " + persons);

		Collections.sort(persons, Comparator.comparing(Person::getAge));
		System.out.println("By age: " + persons);

		Collections.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
		System.out.println("By name then age: " + persons);
	}
}
