import java.io.*;

public class StudentFileStream {

    public void printData(Student student){
        System.out.println("Student name : "+student.name);
        System.out.println("Student phone number : "+student.phoneNum);
        System.out.println("Student index Num : "+student.indexNum);
        System.out.println("Student record num : "+student.recordNum);
    }

    public void writeTofile(Student student,String filename){


        try{

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(student);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Student readFromFile(String filename) {

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);


            Student readObject = (Student) in.readObject();
            return readObject;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}