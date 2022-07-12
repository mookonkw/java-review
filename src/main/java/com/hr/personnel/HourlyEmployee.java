package com.hr.personnel;

import java.time.LocalDate;

public abstract class HourlyEmployee extends Employee{

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        setName(name);
        setLocalDate(localDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double computeMonthlyCompensation(){
        return hoursWorkedPerMonth * hourlyRate;
    }


    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}