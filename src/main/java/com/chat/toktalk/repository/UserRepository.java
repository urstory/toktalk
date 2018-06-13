package com.chat.toktalk.repository;

import com.chat.toktalk.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findUsersByEmail(String email);
    public User findUserByEmail(String email);
    @Query("SELECT oauth.user FROM UserOauthInfo oauth WHERE oauth.email = :email")
    public User getOauthUser(@Param("email")String email);


}
