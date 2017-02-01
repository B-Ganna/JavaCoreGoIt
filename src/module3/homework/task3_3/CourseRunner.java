package module3.homework.task3_3;

import java.util.Date;

public class CourseRunner {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Course course = new Course(currentDate, "GoJava4");
        Course course2 = new Course(500, "GoJavaOnline", "Belonovich");
        Course course3 = new Course(200, "GoJavaEnglish", "Automatically");
        Course course4 = new Course(100, "SoftSkills", "Teachers");

        Student student = new Student("Anna", "Bredun", 5);
        Student student1 = new Student("Bredun", new Course[]{course, course2, course3});

        CollegeStudent collegeStudent = new CollegeStudent("Maks", "MAksimov", 5);
        CollegeStudent collegeStudent1 = new CollegeStudent("Maksimov", new Course[]{course, course2, course4});
        CollegeStudent collegeStudent2 = new CollegeStudent("Maks", "Maksimov", 5, "Harvard", 12, 1237629);

        SpecialStudent specialStudent = new SpecialStudent("Mister", "X", 5);
        SpecialStudent specialStudent1 = new SpecialStudent("X", new Course[]{course});
        SpecialStudent specialStudent2 = new SpecialStudent("Mister", "X", 5, "Universe", 0, 2364971, 777, "yankee@go.home");

    }
}
