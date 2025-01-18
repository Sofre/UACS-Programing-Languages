public class Student {
    public String name;
    public String phoneNum;
    int indexNum;
    transient int recordNum;



    public Student(String name, String phoneNum, int indexNum, int recordNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.indexNum = indexNum;
        this.recordNum = recordNum;
    }
}
