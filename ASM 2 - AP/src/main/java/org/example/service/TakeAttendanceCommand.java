package org.example.service;

import org.example.entity.Teacher;
import org.example.interfaces.CommandInterface;

public class TakeAttendanceCommand implements CommandInterface {
    private Teacher teacher;
    public TakeAttendanceCommand(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void execute() {
        teacher.takeAttendance();
    }
}
