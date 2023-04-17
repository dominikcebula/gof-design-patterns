package com.dominikcebula.edu.design.patterns.structural.bridge.ui.components;

import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.Platform;

public class Button extends Component {
    public Button(Platform platform) {
        super(platform);
    }

    public void click() {
        System.out.println("Button was clicked.");
        platform.updateUI();
    }
}
