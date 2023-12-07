package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

import java.util.Date;

public class Teacher extends Person implements NotifyInterface {
    private String teacherCode;
    private int salaryLevel;
    private String maxdegree;
    private String major;
    private String taxCode;
    private String insurenceCode;
    private double salary;

   public Teacher(){

   }

    public Teacher(int id,String name) {
       setId(id);
       setName(name);
    }

    public Teacher(int id, String name, String address, String phone, String personID, Date birthDate, String email, String teacherCode, int salaryLevel, String maxdegree, String major, String taxCode, String insurenceCode, double salary) {
        super(id, name, address, phone, personID, birthDate, email);
        this.teacherCode = teacherCode;
        this.salaryLevel = salaryLevel;
        this.maxdegree = maxdegree;
        this.major = major;
        this.taxCode = taxCode;
        this.insurenceCode = insurenceCode;
        this.salary = salary;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getMaxdegree() {
        return maxdegree;
    }

    public void setMaxdegree(String maxdegree) {
        this.maxdegree = maxdegree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getInsurenceCode() {
        return insurenceCode;
    }

    public void setInsurenceCode(String insurenceCode) {
        this.insurenceCode = insurenceCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void notification() {
        System.out.println("Teacher notify");
    }

    public void takeAttendance() {
        System.out.println("Attendance taken for the class.");
    }
}
