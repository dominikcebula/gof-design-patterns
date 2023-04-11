package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication;

import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.AuthenticationData;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.BaseAuthenticationHandler;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.certificate.CertificateAuthenticationHandler;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.password.UsernamePasswordAuthenticationHandler;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.token.TokenAuthenticationHandler;

public class AuthenticationHandler {

    private final BaseAuthenticationHandler rootAuthenticationHandler;

    public AuthenticationHandler() {
        var usernamePasswordAuthenticationHandler = new UsernamePasswordAuthenticationHandler();
        var tokenAuthenticationHandler = new TokenAuthenticationHandler();
        var certificateAuthenticationHandler = new CertificateAuthenticationHandler();

        usernamePasswordAuthenticationHandler.setNextHandler(tokenAuthenticationHandler);
        tokenAuthenticationHandler.setNextHandler(certificateAuthenticationHandler);

        rootAuthenticationHandler = usernamePasswordAuthenticationHandler;
    }

    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Trying to authenticate with " + authenticationData.getClass().getSimpleName() + "...");

        boolean authenticationResult = rootAuthenticationHandler.handleAuthentication(authenticationData);

        System.out.println("Authentication was " + (authenticationResult ? "successful" : "unsuccessful"));
        System.out.println();

        return authenticationResult;
    }
}
