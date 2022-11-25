package com.example.exam.controller;

import com.example.exam.entity.User;
import com.example.exam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();
        if (users != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/user/")
    public ResponseEntity<User> save(@RequestBody User user) {
        User save = userService.save(user);
        if (save != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable("id") int id) {
        User update = userService.update(user, id);
        if (update != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
        boolean delete = userService.delete(id);
        if (delete) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
