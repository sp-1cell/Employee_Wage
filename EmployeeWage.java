package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        public static final int IsFullTime = 1;
        public static final int IsPartTime = 2;
        public static final int EmployeRatePerHour = 20;

        public static void main(String[] Args) {
            int EmployeWages = 0;
            int EmployeHour = 0;
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
            System.out.println("Employewage: " + EmployeWages);


    }
}
