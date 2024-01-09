package com.locationVoiture.locationVoiture.Controllers;

import com.locationVoiture.locationVoiture.Models.Locataire;
import com.locationVoiture.locationVoiture.Models.User;
import com.locationVoiture.locationVoiture.Services.LocataireService;
import com.locationVoiture.locationVoiture.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(value="/login",method= RequestMethod.POST,headers="accept=Application/json")
    public User save(@RequestBody User user) {
        try {
            user=this.userService.findUser(user.getLogin(), user.getPassword());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return user;

    }
}
