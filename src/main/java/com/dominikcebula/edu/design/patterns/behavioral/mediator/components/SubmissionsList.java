package com.dominikcebula.edu.design.patterns.behavioral.mediator.components;

import com.dominikcebula.edu.design.patterns.behavioral.mediator.dto.Submission;

import java.util.LinkedList;
import java.util.List;

public class SubmissionsList extends AbstractComponent {
    private final List<Submission> submissions = new LinkedList<>();

    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public int size() {
        return submissions.size();
    }
}
