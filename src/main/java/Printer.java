import java.util.List;
import java.util.function.Consumer;

public class Printer {


    public void print(List<Student> students, Consumer<Student> printer){
        students.forEach(student -> printer.accept(student));
    }
}
