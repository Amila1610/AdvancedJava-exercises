package four.connectionStatementResultSet;

import java.util.List;

public class PersonTester {
    public static void main(String[] args) {

        PersonDao personDao=new PersonDao();
        List<Person>personList=personDao.retrieveAll();
        printPerson(personList);

    }

    private static void printPerson(List<Person>personList) {
        for (Person person:personList){
            System.out.println(person);
        }
    }

}
