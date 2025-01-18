public class Main {

    public static void main(String[] args){

        Student student = new Student("Mark","216 998 45",5343,24);
        String file = "Student.exe";



        StudentFileStream fileStream = new StudentFileStream();

        fileStream.writeTofile(student,file);
        Student student1 =  fileStream.readFromFile(file);
        fileStream.printData(student1);





    }


}
