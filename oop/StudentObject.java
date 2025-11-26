package oop;

public class StudentObject {
    public static void main(String[] args){

        Student student = new Student();
        Teacher teacher = new Teacher();

        student.set_name("Student");
        teacher.set_name("teacher");

        System.out.println(student.get_verified());
        student.set_level("level 2");
        System.out.println(student.get_level());
    }
}
