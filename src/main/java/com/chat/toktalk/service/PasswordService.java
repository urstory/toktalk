package com.chat.toktalk.service;


import com.chat.toktalk.domain.PasswordResetToken;
import com.chat.toktalk.domain.User;
import com.chat.toktalk.security.LoginUserInfo;

public interface PasswordService {

    void savePasswordResetToken(PasswordResetToken passwordResetToken);

    PasswordResetToken findByToken(String token);

    void deletepasswordResetToken(PasswordResetToken passwordResetToken);

    void savePassword(User user, String password);

}
