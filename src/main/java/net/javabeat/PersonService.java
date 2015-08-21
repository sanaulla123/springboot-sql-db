package net.javabeat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  private JdbcTemplate jdbcTemplate;
    
  public int addPerson(Person person){
    String sql = "INSERT INTO person(first_name, last_name, age, place) VALUES(?,?,?,?)";
    return jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getAge(), person.getPlace());    
  }
  
  public List<Person> getAllPerson(){
    return jdbcTemplate.query("SELECT * FROM person", new RowMapper<Person>(){

      public Person mapRow(ResultSet rs, int arg1) throws SQLException {
        Person p = new Person();
        p.setAge(rs.getInt("age"));
        p.setFirstName(rs.getString("first_name"));
        p.setLastName(rs.getString("last_name"));
        p.setPlace(rs.getString("place"));
        return p;
      }
      
    });
  }
}
