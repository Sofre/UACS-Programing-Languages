public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java Programming","Alice Smith");
        books[1] = new Ebook("Advanced Java","Bob Johnson",2.5);
        books[2] = new PrintedBook("Data Structures","Charlie Lee",350);
        books[3] = new Ebook("Algorithms","Diana Prince",3.0);
        books[4] = new PrintedBook("Operating Systems","Ethan Clark",500);

        for(Book b : books){
        b.displayInfo();
        }


    }
}