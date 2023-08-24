package se.lexicon.course_manager_assignment.data.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest(classes = {StudentCollectionRepository.class})
public class StudentCollectionRepositoryTest {

    @Autowired
    private StudentDao testObject;

    @Test
    @DisplayName("Test context successfully setup")
    void context_loads() {
        assertFalse(testObject == null);
    }

    //Write your tests here


    @AfterEach
    void tearDown() {
        testObject.clear();
        StudentSequencer.setStudentSequencer(0);
    }

    @Test
    public void createNewStudent() {
        Student student = new Student(StudentSequencer.nextStudentId(), "Mikael Engvall", "mik@gmail.com", "Vallis 22");
        Student student2 = new Student(StudentSequencer.nextStudentId(), "Anders Engvall", "mik@gmail.com", "Vallis 22");
        
        Course course = new Course();
        course.enrollStudent(student);
        course.enrollStudent(student2);
        
        StudentCollectionRepository studentCollectionRepository = new StudentCollectionRepository(course.getStudents());
//        studentCollectionRepository.createStudent(student.getName(), student.getEmail(), student.getAddress());
//        
//        course.enrollStudent(student);
//        course.enrollStudent(student2);
//        System.out.println(course.toString());
        System.out.println(studentCollectionRepository.toString());

    }
}
