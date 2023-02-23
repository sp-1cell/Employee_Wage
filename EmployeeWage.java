package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAME");
        int IsFullTime = 1;
        double EmpCheck = Math.floor(Math.random() * 10) % 2;
        if (EmpCheck == IsFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Not Present");
    }
}
