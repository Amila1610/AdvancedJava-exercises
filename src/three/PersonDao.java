package three;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<Person> {
    @Override
    public void create(Person record) {

    }

    @Override
    public Person update(Person record) {
        return null;
    }

    @Override
    public void delete(Person record) {

    }

    @Override
    public Person retrieve(int id) {
        return null;
    }

    @Override
    public List<Person> retrieveAll() {
        List<Person> personList=new ArrayList<>();
        Person anaAnich=new Person("Ana","Anich", LocalDate.of(1991,11,26));
        personList.add(anaAnich);
        personList.add(anaAnich);
        personList.add(new Person("Ena","Enich",LocalDate.of(1991,11,26)));
        personList.add(new Person("Ana","Jones",LocalDate.of(1989,03,20)));
        personList.add(new Person("Ena","Enich",LocalDate.of(1977,9,16)));
        personList.add(new Person("Ana","Anich",LocalDate.of(1991,11,26)));
        personList.add(new Person("Ella","Ellich",LocalDate.of(1985,8,11)));
        personList.add(new Person("Maja","Majich",LocalDate.of(1971,05,30)));
        personList.add(new Person("Mario","Marich",LocalDate.of(1991,11,26)));
        personList.add(new Person("Iva","Ivich",LocalDate.of(2000,03,01)));
        personList.add(new Person("Tea","Teich",LocalDate.of(2014,02,05)));

        return personList;
    }
}
