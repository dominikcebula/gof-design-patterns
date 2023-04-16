package com.dominikcebula.edu.design.patterns.structural.proxy.security;

import java.util.Set;

public record AuthenticationToken(String name, Set<Authority> authorities) {
    public boolean hasAuthority(Authority authority) {
        return authorities.contains(authority);
    }
}
