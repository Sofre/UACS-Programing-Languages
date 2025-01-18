import java.util.Random;

public class Demo {
    static Student creatStudent(String name){
        Random random = new Random();
        int indexNumber = random.nextInt(100000)+1;
        int age = random.nextInt(13)+18;
        return new Student(name,indexNumber,age);
    }
    static void printValues(Student s){
        System.out.println("Student name : " + s.getName());
        System.out.println("Student age : " + s.getAge());
        System.out.println("Student index : " + s.getIndexNo());
    }
}
