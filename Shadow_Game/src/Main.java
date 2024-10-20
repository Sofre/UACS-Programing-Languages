
public class Main {
    public static void generateMatrix(char[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (char) ('a' + i);
                matrix[j][i] = (char) ('a' + j);

            }
        }
    }
    public static void printMatrix(char[][] matrix) {
        for (char[] row: matrix) {
            for (char col: row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void countLines(char[][] matrix, char symbol) {
       int countLines = 0;
        for(int i = 0; i < 3; i++) {
            if(matrix[i][0] == symbol && matrix[i][1] == symbol && matrix[i][2] == symbol) {
                countLines++;

            }

        }
        for(int j = 0; j < 3; j++) {
            if(matrix[0][j] == symbol && matrix[1][j] == symbol && matrix[2][j] == symbol) {
                countLines++;
            }
        }
        System.out.println(countLines);
    }
    public static void main(String[] args) {

        char[][] matrix = new char[3][3];
        generateMatrix(matrix);
        printMatrix(matrix);
        countLines(matrix, 'a');

        }
    }
