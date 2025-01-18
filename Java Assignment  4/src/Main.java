import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input bank details: ");
        String input = sc.nextLine();
        System.out.println("Input amount: ");
        int input_amount = sc.nextInt();
        ACCOUNT myAccount = new ACCOUNT(input,input_amount);



        while(true){

            System.out.println("Bank");
            System.out.println("State");
            System.out.println("Add");
            System.out.println("Withdraw");
            System.out.println("Clear account");
            System.out.println("Exit");

            System.out.println("    ");
            String new_input = sc.nextLine();

            if(new_input.equalsIgnoreCase("Bank")){
                System.out.println("Bank name : "+ myAccount.getBank());
                continue;

            }
            if(new_input.equalsIgnoreCase("State")){
                System.out.println("State : "+ myAccount.getAmount());
                continue;
            }
            if (new_input.equalsIgnoreCase("Withdraw")){
                System.out.println("Input value ");
                int value = sc.nextInt();
                System.out.println(myAccount.withdraw(value));
                myAccount.setAmount(myAccount.withdraw(value));
                continue;

            }
            if (new_input.equalsIgnoreCase("Add")){
                System.out.println("Input value ");
                int value = sc.nextInt();
                System.out.println(myAccount.add(value));
                myAccount.setAmount(myAccount.add(value));
                continue;

            }
            if (new_input.equalsIgnoreCase("Clear account")){
               int del = myAccount.getAmount();
               myAccount.withdraw(del);
               System.out.println("Account cleared! ");
               myAccount.setAmount(myAccount.withdraw(del));
               continue;
            }
            if (new_input.equalsIgnoreCase("Exit")){
                break;
            }



        }
    }
}