public class Book {
    private final String bookName;
    private final Author author;
    int publishingYear;

    public Book (String bookName, Author author, int publishingYear){
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;

    }
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int new_year) {
        this.publishingYear = new_year;
    }


}

