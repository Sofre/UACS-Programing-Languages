public class Ebook implements Media_Item,Readable,Downloadble{

    public String title;
    public String creator;
    public double fileSize;
    public int numberofPages;

    public Ebook(String title, String creator, double fileSize, int numberofPages) {
        this.title = title;
        this.creator = creator;
        this.fileSize = fileSize;
        this.numberofPages = numberofPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setNumberofPages(int numberofPages) {
        this.numberofPages = numberofPages;
    }

    @Override
    public void download() {
        System.out.println("File at size "+fileSize+".. downloading..");
    }

    @Override
    public String getTitle() {
        return title;

    }

    @Override
    public String getCreator() {
        return creator;

    }



    @Override
    public void open() {
        System.out.println("Opening: E-book  : " + title +" by    " + creator);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Pages: "+ numberofPages);


    }

    @Override
    public int readPage(int pageNumber) {
        return pageNumber;

    }

    @Override
    public void close() {
        System.out.println("Closing Ebook..");

    }
}
