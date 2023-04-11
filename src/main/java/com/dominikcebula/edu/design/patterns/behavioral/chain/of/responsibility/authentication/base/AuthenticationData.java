package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base;

public interface AuthenticationData {
    default boolean doesSupport(Class<? extends AuthenticationData> aClass) {
        return aClass.isAssignableFrom(this.getClass());
    }

    @SuppressWarnings("unchecked")
    default <T extends AuthenticationData> T toType() {
        return (T) this;
    }
}
