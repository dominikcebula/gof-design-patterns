package com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform;

public class LinuxPlatform implements Platform {
    @Override
    public void updateUI() {
        System.out.println("Updating UI on Linux Platform.");
    }
}
