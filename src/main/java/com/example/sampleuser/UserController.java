package com.example.sampleuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        User user = userService.getUser(id);
        return user.toString();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PostMapping("/create")
    public String addUser(@RequestBody User user) {
        User user1 = userService.addUser(user.getName(), user.getAge(), user.getEmail());
        return user1.toString();
    }



}
