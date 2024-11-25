public interface Readable {
    void open();
    int readPage(int pageNumber);
    void close();
}
