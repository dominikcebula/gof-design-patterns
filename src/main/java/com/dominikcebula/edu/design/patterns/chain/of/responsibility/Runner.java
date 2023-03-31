package com.dominikcebula.edu.design.patterns.chain.of.responsibility;

import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.AuthenticationHandler;
import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.biometric.BiometricAuthenticationData;
import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.certificate.CertificateAuthenticationData;
import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.password.UsernamePasswordAuthenticationData;
import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.token.TokenAuthenticationData;

class Runner {
    public static void main(String[] args) {
        var authenticationHandler = new AuthenticationHandler();

        authenticationHandler.handleAuthentication(new UsernamePasswordAuthenticationData("admin", "123"));
        authenticationHandler.handleAuthentication(new TokenAuthenticationData("token200"));
        authenticationHandler.handleAuthentication(new CertificateAuthenticationData("certificate150"));
        authenticationHandler.handleAuthentication(new BiometricAuthenticationData());
    }
}
