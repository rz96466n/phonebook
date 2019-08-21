package service;
import dao.UserdaoIpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private UserdaoIpl UserdaoIpl;

    public Integer findnumber(String Username){
        Integer userNumber= UserdaoIpl.findinfo(Username).getNumber();    // return everying name+number
        System.out.println("this is the number :"+userNumber);
        return userNumber;
    }
    public String checkUsername(String Username){
        String username= UserdaoIpl.findinfo(Username).getUsername();

        System.out.println("this is user name :"+username);
        return  username;

    }



}
