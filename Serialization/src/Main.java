import java.io.*;

public class Main {
    public static void printData(Example e){
        System.out.println("Name: "+ e.name);
        System.out.println("Age: "+ e.age);
        System.out.println("TransietInt : "+ e.transietInt);
        System.out.println("Name: "+ e.name);
    }

    public static void main(String[] args) {
        Example example = new Example(4,"Name",8);
        String fileName = "text.txt";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(example);
            printData(example);

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            example =(Example) objectInputStream.readObject();

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}