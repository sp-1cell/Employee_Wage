package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAME");
        int isfulltime = 1;
        int employeerateperhour = 20;
        int employeewage = 0;
        int employeehour = 0;
        double empcheck = Math.floor(Math.random() * 10 % 2);
        if (empcheck == isfulltime)
            employeehour = 8;
        else employeehour = 0;
        employeewage = employeehour * employeerateperhour;
        System.out.println("EmployeeWage:" + employeewage);
    }
}
