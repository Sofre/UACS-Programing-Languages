import java.io.*;


public class StudentFileStream  {
    public void printData(Student student){
        System.out.print("Student name : " + student.name);
        System.out.print("Student phone number : " + student.phoneNum);
        System.out.print("Student index number : " + student.indexNum);

    }
    public void writeToFile(Student student,String filename){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  void readFromFile(Student student, String filename){
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();

             objectInputStream.close();
             fileInputStream.close();

             printData((Student) object);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
