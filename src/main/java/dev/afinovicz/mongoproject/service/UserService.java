package dev.afinovicz.mongoproject.service;

import dev.afinovicz.mongoproject.domain.User;
import dev.afinovicz.mongoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}
