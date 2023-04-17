package com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform;

public class WindowsPlatform implements Platform {
    @Override
    public void updateUI() {
        System.out.println("Updating UI on Windows Platform.");
    }
}
