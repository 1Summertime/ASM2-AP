package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;
import org.example.core.Person;

public class Admin extends Person implements NotifyInterface {


    public void notification() {
        System.out.println("Admin notify");
    }

}
