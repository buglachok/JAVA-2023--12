package Lab7;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
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
    public List<Student> getStudentsInScoreRange() {
        List<Student> studentsInScoreRange = new ArrayList<>();

        for (Faculty faculty : faculties) {
            List<Student> facultyStudents = faculty.getStudents();
            for (Student student : facultyStudents) {
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    studentsInScoreRange.add(student);
                }
            }
        }

        return studentsInScoreRange;
    }
}