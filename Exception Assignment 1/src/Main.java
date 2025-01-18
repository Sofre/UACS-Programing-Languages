import java.io.*;

public class Main {
    public static void main(String[] args) {
       InputStreamReader inputStream = new InputStreamReader(System.in);
       BufferedReader bufferedReader = new BufferedReader(InputStreamReader.nullReader());

       try {

           System.out.println("Whats your name?");
           String name = bufferedReader.readLine();

           System.out.println("Whats your year of birth? ");
           int year = Integer.parseInt(bufferedReader.readLine());

           System.out.print("Whats your weight?");
           double weight = Double.parseDouble(bufferedReader.readLine());

           System.out.print("Your name is : " + name);
           System.out.print("Your name is : " + name);
           System.out.print("Your name is : " + name);
       } catch (IOException e){
           System.out.print("FAIL");
       }
       catch (NumberFormatException e) {
           System.out.print("NumberFORMAT FAIL");
       }
       }
    }
