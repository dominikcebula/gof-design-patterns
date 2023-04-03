package com.dominikcebula.edu.design.patterns.command.texteditor;

public class TextEditor {
    private final StringBuilder text = new StringBuilder();

    public void insert(String textToInsert) {
        text.append(textToInsert);
    }

    public String delete(int numberOfCharsToDelete) {
        int deletionStartIndex = text.length() - numberOfCharsToDelete;
        int deletionEndIndex = text.length();

        String deletedText = text.substring(deletionStartIndex, deletionEndIndex);
        text.delete(deletionStartIndex, deletionEndIndex);
        return deletedText;
    }

    public String getText() {
        return text.toString();
    }
}
