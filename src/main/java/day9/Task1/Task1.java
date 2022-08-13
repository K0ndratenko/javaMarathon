package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

Student newStudent = new Student("Mark","A2");
Teacher teacher = new Teacher("Pol","Biology");
        System.out.println(newStudent.getGroupName());
        System.out.println(teacher.getSubjectName());

        newStudent.printInfo();
        teacher.printInfo();


    }
}
