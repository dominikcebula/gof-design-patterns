package com.dominikcebula.edu.design.patterns.structural.bridge.ui.components;

import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.Platform;

abstract class Component {
    final Platform platform;

    Component(Platform platform) {
        this.platform = platform;
    }
}
