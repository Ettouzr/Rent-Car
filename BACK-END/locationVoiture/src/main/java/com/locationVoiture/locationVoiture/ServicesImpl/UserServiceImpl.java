package com.locationVoiture.locationVoiture.ServicesImpl;

import com.locationVoiture.locationVoiture.Models.Marque;
import com.locationVoiture.locationVoiture.Models.User;
import com.locationVoiture.locationVoiture.Repository.MarqueRepository;
import com.locationVoiture.locationVoiture.Repository.UserRepository;
import com.locationVoiture.locationVoiture.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User findUser(String login, String password) {
        // TODO Auto-generated method stub
        return this.userRepository.findUser(login,password);
    }
}
