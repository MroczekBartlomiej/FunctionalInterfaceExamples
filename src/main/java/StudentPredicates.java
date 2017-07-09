import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicates {

    public static Predicate<Student> hasMoreAbsencesThanPresence(){
        return p -> p.getNumberOfDaysAbsent() > p.getNumberOfDaysPresent();
    }

    public static Predicate<Student> hasMorePresenceThanAbsences(){
        return p -> p.getNumberOfDaysPresent() > p.getNumberOfDaysAbsent();
    }

    public static Predicate<Student> hisNameIs(String name){
        return p -> p.getFirstName().equalsIgnoreCase(name);
    }

    public static List<Student> filterStudents (List<Student> students, Predicate<Student> predicate){
        return students.stream().filter(predicate).collect(Collectors.toList());
    }

}
