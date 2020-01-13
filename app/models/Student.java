package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;


import play.*;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "student")
public class Student extends Model {
    @Constraints.Required
    private String firstName;
    @Constraints.Required
    private String lastName;
    @Constraints.Required
    private int age;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;

    public static Finder<Integer, Student> find = new Finder<Integer, Student>(Student.class);

}
