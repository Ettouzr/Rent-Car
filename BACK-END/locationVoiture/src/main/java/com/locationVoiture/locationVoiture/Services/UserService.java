package com.locationVoiture.locationVoiture.Services;

import com.locationVoiture.locationVoiture.Models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findUser(String login, String password);
}