package org.example.service;

import org.example.entity.Parent;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.NotifyInterface;

public class AccountFactory  {
    public AccountFactory() {
    }

    public static NotifyInterface createNotification(String type) {
        if (type.equals("Student")) {
            return new Student();
        } else if (type.equals("Teacher")) {
            return new Teacher();
        } else if (type.equals("Parent")) {
            return (NotifyInterface) new Parent();
        } else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }

}
