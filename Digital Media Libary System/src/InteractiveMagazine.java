public class InteractiveMagazine implements Media_Item,Readable,Playble,Downloadble{

    public String title;
    public String creator;
    public double fileSize;
    public int numberofPages;
    public int duration;

    public InteractiveMagazine(String title, String creator, double fileSize, int numberofPages, int duration) {
        this.title = title;
        this.creator = creator;
        this.fileSize = fileSize;
        this.numberofPages = numberofPages;
        this.duration = duration;
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

    public void setDuration(int duration) {
        this.duration = duration;
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
    public void play() {
        System.out.println("Playing InteractiveMagazine : "+ title + "by  "+ creator);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Duration:  "+ duration);
    }

    @Override
    public void pause() {
        System.out.println("PAUSED");
    }

    @Override
    public void stop() {
        System.out.println("Exiting..");
    }

    @Override
    public void open() {
        System.out.println("Opening: InteractiveMagazine  : " + title +" by    " + creator);
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
        System.out.println("Closing InteractiveMagazine...");
    }
}
