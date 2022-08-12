package day6;

public class Task3 {
    public static void main(String[] args) {
        Student someStudent = new Student("Mark");

        Teacher someTeacher = new Teacher("Bob","Mathematics");

        someTeacher.evaluate(someStudent);

    }
}
