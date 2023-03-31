package com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.token;

import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.base.AuthenticationData;

public class TokenAuthenticationData implements AuthenticationData {

    private final String token;

    public TokenAuthenticationData(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
