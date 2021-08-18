package com.digifreneur.logiman.backendsvc.service;

import com.digifreneur.logiman.backendsvc.model.User;
import com.digifreneur.logiman.backendsvc.pojo.UserParam;
import com.digifreneur.logiman.backendsvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User addUser(UserParam param) {
        User user = new User();
        user.setName(param.getName());
        user.setSalary(param.getSalary());
        return userRepository.save(user);
    }

}
