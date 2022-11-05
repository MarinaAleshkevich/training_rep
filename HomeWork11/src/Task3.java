import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> predicate1 ;
        predicate1 = s -> s.startsWith("J");
        Predicate<String> predicate2 ;
        predicate2 = s -> s.startsWith("N");
        Predicate<String> predicate3 ;
        predicate3= s -> s.endsWith("A");

      Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.test("JAVA"));
        System.out.println(predicate.test("jAVA"));
        System.out.println(predicate.test("NANA"));
        System.out.println(predicate.test("MAP"));

    }
}

