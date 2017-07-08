import java.util.Random;
import java.util.UUID;

public class Printer {

    private UUID uuid;

    public Printer() {
        uuid = UUID.randomUUID();
    }

    public void printUUID(){
        System.out.println(uuid.toString());
    }
}
