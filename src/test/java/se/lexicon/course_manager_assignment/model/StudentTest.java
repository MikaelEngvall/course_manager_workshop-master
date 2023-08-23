package se.lexicon.course_manager_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    @DisplayName("Make sure that new students get right Id")
    public void validateStudentIdSequencer() {
        Student student1 = new Student("Mikael Engvall", "mikael@engvall.org", "Vallgatan 22");
        Student student2 = new Student("Anahita Rad", "anahita@rad.org", "Lexicongatan 23");

        Assertions.assertEquals(student1.getId()+1, student2.getId());
    }

    @Test
    @DisplayName("Student toString() is equal to hardcoded String")
    public void compareStudentToStringWithHardcodedString() {
        Student student = new Student("Mikael Engvall", "mikael@engvall.org", "Vallgatan 22");
        Assertions.assertEquals(student.toString(), "Student{id=1, name='Mikael Engvall', email='mikael@engvall.org', address='Vallgatan 22'}");
    }
}



