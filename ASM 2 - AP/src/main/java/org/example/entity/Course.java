package org.example.entity;

import java.util.Date;
import java.util.List;

public class Course {
    private int id;
    private String code;
    private String subjectCode;
    private String title;
    private Date startDate;
    private Date endDate;
    private Teacher teacher;
    private List<Student> studentList;
    public Course(){

    }
    public Course(int id, String code, String subjectCode, String title, Date startDate,
                  Date endDate, Teacher teacher, List<Student> studentList) {
        this.id = id;
        this.code = code;
        this.subjectCode = subjectCode;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
