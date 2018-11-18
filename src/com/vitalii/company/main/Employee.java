package com.vitalii.company.main.practical_tasc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a class Employee with fields name, department number, salary.
 * Create five objects of class Employee.
 * Display
 * - all employees of a certain department (enter department number in the console);
 * - arrange workers by the field salary in descending order.
 */
public class Employee {
    String name;
    int departmentNumber;
    int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }


    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Vasia Pupkin", 1, 1500);
        employees[1] = new Employee("Eva Pupkina", 1, 1500);
        employees[2] = new Employee("Bob Marley", 2, 2000);
        employees[3] = new Employee("Donald Duck", 3, 1100);
        employees[4] = new Employee("Mickey Mouse", 3, 1200);

        System.out.println("Enter department number: (1, 2, 3)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numder = Integer.parseInt(reader.readLine());

        System.out.println(getByDepartment(employees, numder));

        employees = sortBySalary(employees);
        System.out.println("Workers by the field salary in descending order:");
        System.out.println(toString(employees));
    }

    public static String getByDepartment(Employee[] employees, int input) {
        String result = "";
        for (Employee employee : employees) {
            if (employee.departmentNumber == input) {
                result += String.format("name: %1$s, salary: %2$s\n", employee.name, employee.salary);
            }
        }
        return result;
    }

    public static Employee[] sortBySalary(Employee[] employees) {
        Employee[] result = employees;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    Employee tmp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tmp;
                }
            }
        }
        return result;
    }

    public static String toString(Employee[] employees) {
        String result = "";
        for (int i = 0; i < employees.length; i++) {
            result += String.format("name: %1$s, salary: %2$s\n",
                    employees[i].name, employees[i].departmentNumber, employees[i].salary);
        }
        return result;
    }
}