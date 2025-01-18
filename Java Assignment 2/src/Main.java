import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Input number of rows: ");
            int row = sc.nextInt();
            System.out.println("Input number of columns : ");
            int columns = sc.nextInt();
            int[][] matrix = new int[row][columns];

            for(int i = 0 ; i<row;i++){
                for(int j = 0;j<columns;j++){

                    System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();

                }
            }

            int sum = 0;
            for(int i = 0 ; i<row;i++){
                for(int j = 0;j<columns;j++){

                    sum+=matrix[i][j];

                }
            }
            System.out.println(sum);
            int down_part = row + columns;
            System.out.print(sum-down_part);

        } catch (Exception e){
            System.out.println("Invalid input"+e.getMessage());
        }
    }
}