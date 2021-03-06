package com.chat.toktalk.dto;

import com.chat.toktalk.domain.User;
import com.chat.toktalk.domain.OauthInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class GoogleUser implements Serializable {

    String name;
    String email;
    String picture;
    String sub;
  
    public OauthInfo toUserOauthInfoEntity() {
        return OauthInfo.builder().email(email).name(name).sub(sub).picture(picture).build();
    }
    public User toUserEntity(){
        return User.builder().email(email).nickname(name).build();
    }
}
