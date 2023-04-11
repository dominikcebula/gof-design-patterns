package com.dominikcebula.edu.design.patterns.behavioral.state.game.character.states;

import com.dominikcebula.edu.design.patterns.behavioral.state.game.character.GameCharacter;

public class RunningCharacterState implements CharacterState {
    private final GameCharacter gameCharacter;

    public RunningCharacterState(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public String getName() {
        return "Running";
    }

    @Override
    public void move() {
        System.out.println("Running...");
    }

    @Override
    public void speak() {
        System.out.println("Speaking while running...");
    }

    @Override
    public void shoot() {
        System.out.println("Shooting while running...");
    }

    @Override
    public void toNextState() {
        gameCharacter.setCharacterState(new StandingCharacterState(gameCharacter));
    }
}
