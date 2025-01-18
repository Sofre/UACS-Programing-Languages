import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Enter number of rows:");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of colloms: ");
        int colloms = scanner.nextInt();

        int[][] matrix = new int[rows][colloms];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colloms; j++) {

                matrix[i][j] = scanner.nextInt();
                sum = sum + matrix[i][j];
            }
        }
        System.out.print("Sum : "+sum);
        System.out.print("Avg: "+ (sum/rows));

    } catch (Exception e)
                {
                    System.out.print("WRONG INPUT/OUTPUT ... Closing with "+e.getMessage()+"  value");

                }


            }
        }





