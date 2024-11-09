class PrintedBook extends Book {
    int pagecount;
    public PrintedBook(String title, String author,int pagecount) {
        super(title, author);
        this.pagecount = pagecount;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + String.format(",Pages: "+"   "+pagecount+"  ");
    }
}
