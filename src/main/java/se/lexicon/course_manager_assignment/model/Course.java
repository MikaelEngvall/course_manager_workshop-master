package se.lexicon.course_manager_assignment.model;

import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class Course {
    private int id;
    private LocalDate startDate;
    private String courseName;
    private int weekDuration;
    private Collection<Student> students; //All the participants (enrolled students)

    //Methods
    public boolean enrollStudent(Student student) { // This adds a student to the course
        return students.add(student);
    }
    public boolean unenrollStudent(Student student) {
        return students.remove(student);
    }

    //Constructors

    public Course(LocalDate startDate, String courseName, int weekDuration, Collection<Student> students) {
        this.id = CourseSequencer.nextCourseId();
        this.startDate = startDate;
        this.courseName = courseName;
        this.weekDuration = weekDuration;
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id && weekDuration == course.weekDuration && Objects.equals(startDate, course.startDate) && Objects.equals(courseName, course.courseName) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, courseName, weekDuration, students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", courseName='" + courseName + '\'' +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }
    //Getters and Setters

    public int getId() {
        return id;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
