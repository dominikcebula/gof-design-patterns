package com.dominikcebula.edu.design.patterns.structural.bridge.ui.components;

import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.Platform;

abstract class Component {
    protected final Platform platform;

    public Component(Platform platform) {
        this.platform = platform;
    }
}
