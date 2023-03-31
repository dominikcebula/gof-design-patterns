package com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.certificate;

import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.base.AuthenticationData;
import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.base.BaseAuthenticationHandler;

public class CertificateAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing Certificate based authentication....");

        if (authenticationData.doesSupport(CertificateAuthenticationData.class)) {
            CertificateAuthenticationData certificateAuthenticationData = authenticationData.toType(CertificateAuthenticationData.class);

            return certificateAuthenticationData.getCertificate().equals("certificate150");
        }

        return handleNext(authenticationData);
    }
}
