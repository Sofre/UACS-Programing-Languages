import java.util.Scanner;

public class Name_Len_Counter { public static void main (String[] args ){

    System.out.println("Enter a name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int len = name.length();
    char sc_char;
    System.out.println(name);
    System.out.println(len);
    if(len%2==0)
    {
        sc_char = name.charAt(len/2*1);

    }
    else
    {
        sc_char = name.charAt(len/2);
    }
    System.out.println(sc_char);
}
}
