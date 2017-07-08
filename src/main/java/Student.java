public class Student {
    int number;
    String firstName;
    String lastName;

    public Student(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  number + " " + firstName +  " " + lastName;
    }
}
