package com.chat.toktalk.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;

public class LoginUserInfo extends User implements Serializable {
    private Long id;
    private String nickname;

    public LoginUserInfo(String username, String password, Collection<? extends GrantedAuthority> authorities, Long id, String nickname) {
        super(username, password, authorities);
        this.id = id;
        this.nickname = nickname;
    }

    public LoginUserInfo(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Long id, String nickname) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail(){
        return getUsername();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

}
