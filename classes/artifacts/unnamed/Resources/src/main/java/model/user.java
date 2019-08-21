package model;

import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "phonebook")
public class user {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String username;
    private Integer number;



    public String getUsername(){ return username;}

    public void setUsername(String Username) {
        this.username = username;
    }

    public Integer getNumber(){
        return number;
    }

    public void setNumber(Integer number){this.number=number;}
}