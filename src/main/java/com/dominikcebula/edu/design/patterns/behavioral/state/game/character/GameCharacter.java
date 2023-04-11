package com.dominikcebula.edu.design.patterns.behavioral.state.game.character;

import com.dominikcebula.edu.design.patterns.behavioral.state.game.character.states.CharacterState;
import com.dominikcebula.edu.design.patterns.behavioral.state.game.character.states.StandingCharacterState;

public class GameCharacter {

    private CharacterState characterState = new StandingCharacterState(this);

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }

    public CharacterState getCharacterState() {
        return characterState;
    }

    public void move() {
        characterState.move();
    }

    public void speak() {
        characterState.speak();
    }

    public void shoot() {
        characterState.shoot();
    }

    public void toNextState() {
        characterState.toNextState();
    }
}
