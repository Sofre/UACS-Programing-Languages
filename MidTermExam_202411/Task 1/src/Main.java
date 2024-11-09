import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String wort = sc.nextLine().toLowerCase();

        String s= wort ;
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);
        }
        if (t.matches(s)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}