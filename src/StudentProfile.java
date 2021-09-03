public class StudentProfile {
    String firstName;
    String lastName;
    String fullName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName,
                          String declaredMajor, double gpa, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate++;
    }

    public String getFullName() {
        return this.fullName;
    }
}
