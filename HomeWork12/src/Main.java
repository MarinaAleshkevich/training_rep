import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
            Address a1 = new Address("NEW YORK", "WHITE PLAINS", 78);
            Address a2 = new Address("Minsk", "Renminnans Road", 5);
            Address a3 = new Address("Pekin", "Renminnan Road", 7);
          List<Person> persons = Arrays.asList(
            new Person("David", "Wazowski", a1),
            new Person("Mike", "Anderson", a2),
            new Person("Denis", "Garcia", a3),
            new Person(null, "Ivanov", a3),
            new Person("Ivan", null, a2),
            new Person("Petr", "Petrov", null));
    public static void main(String[] args) {
          Main item = new Main();
          item.exercise6();
        }
    private void exercise6 () {
                persons.stream()
                .filter (p -> p.getName() != null)
                .filter (p -> p.getLastName() != null)
                .filter (p -> p.getAddress() != null)
                .sorted(Comparator.comparing(p -> p.getAddress().getHouseNumber()))
                .collect(Collectors.toList())
                .forEach(p -> System.out.println(p.toString()));
           }
}