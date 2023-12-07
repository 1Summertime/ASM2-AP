package org.example.interfaces;

import org.example.entity.Student;

import java.util.Iterator;

public interface StudentAggregateInterface {
    Iterator<Student> createIterator();
}
