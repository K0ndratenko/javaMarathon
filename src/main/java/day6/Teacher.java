package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name,String lesson){
        this.name=name;
        this.lesson=lesson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public void evaluate(Student someStudent){
        Random randomMark = new Random();
//        randomMark.nextInt(2,5);  Не понимаю почему я не могу использовать этот медот ??
        String stringRating = null;
        int result = randomMark.nextInt(5+1-2)+2;
        switch (result){
            case 2 : stringRating = "неудовлетворительно";
            break;
            case 3 : stringRating = "удовлетворительно";
                break;
            case 4 : stringRating = "хорошо";
                break;
            default:  stringRating = "отлично";
        }
        System.out.println("Преподаватель "+ name + " оценил студента с именем " + someStudent.getName() + " по предмету "
                + lesson + " на оценку " + stringRating);

    }
}
