import java.util.*;
public class Main {
    public static void main(String[] args) {
     Person p1 = new Person("Tom","King", Gender.MALE);
     Person p2 = new Person("Alice","Walker", Gender.FEMALE);
     Person p3 = new Person("Poppy","Gilbert", Gender.FEMALE);
     Person p4 = new Person("Amelia","Evans", Gender.FEMALE);
     Person p5 = new Person("Oliver","Moore", Gender.MALE);
        ArrayList<Person> person = new ArrayList<>();
        person.add (p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
          System.out.println(person);
          System.out.printf("ArrayList has %d elements \n", person.size());
     Person p6 = new Person("Tom","King", Gender.MALE);
     Person p7 = new Person("Alice","Walker", Gender.FEMALE);
     Person p8 = new Person("Alice","Walker", Gender.FEMALE);
     Person p9 = new Person("Amelia","Evans", Gender.FEMALE);
     Person p10= new Person("Amelia","Evans", Gender.FEMALE);
        Set<Person> persons = new HashSet<>();
        persons.add(p6);
        persons.add(p7);
        persons.add(p8);
        persons.add(p9);
        persons.add(p10);
          System.out.println(person);
          System.out.printf("HashSet has %d elements \n", persons.size());
     Person p11 = new Person("Tom","King", Gender.MALE);
     Person p12 = new Person("Annie","Brown", Gender.FEMALE);
     Person p13 = new Person("Poppy","Gilbert", Gender.FEMALE);
     Person p14 = new Person("Freddy","Davis", Gender.MALE);
     Person p15 = new Person("Oliver","Moore", Gender.MALE);
        Map<Integer, Person> persons2 = new HashMap<>();
        persons2.put (10,p11);
        persons2.put (11,p12);
        persons2.put (13,p13);
        persons2.put (15,p14);
        persons2.put (18,p15);
        System.out.println(persons2);
        System.out.printf("HashMap has %d elements \n", persons2.size());
    }
}