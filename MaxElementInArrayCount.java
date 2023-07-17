package codility;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Want to know how many times the max element
 * is in the array
 */
public class MaxElementInArrayCount {
    public static void main(String[] args) {
        if (returnPersonByName("claire")) {
            System.out.println("test ok");
        } else {
            System.out.println("test fail");
        }
        groupByLongName(new String[]{"ale", "claire", "jesus", "alejandro", "alejandra"});
    }

    private static boolean returnPersonByName(String name) {
        List<Person>  listPersons = List.of(new Person("ale", 40),
                new Person("claire", 40),
                new Person("jesus", 2023));

        String result = listPersons.stream()
                .map(person -> person.getName())
                .filter(p -> p.matches(name))
                .collect(Collectors.joining());
        return (result).equals(name) ? true : false;

    }

    private static void groupByLongName(String[] arrayNames) {
        Map<Integer, List<String>> group = Arrays.stream(arrayNames)
                .collect(Collectors.groupingBy(String::length));

        group.forEach((length, name) -> {
            System.out.println(name + ": " + length);
        });

    }

    public static class Person {

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String name;
        int age;
    }

}


