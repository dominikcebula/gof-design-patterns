package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.password;

import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.AuthenticationData;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.BaseAuthenticationHandler;

public class UsernamePasswordAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing username and password based authentication....");

        if (authenticationData.doesSupport(UsernamePasswordAuthenticationData.class)) {
            UsernamePasswordAuthenticationData usernamePasswordAuthenticationData = authenticationData.toType();

            return usernamePasswordAuthenticationData.getUsername().equals("admin")
                    && usernamePasswordAuthenticationData.getPassword().equals("123");
        }

        return handleNext(authenticationData);
    }
}
