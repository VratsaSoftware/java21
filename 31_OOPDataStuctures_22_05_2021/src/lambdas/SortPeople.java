package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPeople {
    public static void main(String[] args) {
        List<Person> people =
                Arrays.asList(new Person("Maria", 23),
                        new Person("Pesho", 44),
                        new Person("Gosho", 16),
                        new Person("Alexandra", 56));

        Collections.sort(people,
                Comparator.comparingInt(Person::getAge));

        System.out.println(people.toString());
    }
}
