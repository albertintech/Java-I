package CourseInfo;

public class Course {
    // Declare private fields - courseNumber, courseTitle
    private String courseNumber;
    private String courseTitle;

    // Define mutator methods -
    // setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String number) {
        courseNumber = number;
    }

    public void setCourseTitle(String title) {
        courseTitle = title;
    }

    // Define accessor methods -
    // getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    // Define printInfo()
    public void printInfo() {
        System.out.println("Course Information: ");
        System.out.println("   Course Number: " + getCourseNumber());
        System.out.println("   Course Title: " + getCourseTitle());
    }
}
