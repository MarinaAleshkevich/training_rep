import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task6 {
    public static void main(String[] args) {
        Consumer<String> printable = Printable::print;
        List<String> list = new ArrayList<>();
        list.add("Mike");
        list.add("Vlad");

        list.forEach(printable);
    }
}
