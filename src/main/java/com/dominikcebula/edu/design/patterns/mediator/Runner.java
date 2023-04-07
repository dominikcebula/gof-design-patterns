package com.dominikcebula.edu.design.patterns.mediator;

import com.dominikcebula.edu.design.patterns.mediator.components.SubmissionsList;
import com.dominikcebula.edu.design.patterns.mediator.components.SubmitButton;
import com.dominikcebula.edu.design.patterns.mediator.components.TextField;
import com.dominikcebula.edu.design.patterns.mediator.dialog.Dialog;
import com.dominikcebula.edu.design.patterns.mediator.dialog.Mediator;

public class Runner {
    public static void main(String[] args) {
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField emailField = new TextField();
        SubmitButton submitButton = new SubmitButton();
        SubmissionsList submissionsList = new SubmissionsList();

        Mediator dialog = new Dialog(firstNameField, lastNameField, emailField, submitButton, submissionsList);

        firstNameField.setMediator(dialog);
        lastNameField.setMediator(dialog);
        emailField.setMediator(dialog);
        submitButton.setMediator(dialog);
        submissionsList.setMediator(dialog);

        System.out.println("Submit button is enabled = " + submitButton.isEnabled());
        System.out.println("Submissions list size = " + submissionsList.size());

        firstNameField.setValue("John");
        lastNameField.setValue("Doe");
        emailField.setValue("John.Doe@mail.com");
        // notice submit button changed to enabled automatically once all fields are filled
        lastNameField.clearValue();
        // notice submit button changed to disabled automatically once value on at least one field is cleared
        lastNameField.setValue("Doe");
        // notice submit button changed to enabled state again once assigning back missing value

        submitButton.click();
        // notice how submission processing does not require each fields to know about each other
        // mediator knows about each field, but each field do not know about each other

        System.out.println("Submissions list size = " + submissionsList.size());
        submissionsList.getSubmissions().forEach(System.out::println);
    }
}
