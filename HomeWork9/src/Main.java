import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws EmptySourceFileException {
        Address a1 = new Address("NEW YORK", "WHITE PLAINS",78 );
        Address a2 = new Address("Minsk", "Renminnans Road", 5);
        Address a3 = new Address("Pekin", "Renminnan Road", 7);

        Person p1 = new Person("David", "Wazowski", a1);
           try {
               if (p1.name.equals("") | p1.surname.equals("") | p1.address.equals("")){
                 throw new NullFieldException("String can not be empty!");
             } else { System.out.println(p1);}
                 } catch(NullFieldException e){
               System.out.println(e.getMessage());
                 }
        Person p2 = new Person("Mike", "Anderson", a2);
           try {
            if (p2.name.equals("") | p2.surname.equals("") | p2.address.equals("")){
                 throw new NullFieldException("String can not be empty!");
            } else { System.out.println(p2);}
                 } catch(NullFieldException e){
            System.out.println(e.getMessage());
                 }
        Person p3 = new Person("Denis", "Garcia", a3);
        try {
            if (p3.name.equals("") | p3.surname.equals("") | p3.address.equals("")){
                throw new NullFieldException("String can not be empty!");
            } else { System.out.println(p3);}
                 } catch(NullFieldException e){
            System.out.println(e.getMessage());
                 }
      ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        PersonIOUtil.writePersons("Test.txt", persons);
        System.out.println("А что у нас в файле? А вот что:");
        PersonIOUtil.readPersons("Test.txt");
          }
}