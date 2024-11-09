 class Ebook extends Book {
    double fileSize;

     public Ebook(String title, String author,double fileSize) {
         super(title, author);
         this.fileSize = fileSize;
     }


     @Override
     public String getBookInfo() {
         return super.getBookInfo() + String.format(",Filesize: "+fileSize+"MB");

     }
 }
