package com.dominikcebula.edu.design.patterns.memento.editor;

import com.dominikcebula.edu.design.patterns.memento.history.Memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void insert(String textToInsert) {
        text.append(textToInsert);
    }

    public void delete(int numberOfCharsToDelete) {
        int deletionStartIndex = text.length() - numberOfCharsToDelete;
        int deletionEndIndex = text.length();
        text.delete(deletionStartIndex, deletionEndIndex);
    }

    public StringBuilder getText() {
        return text;
    }

    public Memento getCurrentState() {
        return new TextMemento(this, text.toString());
    }

    private void setText(String text) {
        this.text = new StringBuilder(text);
    }

    private static class TextMemento implements Memento {
        private final TextEditor editor;
        private final String text;

        public TextMemento(TextEditor editor, String text) {
            this.editor = editor;
            this.text = text;
        }

        @Override
        public void restore() {
            editor.setText(text);
        }
    }
}
