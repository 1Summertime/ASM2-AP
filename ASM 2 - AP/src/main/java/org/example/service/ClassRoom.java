package org.example.service;

import org.example.interfaces.CommandInterface;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<CommandInterface> classActivities = new ArrayList<>();

    public void addActivity(CommandInterface activity) {
        classActivities.add(activity);
    }

    public void conductActivities() {
        for (CommandInterface activity : classActivities) {
            activity.execute();
        }
    }
}
