package com.dominikcebula.edu.design.patterns.state.game.character.states;

public interface CharacterState {
    String getName();

    void move();

    void speak();

    void shoot();

    void toNextState();
}
