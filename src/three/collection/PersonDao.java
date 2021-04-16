package three.collection;

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

    public List<Person> retrieveAll() {
        List<Person> personList = new ArrayList<>();
        Person anaJones = new Person("Ana", "Jones", LocalDate.of(1991, 12, 01));
        personList.add(anaJones);
        personList.add(anaJones);
        personList.add(new Person("Ana", "Jones", LocalDate.of(1991, 12, 01)));
        personList.add(new Person("Ema", "Emic", LocalDate.of(1986, 8, 12)));
        personList.add(new Person("Ana", "Anich", LocalDate.of(1992, 05, 06)));
        personList.add(new Person("Layla", "LLL", LocalDate.of(1975, 11, 17)));
        personList.add(new Person("Edo", "Edic", LocalDate.of(1976, 06, 21)));
        personList.add(new Person("Marko", "Maric", LocalDate.of(1996, 02, 13)));
        personList.add(new Person("Ana", "Anich", LocalDate.of(2000, 10, 30)));
        return personList;
    }
}
