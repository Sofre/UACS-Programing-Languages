import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Whats your name: ");
            String name = sc.nextLine();
            System.out.println("Which year were you born : ");
            int year_of_birth = sc.nextInt();
            System.out.println("How tall <meters> are u ? :");
            int height = sc.nextInt();
            System.out.println("What is your weight <kilograms>?:  ");
            int weight = sc.nextInt();


            System.out.println("Your name is : " + name);
            System.out.println("This year you will turn  : " + (2025 - year_of_birth));
            System.out.println("Your body-mass index is : " + ((weight / height) ^ 2));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }

    }
}