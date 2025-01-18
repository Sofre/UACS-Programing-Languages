public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Mark","075 404 907",223051992,223);
        StudentFileStream studentFileStream = new StudentFileStream();
        studentFileStream.writeToFile(student,"student.txt");
        studentFileStream.readFromFile(student,"student.txt");



    }
}
