package six.functionalInterfaceExample;

import five.updateMySql.Gender;
import five.updateMySql.Person;
import five.updateMySql.PersonDao;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionExecutor {
    public static void main(String[] args) {

        PersonDao personDao=new PersonDao();
        List<Person> personList=personDao.retrieveAll();
        //1. i 2. način: printPersons(personList);
        //3.način: printPersonsWithGender(personList,Gender.FEMALE);
        //4: printPersonsOlderThan(personList,20);
        //5: printPersonsYoungerThan(personList,18);
        //6: printPersonsWithAge(personList,21);
        //7: printPersonsWithingAges(personList,25,40);
        //8: printPersonsCollection(personList,p->true); This function print all
        //8: printPersonsCollection(personList,p->p.getGender().equals(Gender.FEMALE));
        //9: procesPersonCollection(personList,person -> person.getGender().equals(Gender.FEMALE),person -> System.out.println(person));

        personList.stream()
                  .filter(p->p.getGender().equals(Gender.FEMALE))
                  .forEach(p-> System.out.println(p));
    }
    /*  1.način:
    static void printPersons(Collection<Person> personCollection){
        Iterator<Person> personIterator=personCollection.iterator();
        while (personIterator.hasNext()){
            Person person=personIterator.next();
            System.out.println(person);
        }
    }*/
   /* 2.način:
   static void printPersons(Collection<Person>personCollection){
        for(Person person:personCollection){
            System.out.println(person);
        }
    }*/

    /*3. način:
    static void printPersonsWithGender(Collection<Person>personCollection,Gender gender){
        for(Person person:personCollection){
            if(person.getGender().equals(gender)){
                System.out.println(person);
            }}
        }*/
    /*4:
    static void printPersonsOlderThan(Collection<Person>personCollection,int age){
        for(Person person:personCollection){
            if(person.getAge()>age){
                System.out.println(person);
            }
        }
    }*/
    /* 5:
    static void printPersonsYoungerThan(Collection<Person>personCollection,int age){
        for(Person person:personCollection){
            if(person.getAge()<age){
                System.out.println(person);
            }
        }*/
       /* 6:
       static void printPersonsWithAge(Collection<Person>personCollection,int age){
            for(Person person:personCollection){
                if(person.getAge()==age){
                    System.out.println(person);
                }
            }*/
   /* 7:
   static void printPersonsWithingAges(Collection<Person>personCollection,int low, int high){
        for(Person person:personCollection){
            if(person.getAge()>=low&&person.getAge()>=high){
                System.out.println(person);
            }
        }*/
    /*8:
    static void printPersonsCollection(Collection<Person>personCollection, Predicate<Person>personTest){
        for(Person person:personCollection){
            if(personTest.test(person)){
                System.out.println(person);
            }
        }*/

         static void procesPersonCollection(Collection<Person>persons, Predicate<Person>test, Consumer<Person> consumer){
             for(Person person:persons){
               if(test.test(person)){
                consumer.accept(person);
            }}
        }

}
