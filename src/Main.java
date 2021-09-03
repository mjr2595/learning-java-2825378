

public class Main {

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if (hoursPerWeek < 0 || amountPerHour < 0) {
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }


    public static void main(String[] args) {
        double salary = salaryCalculator(40, 25, 0);
        StudentProfile studentA = new StudentProfile("Michael", "Scott", "Undeclared",
                2.3, 1993);

        System.out.println(studentA.getFullName() + " makes $" + salary + "/year");
    }
}
