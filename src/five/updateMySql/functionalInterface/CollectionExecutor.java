package five.updateMySql.functionalInterface;

import five.updateMySql.Gender;
import five.updateMySql.Person;
import five.updateMySql.PersonDao;

import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionExecutor {
    public static void main(String[] args) {
    PersonDao personDao=new PersonDao();
    List<Person> listOfPersons=personDao.retrieveAll();
    printPersons(listOfPersons);
    System.out.println();
    printPersons(listOfPersons);

   //With ITERATOR or Functional Interface---->
    PersonChecker personChecker=p -> p.getName().equals(("Sara"));
    boolean Test=personChecker.test(listOfPersons.get(0));
    }


    /*//1.ENHANCED FOR LOOP-when we haven't updates
    static void printPersons(Collection<Person>collectionOfPerson){
        for(Person person:collectionOfPerson){
            if(person.getGender().equals(Gender.FEMALE)){
                System.out.println(person);
            }
        }
    }*/
    //ITERATOR-when we have updates
   /* static void printPersons(Collection<Person>collectionOfPerson){
        Iterator< Person> iterator=collectionOfPerson.iterator();
        while (iterator.hasNext()){
            Person person=iterator.next();
            System.out.println(person);
            if(person.getSurname().equals("Sar")){
                iterator.remove();
            }
        }
    }*/

    //FUNCTIONAL INTERFACE
    static void printPersons(Collection<Person>collectionOfPerson){
        //1.Consumer<Person> personConsumer=person -> System.out.println(person);
        Predicate<Person> personGenderTest=p -> p.getGender().equals(Gender.MALE);

        /*Stream<Person> personStream=collectionOfPerson.stream();
        personStream=personStream.filter(p->p.getGender().equals(Gender.MALE));
        personStream.forEach(p->System.out.println(p));*/

        collectionOfPerson.stream()
                          .filter(p->p.getGender().equals(Gender.FEMALE))
                .forEach(p->System.out.println(p));
    }
}