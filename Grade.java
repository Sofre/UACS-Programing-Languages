import java.util.Scanner;

public class Grade {public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter grade : ");
    String grade = sc.nextLine();
    switch (grade)
    {
        case "A": System.out.println("The student passed.. He gets an A"); break;
        case "A-":System.out.println("The student passed.. He gets an A-"); break;
        case "B": System.out.println("The student passed.. He gets a B"); break;
        case "B-":System.out.println("The student passed.. He gets a B-"); break;
        case "C": System.out.println("The student passed.. He gets a C"); break;
        case "C-":System.out.println("The student passed.. He gets a C-"); break;
        case "D": System.out.println("The student passed.. He gets a D"); break;
        case "D-":System.out.println("The student passed.. He gets a D-"); break;
        case "F": System.out.println("The student has failed.. He gets a F"); break;
    }
}
}
