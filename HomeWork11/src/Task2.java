import java.util.function.Predicate;
public class Task2 {
    public static void main(String[] args) {
        Predicate<String> predicate;
        predicate = String::isEmpty;
        boolean res = predicate.test("");
        System.out.println(res);
    }
}
