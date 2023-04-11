package com.dominikcebula.edu.design.patterns.behavioral.memento.history;

import java.util.Stack;

public class History {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void add(Memento memento) {
        undoStack.add(memento);
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty())
            return;

        Memento memento = undoStack.pop();
        redoStack.push(memento);
        memento.restore();
    }

    public void redo() {
        if (redoStack.isEmpty())
            return;

        Memento memento = redoStack.pop();
        undoStack.push(memento);
        memento.restore();
    }
}
