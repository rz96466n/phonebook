package service;
import dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.user;

@Service
public class userService {
    @Autowired
    private Userdao Userdao;

    public Integer findnumber(String Username){
        Integer userNumber=Userdao.findinfo(Username).getNumber();    // return everying name+number
        System.out.println("this is the number :"+userNumber);
        return userNumber;
    }
    public String checkUsername(String Username){
        String username= Userdao.findinfo(Username).getUsername();

        System.out.println("this is user name :"+username);
        return  username;

    }



}
