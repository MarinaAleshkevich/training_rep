package academy.belhard;

import entity.Person;
import entity.User;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Иван", "Иванов" );
        System.out.println(person1.getFullName());

        User user1 = new User("us@mail.ru" , "abc" , "Иван" , "Ивванов");
        System.out.println(user1.getFullInfo());
        System.out.println(user1.isPasswordCorrect(true));

    }
}