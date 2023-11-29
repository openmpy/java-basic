package class1;

public class Student {
    String name;
    int age;
    int score;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 20;
        student1.score = 100;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 25;
        student2.score = 90;

        Student[] students = {student1, student2};
        for (Student student : students) {
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.score);
        }
    }
}
