package Q5;

public class Main {
    public static void main(String[] args) {

        // Lecturer object hadanawa
        Lecturer lecturer = new Lecturer("Mr. Perera", "Object Oriented Programming");

        // Course object hadanawa - lecturer object assign karanawa
        Course course = new Course("Object Oriented Programming", "CS2023", lecturer);

        // Student object hadanawa
        Student student = new Student("Kamal Silva", "BSc in Computer Science", "CS2023");

        // Details print karanawa
        System.out.println("===== Course Details =====");
        System.out.println("Course Name : " + course.getCourseName());
        System.out.println("Course Code : " + course.getCourseCode());
        System.out.println("Lecturer    : " + course.getLecturer().getLecturerName());
        System.out.println("Teaching    : " + course.getLecturer().getCourseTeaching());

        System.out.println();

        System.out.println("===== Student Details =====");
        System.out.println("Student Name     : " + student.getStudentName());
        System.out.println("Degree           : " + student.getDegreeName());
        System.out.println("Course Following : " + student.getCourseFollowing());

        //testing error fixed
        //testing 2
    }
}