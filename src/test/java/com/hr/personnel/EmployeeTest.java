package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee("dani", LocalDate.of(2019, 11, 12));
    }


    @Test
    public void getEmployeeInfo_should_return_name_and_hireDate() {
       String employeeInfo = employee.getEmployeeInfo();
       Assert.assertEquals("name = dani hire date = 2019-11-12", employeeInfo);

    }

    @Test
    public void work_should_return_name_worked_string() {
        String work = employee.work();
        Assert.assertEquals("dani worked" , work);
    }
}