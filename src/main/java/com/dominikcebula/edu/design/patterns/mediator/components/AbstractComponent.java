package com.dominikcebula.edu.design.patterns.mediator.components;

import com.dominikcebula.edu.design.patterns.mediator.dialog.Mediator;

abstract class AbstractComponent implements Component {
    protected Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
