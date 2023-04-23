package com.mycompany.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Person implements Comparable<Person> {
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
	
	@Override
	public int compareTo(Person obj) {
		String otherName = obj.getName();
		String myName = this.getName();
		return myName.compareTo(otherName);
	}
	
	public static void main(String[] args) {
		mp_func();

		
		// ---- original code ---
		Person p1 = new Person("John", 22);
		Person p2 = new Person("Michael", 34);
		Person p3 = new Person("Jake", 25);
		Person p4 = new Person("Andrew", 47);

		List<Person> persons = new ArrayList<>();

		persons.add(p1);

		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		System.out.println(persons);
		// List<Person> sortPersons = new ArrayList<>(persons.stream().sorted((obj1,
		// obj2) -> obj1.getName().compareTo(obj2.getName())));

		persons.stream().sorted((obj1, obj2) -> obj2.getName().compareTo(obj1.getName()));
		System.out.println(persons);
	}
	
	
	public static void mp_func() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John", 22));
		persons.add(new Person("John", 16));
		persons.add(new Person("Michael", 34));
		persons.add(new Person("Michael", 31));
		persons.add(new Person("Jake", 25));
		persons.add(new Person("Jake", 11));
		persons.add(new Person("Andrew", 47));
		persons.add(new Person("Andrew", 41));
		
		//TODO MP: write your own custom comparators; their use would look like this
		//Collections.sort(persons, new MyComparatorByName());
		//Collections.sort(persons, new MyComparatorByAge());
		//Collections.sort(persons, new MyComparatorByNameThenAge());
		
		
		//TODO MP: then read the second tutorial; exactly the same code can be written like this:
		System.out.println("Initial: " + persons);
		
		//Collections.sort(persons, Comparator.comparing(Person::getName));
		Collections.sort(persons, new MyComparatorByName());
		System.out.println("By name: " + persons);

		//Collections.sort(persons, Comparator.comparing(Person::getAge));
		Collections.sort(persons, new MyComparatorByAge());
		System.out.println("By age: " + persons);

		//Collections.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
		Collections.sort(persons, new MyComparatorByNameThenAge());
		System.out.println("By name then age: " + persons);
		
		System.out.println("-------------------\n");
	}

	
}

class MyComparatorByName implements Comparator<Person> {
	public int compare(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}

class MyComparatorByAge implements Comparator<Person> {
	public int compare(Person a, Person b) {
		return a.getAge() - b.getAge();
	}
}

class MyComparatorByNameThenAge implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		int nameCompare = a.getName().compareTo(b.getName());
		//int ageCompare = a.getAge().compareTo(b.getAge());
		int ageCompare = a.getAge() - b.getAge();
		return (nameCompare == 0) ? ageCompare : nameCompare;
	}
}
