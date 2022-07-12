package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee implements TaxPayer {

    //access modifies
    //public, private, protected
    public  String name;

    public LocalDate localDate;

    protected Employee() {
    }

    //Method
    public String work() {
        return name + " worked";
    }

    public String getEmployeeInfo() {
        return "name = " + name + " hire date = " + localDate;

    }

    public abstract double computeMonthlyCompensation();

    //constructor
    public Employee(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    // getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getLocalDate(), employee.getLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocalDate());
    }
}