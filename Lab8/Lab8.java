package Lab8;

import java.util.HashSet;
import java.util.Set;

public class Lab8 {
        public static void main(String[] args) {
        // Створення студентів
        Student student1 = new Student("John", "Doe", "0", 98.5);
        Student student2 = new Student("Peter", "Smith", "1", 94.2);
        Student student3 = new Student("Maria", "Johnson", "2", 99.8);
        Student student4 = new Student("Mria", "Uranta", "3", 98.8);

        // Створення факультетів та додавання студентів
        Set<Student> computerScienceStudents = new HashSet<>();
        computerScienceStudents.add(student1);
        computerScienceStudents.add(student2);
        computerScienceStudents.add(student4);

        Set<Student> engineeringStudents = new HashSet<>();
        engineeringStudents.add(student3);

        Faculty computerScienceFaculty = new Faculty("Computer Science", computerScienceStudents);
        Faculty engineeringFaculty = new Faculty("Engineering", engineeringStudents);

        Set<Faculty> faculties = new HashSet<>();
        faculties.add(computerScienceFaculty);
        faculties.add(engineeringFaculty);

        // Створення об'єкта інституту
        Institute institute = new Institute("KPI", faculties);

        // Додавання оцінок всім студентам з інституту
        for (Faculty faculty : institute.getFaculties()) {
                for (Student student : faculty.getStudents()) {
                        double studentGrade = student.getAverageGrade();
                        institute.addStudentGrade(student, studentGrade);
                }
        }

        // Виведення оцінок студентів з рейтингу
        System.out.println("Student grades in the institute:");

        for (Student student : institute.getStudentGradesCopy().keySet()) { // Використовуємо HashMap, тому порядок не зберігаэться
            System.out.println("Student ID: " + student.getStudentId() + ", Grade: " + institute.getStudentGrade(student));
        }
    }
}