package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {

        SalariedEmployee employee1 = new SalariedEmployee("mabe", LocalDate.of(2020, 4, 30), 5000.00);

        SalariedEmployee employee2 = new SalariedEmployee("linda", LocalDate.of(2022, 01, 14), 7000.00);

        HourlyEmployee employee3 = new HourlyEmployee("josh", LocalDate.of(2022, 01, 14), 160, 40);

        System.out.println(employee1.getEmployeeInfo() + " monthlySalary = " + employee1.getMonthlySalary());
        System.out.println(employee2.getEmployeeInfo() + " monthlySalary = " + employee2.getMonthlySalary());
        System.out.println(employee3.getEmployeeInfo() + " hoursWorked = " + employee3.getHoursWorkedPerMonth() + " hourlyRate = " + employee3.getHourlyRate());

        Department department1 = new Department("Marketing", "Dallas");
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);

        int numEmployeesWhoWorked = department1.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        System.out.println(" number of employees who worked = " + numEmployeesWhoWorked);
    }

}