import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    static Student createStudent(String firstName,String lastName, String email){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastname(lastName);
        student.setEmail(email);

        return student;
    }
    static Course createCourse(String courseName, String instructor){
        Course course = new Course();
        course.setCourseName(courseName);
        course.setInstructor(instructor);



        return course;
    }

    static void displayCourseInfo(Course course){
        System.out.println("Course info: ");
        System.out.println(course.getCourseName());
        System.out.println(course.getInstructor());
        System.out.println(course.getStartDate());
        System.out.println(course.getEndDate());

    }
   public void enrollStudentInCourse(Course course,Student student){
        List<Course>courses = new ArrayList<>();
        courses.add(course);
        List<Student>students = new ArrayList<>();
        students.add(student);


    }
    ArrayList<Student>findStudentsInCourse(Course course,String lastName) {
    return new ArrayList<Student>();
    }



    public static void main(String[] args) {

        ArrayList<String>student_names = new ArrayList<>();
        ArrayList<String>coursesstr = new ArrayList<>();


        ArrayList<Student>students = (ArrayList<Student>) student_names.stream().map(s -> createStudent("Dusko","Sofronievski"," dusko.sofronievski@schoo.edu.mk"))
                .collect(Collectors.toList());


        ArrayList<Course>courses = (ArrayList<Course>) coursesstr.stream().map(s -> createCourse("Math","Dejan")).collect(Collectors.toList());

        ArrayList<Course>courses1 = (ArrayList<Course>) coursesstr.stream().map(s -> createCourse("Math","Dejan")).collect(Collectors.toList());

        ArrayList<Course>courses3 = (ArrayList<Course>) coursesstr.stream().map(s -> createCourse("Math","Dejan")).collect(Collectors.toList());


        courses.forEach(Main::displayCourseInfo);



    }


}