package org.example.service;

import org.example.interfaces.StudentFactory;

public class BiologyStudentFactory implements StudentFactory {
    @Override
    public BiologyStudent createStudent() {
        return new BiologyStudent();

    }
}
