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
		return "{" + "name: " + this.name +", " + "age: " + this.age + "}";
	}
	
	@Override
	public int compareTo(Person obj) {
		String otherName = obj.getName();
		String myName = this.getName();
		return myName.compareTo(otherName);
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
		
		Collections.sort(persons);
		System.out.println(persons);
		
	}

	
}
