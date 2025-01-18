public class Student {

    String name;
    int IndexNo;
    int age;

    public Student(String name, int indexNumber, int age) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(int indexNo) {
        IndexNo = indexNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
