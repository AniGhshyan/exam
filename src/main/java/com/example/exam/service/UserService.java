package com.example.exam.service;

import com.example.exam.entity.User;
import com.example.exam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user, int id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            User user1 = byId.get();
            if (user.getName() != null) {
                user1.setName(user.getName());
            }
            if (user.getSurname() != null) {
                user1.setSurname(user.getSurname());
            }
            if (user.getEmail() != null) {
                user1.setEmail(user.getEmail());
            }
            if (user.getPassword() != null) {
                user1.setPassword(user.getPassword());
            }
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public boolean delete(int id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            User user = byId.get();
            userRepository.delete(user);
            return true;
        } else {
            return false;
        }
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
