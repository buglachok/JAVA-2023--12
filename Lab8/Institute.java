package Lab8;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Institute {
    private String name;
    private Set<Faculty> faculties;
    private Map<Student, Double> studentGrades; // Додано Map для відстеження середніх балів студентів

    public Institute(String name, Set<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
        this.studentGrades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Set<Faculty> faculties) {
        this.faculties = faculties;
    }

    // Метод для знаходження загальної кількості студентів в інституті
    public int getTotalStudents() {
        int totalStudents = 0;
        for (Faculty faculty : faculties) {
            totalStudents += faculty.getStudents().size();
        }
        return totalStudents;
    }

    // Метод для знаходження факультету з найбільшою кількістю студентів
    public Faculty getLargestFaculty() {
        Faculty largestFaculty = null;
        int maxStudents = 0;

        for (Faculty faculty : faculties) {
            int facultySize = faculty.getStudents().size();
            if (facultySize > maxStudents) {
                maxStudents = facultySize;
                largestFaculty = faculty;
            }
        }

        return largestFaculty;
    }

    // Метод для знаходження студентів з середнім балом в діапазоні від 95 до 100
    public Set<Student> getStudentsInScoreRange() {
        Set<Student> studentsInScoreRange = new HashSet<>();

        for (Faculty faculty : faculties) {
            Set<Student> facultyStudents = faculty.getStudents();
            for (Student student : facultyStudents) {
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    studentsInScoreRange.add(student);
                }
            }
        }

        return studentsInScoreRange;
    }

    // Доданий метод для додавання середнього балу студента в рейтинг
    public void addStudentGrade(Student student, double grade) {
        studentGrades.put(student, grade);
    }

    // Доданий метод для отримання рейтингу студента за його середнім балом
    public Double getStudentGrade(Student student) {
        return studentGrades.get(student);
    }
    // Доданий метод для отримання всіх оцінок студентів
    public Map<Student, Double> getStudentGradesCopy() {
        return new HashMap<>(studentGrades);
    }
}