package com.jerson.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jerson.curso.springboot.error.springboot_error.models.domain.User;

@Service 
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

}
