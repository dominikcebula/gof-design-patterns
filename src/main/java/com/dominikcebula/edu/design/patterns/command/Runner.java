package com.dominikcebula.edu.design.patterns.command;

import com.dominikcebula.edu.design.patterns.command.commands.DeleteCommand;
import com.dominikcebula.edu.design.patterns.command.commands.InsertCommand;
import com.dominikcebula.edu.design.patterns.command.texteditor.TextEditor;
import com.dominikcebula.edu.design.patterns.command.texteditor.TextEditorCommandInvoker;

public class Runner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCommandInvoker textEditorCommandInvoker = new TextEditorCommandInvoker();

        textEditorCommandInvoker.executeCommand(new InsertCommand(textEditor, "Hello, World!"));
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.executeCommand(new DeleteCommand(textEditor, 6));
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.undo();
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.redo();
        System.out.println(textEditor.getText());
    }
}
