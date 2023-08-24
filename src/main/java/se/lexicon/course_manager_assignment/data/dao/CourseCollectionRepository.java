package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;
import se.lexicon.course_manager_assignment.model.Course;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class CourseCollectionRepository implements CourseDao{

    private Collection<Course> courses;

    public CourseCollectionRepository(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        Course course = new Course(CourseSequencer.nextCourseId(), startDate, courseName, weekDuration);
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        return null;//todo implement this
    }

    @Override
    public Collection<Course> findByNameContains(String name) {
        return null;//todo implement this
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        return null;//todo implement this
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        return null;//todo implement this
    }

    @Override
    public Collection<Course> findAll() {
        return null;//todo implement this
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {
        return null;//todo implement this
    }

    @Override
    public boolean removeCourse(Course course) {
        return false;//todo implement this
    }

    @Override
    public void clear() {
        this.courses = new HashSet<>();//todo implement this
    }
}
