package com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform;

public class MacPlatform implements Platform {
    @Override
    public void updateUI() {
        System.out.println("Updating UI on Mac Platform.");
    }
}
