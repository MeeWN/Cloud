/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmutt.sit.MyFirstService.controller;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mee
 */
@RestController
public class UserController {
    Object[] users = new Object[5];
    String[] name = {"Wutthipong","Mee","KoKoCrun","ZZZ","AA"};
    @GetMapping("/user/alluser")
    public Object[] allUser() { 
        for(int i =0;i<5;i++){
            users[i] = new User(i+1,name[i]);
        }  
        return users;
    } 

    public Object[] getUsers() {
        return users;
    }

    public String[] getName() {
        return name;
    }
    
}