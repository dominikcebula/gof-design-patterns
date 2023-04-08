package com.dominikcebula.edu.design.patterns.memento;

import com.dominikcebula.edu.design.patterns.memento.editor.TextEditor;
import com.dominikcebula.edu.design.patterns.memento.history.History;

public class Runner {
    public static void main(String[] args) {
        History history = new History();
        TextEditor editor = new TextEditor();

        editor.insert("Hello World!");
        editor.insert(" Hello Again!");
        System.out.println(editor.getText()); // Hello World! Hello Again!
        history.add(editor.getCurrentState());

        editor.delete(6);
        System.out.println(editor.getText()); // Hello World! Hello
        history.add(editor.getCurrentState());

        editor.insert("John!");
        System.out.println(editor.getText()); // Hello World! Hello John!
        history.add(editor.getCurrentState());

        editor.delete(1);
        editor.insert(" & Mark!");
        history.add(editor.getCurrentState());
        history.undo();
        history.undo();
        history.undo();
        history.undo();
        System.out.println(editor.getText()); // Hello World! Hello Again!

        history.redo();
        history.redo();
        history.redo();
        history.redo();
        System.out.println(editor.getText()); // Hello World! Hello John & Mark!
    }
}
