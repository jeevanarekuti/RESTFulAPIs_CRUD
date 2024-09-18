package com.example.sampleuser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);
    void deleteById(int id);
    User save(User user);
}
