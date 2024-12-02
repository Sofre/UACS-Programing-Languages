import java.io.Serializable;

public class Student implements Serializable {
    public Student(){}

    public Student(String name, int recordnumber, int integer) {
        this.name = name;
        this.recordnumber = recordnumber;
        this.integer = integer;
    }

    String name;
    transient int recordnumber;
    public int integer;

}
