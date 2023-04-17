package com.dominikcebula.edu.design.patterns.structural.bridge;

import com.dominikcebula.edu.design.patterns.structural.bridge.ui.components.Button;
import com.dominikcebula.edu.design.patterns.structural.bridge.ui.components.Checkbox;
import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.LinuxPlatform;
import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.MacPlatform;
import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.Platform;
import com.dominikcebula.edu.design.patterns.structural.bridge.ui.platform.WindowsPlatform;

public class Runner {
    public static void main(String[] args) {
        Platform linuxPlatform = new LinuxPlatform();
        Platform windowsPlatform = new WindowsPlatform();
        Platform macPlatform = new MacPlatform();

        Button buttonOnLinux = new Button(linuxPlatform);
        Button buttonOnWindows = new Button(windowsPlatform);

        buttonOnLinux.click();
        buttonOnWindows.click();

        Checkbox checkboxOnLinux = new Checkbox(linuxPlatform);
        Checkbox checkboxOnMac = new Checkbox(macPlatform);

        checkboxOnLinux.check();
        checkboxOnLinux.uncheck();
        checkboxOnMac.check();
    }
}
