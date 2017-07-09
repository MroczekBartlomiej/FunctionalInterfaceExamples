import java.util.List;

public class FunctionalInterface {

    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        List<Student> studentList = studentFactory.make();

        System.out.println("MORE ABSENCES THAN PRESENCE");
        System.out.println(StudentPredicates.filterStudents(studentList, StudentPredicates.hasMoreAbsencesThanPresence()));
        System.out.println("MORE PRESENCE THEN ABSENCES");
        System.out.println(StudentPredicates.filterStudents(studentList, StudentPredicates.hasMorePresenceThanAbsences()));
        System.out.println("NAME IS MAX");
        System.out.println(StudentPredicates.filterStudents(studentList, StudentPredicates.hisNameIs("Max")));
    }


}
