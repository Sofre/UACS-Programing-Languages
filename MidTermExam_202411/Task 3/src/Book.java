public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getBookInfo() {
        return  String.format("Book: "+"  "+title+"  "+ "by" + "  "+author+"  ");
    }
    public void displayInfo(){
        System.out.println(getBookInfo());
    }
}
