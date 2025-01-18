

import java.time.LocalDate;


public class Course {

    String courseName;
    String instructor;

    int year,month,day;

    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.of(year,month,day);

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate() {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
