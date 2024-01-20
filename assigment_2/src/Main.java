import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("Abai", "Bigaliev", "Loafer", 1);
        Person e2 = new Employee("Din", "Winchester", "Hunter", 999999);
        Person e3 = new Employee("Sam", "Altman", "Programmer", 9999999);
        Person e4 = new Employee("Elon", "Musk", "Engineer", 999999999);
        Person e5 = new Employee("Steve", "Jobs", "Developer", 1000000);

        Person s1 = new Student("Asanali", "Karabek", 3.33);
        Person s2 = new Student("Abai", "Bigaliev", 1.0);
        Person s3 = new Student("Ismail", "Ragimov", 4.0);
        Person s4 = new Student("Kanagat", "Zholdasov", 2.99);
        Person s5 = new Student("Sergey", "Tarshilov", 3.12);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}