package three;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonTester {
    public static void main(String[] args) {

        PersonDao personDao=new PersonDao();
        List<Person> listOfPerson= personDao.retrieveAll();
        //Set<Person> personSet=new HashSet<>(listOfPerson);
        Set<Person> personSet=new TreeSet<>(listOfPerson);
        for(Person person:personSet){
            System.out.println(person);
        }
    }
}
