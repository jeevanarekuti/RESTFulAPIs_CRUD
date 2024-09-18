package com.example.sampleuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User updateEmail(int id, String email) {
        User user = userRepository.findById(id);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    public User getUser(int id) {
        return userRepository.findById(id);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public User addUser(String name,int age,String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        return userRepository.save(user);
    }
}
