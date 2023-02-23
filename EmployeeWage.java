package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        int isfulltime = 1;
        int isparttime = 2;
        int employeerateperhour = 20;
        int employeewage = 0;
        int employeehour = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck==isfulltime)
            employeehour = 8;
        else if (empCheck ==isparttime)
            employeehour = 8;
        else
            employeehour = 0;
        employeewage = employeehour * employeerateperhour;
        System.out.println("Employewage: " + employeewage );



    }
}
