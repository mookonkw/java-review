package com.hr.personnel;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numEmployeesWhoWorked = 0;
        for( int i = 0; i< currentIndex; i++){
            String work = employees[i].work();
            if(work.contains("worked")) {
                numEmployeesWhoWorked ++;
            }
        }
        return numEmployeesWhoWorked;
    }

}