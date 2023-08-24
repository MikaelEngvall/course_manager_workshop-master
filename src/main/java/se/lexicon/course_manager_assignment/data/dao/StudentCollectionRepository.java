package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.Collection;
import java.util.HashSet;

public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;

    public StudentCollectionRepository(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentCollectionRepository{" +
                "students=" + students +
                '}';
    }

    @Override
    public Student createStudent(String name, String email, String address) {
        Student student = new Student(StudentSequencer.nextStudentId(), name, email, address);
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmailIgnoreCase(String email) {
        return null;//todo implement this
    }

    @Override
    public Collection<Student> findByNameContains(String name) {
        return null;//todo implement this
    }

    @Override
    public Student findById(int id) {
        return null;//todo implement this
    }

    @Override
    public Collection<Student> findAll() {
        return null;//todo implement this
    }

    @Override
    public boolean removeStudent(Student student) {
        return false;//todo implement this
    }

    @Override
    public void clear() {
        this.students = new HashSet<>();//todo implement this
    }
}
