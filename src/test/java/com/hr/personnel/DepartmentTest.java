package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {
    private Department department;


    @Test
    public void addEmployee_should_add_an_employee_correctly() {
        Department department = new Department("Analytics", "WAS26");
        SalariedEmployee emp1 = new SalariedEmployee("manuel", LocalDate.of(2020, 10, 12), 2500);
        department.addEmployee(emp1);
        Employee[] employees = department.getEmployees();
        Assert.assertEquals(emp1.getName(), employees[0].getName());
    }


    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_number() {
        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(1, numberOfEmployeesWhoWorked);
    }
}