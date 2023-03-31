package com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.certificate;

import com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.base.AuthenticationData;

public class CertificateAuthenticationData implements AuthenticationData {

    private final String certificate;

    public CertificateAuthenticationData(String certificate) {
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }
}
