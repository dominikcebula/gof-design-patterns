package com.dominikcebula.edu.design.patterns.behavioral.state;

import com.dominikcebula.edu.design.patterns.behavioral.state.game.character.GameCharacter;

public class Runner {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();
    }
}
