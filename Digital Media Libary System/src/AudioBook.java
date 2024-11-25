public class AudioBook implements Media_Item,Playble,Downloadble {

    public String title;
    public String creator;
    public double filesSize;
    public int duration;

    public AudioBook(String title, String creator, double filesSize, int duration) {
        this.title = title;
        this.creator = creator;
        this.filesSize = filesSize;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setFilesSize(double filesSize) {
        this.filesSize = filesSize;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void download() {
        System.out.println("File at size "+filesSize+".. downloading..");
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
        System.out.println("Playing Audiobook : "+ title + "by  "+ creator);
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
}



