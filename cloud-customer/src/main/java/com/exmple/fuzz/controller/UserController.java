package com.exmple.fuzz.controller;

import com.exmple.fuzz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author fuzz
 * @since 2020/10/19 13:46
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/list")
    public List<User> userList() {
        List<User> users = restTemplate.getForObject("http://localhost:7001/user/list", List.class);
        System.out.println(users);
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return null;
    }
}
