package com.demo.collection.sorting.userdefinedobjectusingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpDemo {
	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee(101, "David", 15000.00));
		emps.add(new Employee(105, "Putin", 25000.00));
		emps.add(new Employee(103, "Cathy", 45000.00));
		emps.add(new Employee(104, "Anny", 35000.00));

		// Collections.sort(emps, new EmpIdComparator());

		// Collections.sort(emps, new EmpNameComparator());

		// Collections.sort(emps, new EmpSalaryComparator());

		// 1.
		/*
		 * Collections.sort(emps, new EmpIdComparator() { public int compare(Employee
		 * e1, Employee e2) { return e1.id - e2.id; } });
		 */

		// 2.
		/*
		 * Collections.sort(emps, new Comparator<Employee>() {
		 * 
		 * public int compare(Employee e1, Employee e2) { return e1.id-e2.id; } });
		 */

		// 3.
		/*
		 * Collections.sort(emps, new Comparator<Employee>() { public int
		 * compare(Employee e1, Employee e2) { return e1.name.compareTo(e2.name); } });
		 */

		// 4.
		/*
		 * Collections.sort(emps, new Comparator<Employee>() { public int
		 * compare(Employee e1, Employee e2) { if(e1.id > e2.id) { return 1; } else
		 * if(e1.id < e2.id) { return -1; } else { return 0; } } });
		 */

		// 5. salary wise descending
		/*
		 * Collections.sort(emps, new Comparator<Employee>() { public int
		 * compare(Employee e1, Employee e2) { if(e1.salary<e2.salary) { return 1; }
		 * else if(e1.salary > e2.salary) { return -1; } else { return 0; } } });
		 */

		// 6. name wise descending
//		Collections.sort(emps, new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				return e2.name.compareTo(e1.name);
//			}
//		});
		
		Collections.sort(emps, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.salary>e2.salary) {
					return 1;
				}
				else if(e1.salary < e2.salary) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		for (Employee e : emps) {
			System.out.println(e);
		}

	}
}
