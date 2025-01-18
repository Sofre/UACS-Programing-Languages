import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        // Instructions to the user
        System.out.println("Input the text. To finish inputting, input END:");

        do {
            text = sc.nextLine();

            // Break the loop if the user inputs "END" (case insensitive)


            // Convert the text to a character array
            char[] array = text.toCharArray();

            // Get the ASCII byte representation
            byte[] size = text.getBytes();  // No need for "US-ASCII" since it's the default

            int sum = 0;
            for (int x = 0; x < size.length; x++) {
                sum += size[x];  // Summing up byte values
            }

            // Output the result
            System.out.println(text + " has " + array.length + " characters, and its weight is " + sum );

        } while (!text.equals("END"));  // Continue indefinitely until "END" is input

        sc.close();
    }
}
