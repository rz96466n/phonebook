package model;

import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "phonebook")
public class user {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Integer id;
    private String username;
    private Integer number;

    public Integer getid(){return id;}
    public void setid(Integer id){this.id=id;}

    public String getUsername(){ return username;}

    public void setUsername(String Username) {
        this.username = username;
    }

    public Integer getNumber(){
        return number;
    }

    public void setNumber(Integer number){this.number=number;}
}