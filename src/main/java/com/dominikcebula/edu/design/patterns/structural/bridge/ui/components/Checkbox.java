package com.dominikcebula.edu.design.patterns.structural.bridge.ui.components;

import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.Platform;

public class Checkbox extends Component {
    public Checkbox(Platform platform) {
        super(platform);
    }

    public void check() {
        System.out.println("Checkbox was checked.");
        platform.updateUI();
    }

    public void uncheck() {
        System.out.println("Checkbox was unchecked.");
        platform.updateUI();
    }
}
