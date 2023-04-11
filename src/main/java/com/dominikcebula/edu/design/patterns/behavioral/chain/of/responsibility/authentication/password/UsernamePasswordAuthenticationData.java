package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.password;

import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.AuthenticationData;

public class UsernamePasswordAuthenticationData implements AuthenticationData {

    private final String username;
    private final String password;

    public UsernamePasswordAuthenticationData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
