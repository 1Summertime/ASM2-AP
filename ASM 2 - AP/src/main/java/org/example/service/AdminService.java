package org.example.service;

import org.example.entity.Teacher;
import org.example.interfaces.StudentInterface;
import org.example.interfaces.TeacherInterface;
import org.example.interfaces.UpdateInfoRequest;

public class AdminService implements UpdateInfoRequest {
    public TeacherService teacherService;
    public AdminService(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    public AdminService(TeacherInterface instance) {
    }

    @Override
    public void updateInfoTeacher(Teacher teacher) {
        teacherService.update(teacher);
    }
}
