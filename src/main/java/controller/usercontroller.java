package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.userService;
import model.user;
import dao.userDao;
import java.util.List;
@RestController
@RequestMapping("/")
public class usercontroller {
@Autowired
private userDao USERDAO;
    @Autowired
    private userService userService;
    @GetMapping("/s")
    public List<user> findalluser(){


        return USERDAO.findAll();
    }


//
//  //@GetMapping("/")
//    public Integer checkUsername(@RequestParam String username) {
//        if(username== userService.checkUsername(username)){
//
//          return userService.findnumber(username);
//
//        }
//        else{
//            System.out.println("null");
//            return null;
//
//        }
//
//
//    }
}







