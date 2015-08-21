package net.javabeat;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntity implements Serializable{

  private static final long serialVersionUID = -1801714432822866390L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @Column(name="first_name", nullable = false)
  private String firstName;
  
  @Column(name="last_name", nullable = false)
  private String lastName;
  
  private int age;
  
  private String place;
  
  protected PersonEntity(){
    
  }
  
  public PersonEntity(String firstName, String lastName, int age, String place){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.place = place;
  }
  
  public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append(this.getId()).append(", ")
      .append(this.getFirstName()).append(", ")
      .append(this.getLastName()).append(", ")
      .append(this.getPlace()).append(", ")
      .append(this.getAge());
    
    return builder.toString();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }
  
  
}
