package com.dominikcebula.edu.design.patterns.chain.of.responsibility.authentication.base;

public interface AuthenticationData {
    default boolean doesSupport(Class<? extends AuthenticationData> aClass) {
        return aClass.isAssignableFrom(this.getClass());
    }

    @SuppressWarnings("unchecked")
    default <T extends AuthenticationData> T toType(Class<? extends AuthenticationData> aClass) {
        return (T) this;
    }
}
