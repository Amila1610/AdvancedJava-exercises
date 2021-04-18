package six.lambdaExecutor;

import five.updateMySql.Gender;
import five.updateMySql.Person;
import five.updateMySql.PersonDao;

import java.util.List;

public class LambdaExecutor {
    public static void main(String[] args) {

        PersonDao personDao=new PersonDao();
        List<Person> personList=personDao.retrieveAll();
        personList.stream()
                  .filter(person -> person.getGender().equals(Gender.MALE))
                  .map(person -> person.getSurname())
                  .forEach(it->printString(it));

        personList.forEach(LambdaExecutor::printPerson);
    }



    static void printString(String name){
        System.out.println(name);
    }
    static void printPerson(Person person){
        System.out.println(person);
    }
}
