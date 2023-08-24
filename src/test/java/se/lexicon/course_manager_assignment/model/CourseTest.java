package se.lexicon.course_manager_assignment.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class CourseTest {

    @Test
    @DisplayName("Checks if the enrollment method populates the Course set")
    public void checkingEnrollmentMethod() {
        Student mikael = new Student("Mikael Engvall", "mikael@engvall.org", "Vallgatan 22");
        Student anders = new Student("Anders Loren", "anders@engvall.org", "Vallgatan 22");

        Course course1 = new Course("Java for dummies", LocalDate.of(2023,8,25), 12);
        course1.enrollStudent(mikael);
        course1.enrollStudent(anders);
        System.out.println(course1.toString());
        course1.unenrollStudent(mikael) ;
        System.out.println(course1.toString());
    }
}