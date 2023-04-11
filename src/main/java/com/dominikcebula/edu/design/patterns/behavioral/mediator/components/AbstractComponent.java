package com.dominikcebula.edu.design.patterns.behavioral.mediator.components;

import com.dominikcebula.edu.design.patterns.behavioral.mediator.dialog.Mediator;

abstract class AbstractComponent implements Component {
    protected Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
