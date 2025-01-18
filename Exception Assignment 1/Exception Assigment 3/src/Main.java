import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int weight = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while(true){
            System.out.print("Enter input or /E-N-D/ to finish ");
            try {
                String input = bufferedReader.readLine();
                if(input.equalsIgnoreCase("END")){break;}

                for(int i = 0; i<input.length();i++){
                    weight  = input.charAt(i);
                }
                System.out.print("Returned ASCII code of weight : "+ weight);
            } catch (MYException | IOException e) { System.out.print("FAIL");
                throw new RuntimeException(e);

            }
        }
    }
}