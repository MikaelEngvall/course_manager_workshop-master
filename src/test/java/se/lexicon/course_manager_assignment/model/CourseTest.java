package se.lexicon.course_manager_assignment.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    @DisplayName("Checks if the enrollment method populates the Course set")
    public void checkingEnrollmentMethod() {
        Student mikael = new Student("Mikael Engvall", "mikael@engvall.org", "Vallgatan 22");
        Student anders = new Student("Anders Loren", "anders@engvall.org", "Vallgatan 22");

//        StudentCollectionRepository studentCollectionRepository = new StudentCollectionRepository();

//        Course course1 = new Course(LocalDate.of(2023, 8,25), "Programming in Java", 12,students);
//        Course course2 = new Course(LocalDate.of(2023, 8,25), "Programming in Python", 12,students);

//        Assertions.assertEquals(course1.getId()+1, course2.getId());
    }

//    @Test
//    @DisplayName("Student toString() is equal to hardcoded String")
//    public void compareStudentToStringWithHardcodedString() {
//        Student course = new Student();
//        Assertions.assertEquals(course.toString(), );
}