package Lab7;

import java.util.ArrayList;
import java.util.List;

public class Lab7 {
    public static void main(String[] args) {
        // Створення студентів
        Student student1 = new Student("John", "Doe", "0", 98.5);
        Student student2 = new Student("Peter", "Smith", "1", 94.2);
        Student student3 = new Student("Maria", "Johnson", "2", 99.8);

        // Створення факультетів та додавання студентів
        List<Student> computerScienceStudents = new ArrayList<>();
        computerScienceStudents.add(student1);
        computerScienceStudents.add(student2);

        List<Student> engineeringStudents = new ArrayList<>();
        engineeringStudents.add(student3);

        Faculty computerScienceFaculty = new Faculty("Computer Science", computerScienceStudents);
        Faculty engineeringFaculty = new Faculty("Engineering", engineeringStudents);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(computerScienceFaculty);
        faculties.add(engineeringFaculty);

        // Створення об'єкта інституту
        Institute institute = new Institute("KPI", faculties);

        // Виклик методів та виведення результатів
        int totalStudents = institute.getTotalStudents();
        System.out.println("Total number of students in the institute: " + totalStudents);

        Faculty largestFaculty = institute.getLargestFaculty();
        if (largestFaculty != null) {
            System.out.println("Faculty with the most students: " + largestFaculty.getName());
        } else {
            System.out.println("The institute has no faculties.");
        }

        List<Student> studentsInRange = institute.getStudentsInScoreRange();
        System.out.println("Students with an average grade in the range of 95 to 100:");
        for (Student student : studentsInRange) {
            System.out.println("\tName: " + student.getFirstName() + ", student ID: " + student.getStudentId());
        }
    }
}