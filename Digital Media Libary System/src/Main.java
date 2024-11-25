import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Ebook ebook = new Ebook("Lord of the Rings: Return of the King","J.R. Token",500.25,380);
        AudioBook audioBook = new AudioBook("All Quiet at the Western Front"," Erich Maria Remarque",425.55,6);
        Movie movie = new Movie("Bad Boys","Michal Bay",8.50,2);
        InteractiveMagazine maga = new InteractiveMagazine("Vogue","Arthur Baldwin Turnure",250.55,35,30);


        System.out.println("Ebook: ");
        ebook.getTitle();
        ebook.getCreator();
        System.out.println();
        ebook.download();
        TimeUnit.SECONDS.sleep(2);
        ebook.open();
        System.out.println();
        ebook.close();



        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Audiobook: ");
        audioBook.getTitle();
        audioBook.getCreator();
        System.out.println();
       audioBook.download();
        TimeUnit.SECONDS.sleep(2);
        audioBook.play();
        System.out.println();
        while (true) {
            audioBook.pause();
            String input = sc.nextLine();  // Read user input

            if (input.equals("||")) {  // Check if the input is a space
                break;  // Exit the loop
            }
        }
        movie.stop();



        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Movie: ");
        movie.getTitle();
        movie.getCreator();
        System.out.println();
        movie.download();
        TimeUnit.SECONDS.sleep(2);
        movie.play();
        System.out.println();
        while (true) {
            movie.pause();
            String input = sc.nextLine();

            if (input.equals("||")) {
                break;
            }
        }
        movie.stop();


        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("InteractiveMagazine: ");

        while(true) {
            String INPUT = sc.nextLine();
            if (INPUT.equals("Normal")) {
                maga.getTitle();
                maga.getCreator();
                System.out.println();
                maga.download();
                TimeUnit.SECONDS.sleep(2);
                maga.open();
                System.out.println();
                maga.close();
                break;

            }
            else if (INPUT.equals("X")){

               maga.getTitle();
               maga.getCreator();
                System.out.println();
               maga.download();
                TimeUnit.SECONDS.sleep(2);
                maga.play();
                System.out.println();
                while (true) {
                    maga.pause();
                    String input = sc.nextLine();  // Read user input

                    if (input.equals("||")) {  // Check if the input is a space
                        break;  // Exit the loop
                    }
                }
                maga.stop();
                break;

            }
            else if(false){
                System.out.println("Error!");
                break;
            }


        }










    }
}