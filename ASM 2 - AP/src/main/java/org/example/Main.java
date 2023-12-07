package org.example;

import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.*;
import org.example.service.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.example.entity.Student.createStudent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

       // Singleton ================================================================
        Teacher teacher1 = new Teacher(1,"Dinh Van Dong");
        TeacherService.getInstance().insert(teacher1);
//
//        // Iterator ============Behavior ====================================================
//
//        Student student1 = new Student(1,"An");
//        Student student2 = new Student(2, "Binh");
//        Student student3 = new Student(3,"Nam");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        Iterator<Student> iterator = studentList.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            System.out.println(student.toString());
//        }
//        //===================================================================================
//        // Adapter ========Structural Pattern
//        UpdateInfoRequest updateInfoRequest = new AdminService(TeacherService.getInstance());
//        updateInfoRequest.updateInfoTeacher(teacher);
//
//
//
//
//
//        //===================================================================================
        // Factory Method == Creational Pattern
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();
        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();
        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();
//        //=========================================================================
//
//
//        //Facade
//
        FacadeService facadeService = new FacadeService();
        facadeService.operationDeleteTeacher(1);
//
        //Proxy ==========================================================================
        ManagerStudentInterface studentManager = new ProxyStudentManager();
        studentManager.enrollStudent("Student 1");
        studentManager.enrollStudent("Student 2");
        studentManager.listStudents();
        studentManager.expelStudent("Student 1");
        studentManager.listStudents();

        //commands ================================================================================
        Student student = new Student(1,"Duy Xuan");
        Teacher teacher = new Teacher(1,"Dinh Van Dong");
        ClassRoom classroom = new ClassRoom();

        CommandInterface submitAssignmentCommand = new SubmitAssignmentCommand(student, "Java Homework");
        CommandInterface takeAttendanceCommand = new TakeAttendanceCommand(teacher);
        classroom.addActivity(submitAssignmentCommand);
        classroom.addActivity(takeAttendanceCommand);

        classroom.conductActivities();

        //Memento ================================================================================
        Student student12 = new Student("Duy Xuan", "21",3.5f);
        StudentCareTaker careTaker = new StudentCareTaker();
        System.out.println("Initial Student Information:" );
        student12.displayInfo();
        careTaker.setMemento(student.createMemento());
        student12.updateInfo("Duy Xuan", "21",3.4f);
        System.out.println("\nUpdated Student Information:");
        student12.displayInfo();

        student12.restoreFromMemento(careTaker.getMemento());

        System.out.println("\nRestored Student Information:");
        student12.displayInfo();

        //============================
        StudentFactory csFactory = new ComputerScienceStudentFactory();
        StudentFactory bioFactory = new BiologyStudentFactory();

        createStudent(csFactory);
        createStudent(bioFactory);

    }




}