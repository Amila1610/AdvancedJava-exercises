package five.updateMySql;



public class Executor {
    public static void main(String[] args) {
        //For retrieve:
        PersonDao personDao=new PersonDao();
        Person ana=personDao.retrieve(1);
        System.out.println(ana);
        //For update:
        /*String anaSurname=ana.getSurname()+"-Johanes";
        ana.setSurname(anaSurname);
        personDao.update(ana);*/

    }
}
