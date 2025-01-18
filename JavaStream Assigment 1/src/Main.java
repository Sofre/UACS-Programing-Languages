import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    private static Function<? super String,?> Student;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Ana");
        names.add("Peter");
        names.add("Stan");
        names.add("Lee");

        List<Student> students = names.stream()
                .map(Demo::creatStudent)  // Map each name to a Student object
                .collect(Collectors.toList());// Collect the results into a List



        List<Student> students1 = students.stream()
                .filter(student -> student.getName().startsWith("P"))
                        .collect(Collectors.toList());


        boolean isSmallerThan25 = students.stream().allMatch(student -> student.getAge() < 25);
        boolean isBiggerThan25 = students.stream().allMatch(student -> student.getAge() > 25);
        boolean isEquallyTo25 = students.stream().allMatch(student -> student.getAge() == 25);




        System.out.println("Print all students: ");
        // Print the list of students
        students.forEach(Demo::printValues);

        System.out.println();

        System.out.println("Students with letter P");
        students1.forEach(Demo::printValues);

        System.out.println();

        System.out.println("Are there students smaller than 25? "+isSmallerThan25);




    }


}