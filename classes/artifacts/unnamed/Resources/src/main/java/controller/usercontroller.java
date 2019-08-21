package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.userService;
import model.user;
@RestController
@RequestMapping("/")
public class usercontroller {

    @Autowired
    private userService userService;

    @GetMapping("/")
    public Integer checkUsername(@RequestParam String username) {
        if(username== userService.checkUsername(username)){

          return userService.findnumber(username);

        }
        else{
            System.out.println("null");
            return null;

        }


    }
}







