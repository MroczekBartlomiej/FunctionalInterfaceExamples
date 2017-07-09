
public class Student {

    private String firstName;
    private String lastName;
    private int numberOfDaysPresent;
    private int numberOfDaysAbsent;

    public Student(String firstName, String lastName, int numberOfDaysPresent, int numberOfDaysAbsent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfDaysPresent = numberOfDaysPresent;
        this.numberOfDaysAbsent = numberOfDaysAbsent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfDaysPresent() {
        return numberOfDaysPresent;
    }

    public int getNumberOfDaysAbsent() {
        return numberOfDaysAbsent;
    }

    @Override
    public String toString() {
        return  "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Number Of Days Present=" + numberOfDaysPresent +
                ", Number Of Days Absent=" + numberOfDaysAbsent +
                "\n";
    }
}
