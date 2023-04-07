package com.dominikcebula.edu.design.patterns.mediator.components;

public class SubmitButton extends AbstractComponent {
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        if (this.enabled != enabled)
            System.out.println("Changing submit button state to enabled = " + enabled);
        this.enabled = enabled;
    }

    public void click() {
        if (!enabled)
            throw new IllegalStateException("Submit button is disabled.");

        mediator.processSubmission();
    }
}
