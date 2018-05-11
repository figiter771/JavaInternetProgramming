
package lv.va.sludinajumuportals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "User")
@Table (name = "user")
public class User {
      @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String type;
    String surname;

    public User() {
    }

    public User(int id, String name,String surname ,String type ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSurname() {
        return surname;
    }
}
