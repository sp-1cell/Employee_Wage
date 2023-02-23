package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEEWAGE PROGRAME");
        class Employee_UC5 {
            public static final int IsFullTime = 1;
            public static final int IsPartTime = 2;
            public static final int EmployeRatePerHour = 20;
            public static final int NoWorkingDays = 20;

            public  void main(String[] Args) {
                int EmployeWages = 0;
                int EmployeHour = 0;
                int TotalEmployeWage = 0;
                for (int day = 0; day < NoWorkingDays; day++) {
                    int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (EmployeCheck) {
                        case IsFullTime:
                            EmployeHour = 8;
                            break;
                        case IsPartTime:
                            EmployeHour = 4;
                            break;
                        default:
                            EmployeHour = 0;
                    }
                    EmployeWages = EmployeHour * EmployeRatePerHour;
                    TotalEmployeWage += EmployeWages;
                    System.out.println("Employewage: " + EmployeWages);
                }
                System.out.println("TotalEmployewage: " + TotalEmployeWage);
            }
        }

    }
}
