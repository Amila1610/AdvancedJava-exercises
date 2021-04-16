package three.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonTester {
    public static void main(String[] args) {

        PersonDao personDao = new PersonDao();
       List<Person> listOfPerson = personDao.retrieveAll();
        Set<Person> personSet=new HashSet<>(listOfPerson);

        for (Person person : personSet) {
            person.hashCode();
            System.out.println(person);
        }
    }
}
