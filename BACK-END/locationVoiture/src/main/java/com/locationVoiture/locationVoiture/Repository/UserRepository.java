package com.locationVoiture.locationVoiture.Repository;

import com.locationVoiture.locationVoiture.Models.User;
import com.locationVoiture.locationVoiture.Models.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("SELECT c FROM User c WHERE c.login = :login and c.password = :password")
    User findUser(@Param("login") String login,@Param("password") String password);

}
