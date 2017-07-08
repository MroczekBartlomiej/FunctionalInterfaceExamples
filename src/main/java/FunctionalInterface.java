import java.util.function.Supplier;

public class FunctionalInterface {

    Supplier<Printer> printerSupplier = Printer::new;
    Printer printer = new Printer();

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Supplier basic use";
        System.out.println(supplier.get());

        FunctionalInterface functionalInterface = new FunctionalInterface();
        functionalInterface.printerFromNewOperator();
        functionalInterface.printerFromSupplier();

    }

    private void printerFromNewOperator(){
        System.out.println("Printer from new");
        printer.printUUID();
        printer.printUUID();
    }

    private void printerFromSupplier(){
        System.out.println("Printer from Supplier");
        printerSupplier.get().printUUID();
        printerSupplier.get().printUUID();
    }
}