package io.github.sonamvyas.basics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.sonamvyas.basics.Employee;

public class CollectionDemo {

	public static void main(String[] args) {
		// listDemoWithCustomObject();
		// listDemoWithWrapper();
		// setDemoWithWrapper();
		mapDemoWithWrapper();
	}

	public static void listDemoWithWrapper() {
		List<String> stringList = new ArrayList<String>();
		// List<Employee> employeeList = new LinkedList<Employee>();
		stringList.add("3");
		stringList.add("1");
		stringList.add("2");
		stringList.add("4");

		for (String str1 : stringList) {
			System.out.println(str1);
		}

		// implement Comparable in Employee important step
		Collections.sort(stringList);

		System.out.println("Sorted List");
		for (String str2: stringList) {
			System.out.println(str2);
		}

		// * implement comparator in case you need to have multiple sorting sequence.
	}

	public static void listDemoWithCustomObject() {
		Employee emp1 = new Employee(1, "FirstName 1", "LastName 1");
		Employee emp2 = new Employee(2, "FirstName 2", "LastName 2");
		Employee emp3 = new Employee(3, "FirstName 3", "LastName 3");
		Employee emp4 = new Employee(4, "FirstName 4", "LastName 4");

		// List<Employee> employeeList = new ArrayList<Employee>();
		List<Employee> employeeList = new LinkedList<Employee>();
		employeeList.add(emp3);
		employeeList.add(emp1);
		employeeList.add(emp4);
		employeeList.add(emp2);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		// implement Comparable in Employee important step
		Collections.sort(employeeList);

		System.out.println("Sorted List");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		// * implement comparator in case you need to have multiple sorting sequence.
	}

	public static void setDemoWithWrapper() {
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("3");
		stringSet.add("1");
		stringSet.add("2");
		stringSet.add("4");
		stringSet.add("3");
		stringSet.add("3");
		stringSet.add("5");

		for (String str4 : stringSet) {
			System.out.println(str4);
		}
	}

	public static void mapDemoWithWrapper() {
		Map<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("1", " 1");
		stringMap.put("2", " 2");
		stringMap.put("3", " 3");
		stringMap.put("4", " 4");
		stringMap.put("4", " 5");
		for (String str5 : stringMap.values()) {
			System.out.println(str5);
		}

	}
}
