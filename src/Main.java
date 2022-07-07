public class Main {
    public static void main(String[] args) {

        Author author1 = new Author ("Leo", "Tolstoy");
        Author author2 = new Author ("John", "Smith");

        Book book1 = new Book("War and peace", author1,2022);

        System.out.println("Name of the book is " + book1.getBookName() + ", author's name is " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + ", " + "publishing year is " + book1.getPublishingYear());
        book1.setPublishingYear(2000);

        System.out.println("Name of the book is " + book1.getBookName() + ", author's name is " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + ", " + "publishing year is " + book1.getPublishingYear());




    }
}