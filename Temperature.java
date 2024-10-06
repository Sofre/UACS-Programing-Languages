import java.util.Scanner;

public class Temperature { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in Celsius :  ");
    double celsius = sc.nextDouble();
    switch ((int)celsius){
        case (int) 30.00: System.out.println("The weather is hot ..");
        break;
        case (int) 20.00: System.out.println("The weather is humidity ..");
        break;
        case (int) 10.00: System.out.println("The weather is cold ..");
        break;
        case 0: System.out.println("The weather is freezing cold ..");
        break;
    }
    if (!(0 < celsius)) {
       System.out.println("The weather is freezing cold..");

    }


}
}
