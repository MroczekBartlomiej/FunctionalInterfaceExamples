import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentFactory {

    String[] firstNames = {"Jack", "Max", "Tom", "Donald", "Michael", "Sebastian"};
    String[] lastNames = {"Bond", "Snow", "Black", "Smith", "Abram", "Aiton"};
    Random random = new Random();

    public List<Student> make() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < 36; i++) {
            int x = random.nextInt(firstNames.length);
            int y = random.nextInt(lastNames.length);
            String firstName = firstNames[x];
            String lastName = lastNames[y];
            int numberOfDaysPresent = random.nextInt(251);
            int numberOfDayAbsent = 251 - numberOfDaysPresent;
            students.add(new Student(firstName, lastName, numberOfDaysPresent, numberOfDayAbsent));

        }
        return students;
    }
}

