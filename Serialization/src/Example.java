import java.io.Serializable;

public class Example implements Serializable {
    transient int transietInt;
    static  int staticInt;
    String name;
    int age;

    public Example(int transietInt, String name, int age) {
        this.transietInt = transietInt;
        this.name = name;
        this.age = age;
    }
}
