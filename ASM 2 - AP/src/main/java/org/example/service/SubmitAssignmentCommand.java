package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.CommandInterface;

public class SubmitAssignmentCommand implements CommandInterface {

    private Student student;
    private String assignment;

    public SubmitAssignmentCommand(Student student, String assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    @Override
    public void execute() {
        student.submitAssignment(assignment);
    }
}
