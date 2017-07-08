import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {

    public static void main(String[] args) {

        /*
        *It's basic example how Consumer works
        */
        System.out.println("It's basic example how Consumer works");
        Consumer<String> consumer  = (x) -> System.out.println(x.toLowerCase());
        consumer.accept("LOREM IPSUM");

        /*
        * It is more complex example how to use Consumer
         */
        System.out.println("\nIt is more complex example how to use Consumer");
        FunctionalInterface functionalInterface = new FunctionalInterface();
        Printer printer = new Printer();
        List<Student> students = Arrays.asList(
                new Student(1, "John", "Smith"),
                new Student(2, "Alex", "Hall"),
                new Student(3, "Max", "Cook")
        );

        List<Consumer<Student>> printerList = functionalInterface.createPrinter();
        for (Consumer<Student> p : printerList) {
            printer.print(students, p);
        }

    }

    private List<Consumer<Student>> createPrinter() {
        return Arrays.asList(
                student -> System.out.println(student.firstName),
                student -> System.out.println(student.firstName + " " + student.lastName),
                student -> System.out.println(student.toString())
        );
    }
}
