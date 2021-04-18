package five.updateMySql;



import javax.management.relation.RelationSupport;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<Person>{

    static final String URL="jdbc:mysql://localhost:3306/human_resource?useSSL=false";
    static final String USERNAME="root";
    static final String PASSWORD="0000";

    @Override
    public void create(Person record) {

    }

    @Override
    public Person update(Person person) {
        try (Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
             PreparedStatement preparedStatement=connection.prepareStatement("UPDATE person SET surname=? WHERE id=?");){
            preparedStatement.setString(1,person.getSurname());
            preparedStatement.setInt(2,person.getId());
            int rows=preparedStatement.executeUpdate();
            System.out.println("Rows changed: " + rows);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void delete(Person record) {

    }

    @Override
    public Person retrieve(int id) {
        try(Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement=connection.createStatement();){
            String sqlStatement="SELECT * FROM person WHERE id=" + id;
            ResultSet resultSet=statement.executeQuery(sqlStatement);
            Person person=new Person();
            while(resultSet.next()) {
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                LocalDate localDateBirthday = birthday.toLocalDate();
                person.setBirthday(localDateBirthday);
                String genderr = resultSet.getString("gender");
                person.setGender(genderr.equals("MALE") ? Gender.MALE : Gender.FEMALE);
                break;
            }
            return person;
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Person> retrieveAll() {
        List<Person> personList=new ArrayList<>();
        try(Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement=connection.createStatement();){
            ResultSet resultSet=statement.executeQuery("SELECT * FROM person;");
            while(resultSet.next()){
                Person person=new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setSurname(resultSet.getString("surname"));
                Date birthday=resultSet.getDate("birthday");
                LocalDate localDateBirthday=birthday.toLocalDate();
                person.setBirthday(localDateBirthday);
                String genderr=resultSet.getString("gender");
                person.setGender(genderr.equals("MALE")? Gender.MALE: Gender.FEMALE);
                personList.add(person);
            }

        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return personList;
    }
    }

