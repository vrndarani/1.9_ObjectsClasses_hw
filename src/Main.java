public class Main {
    public static void main(String[] args) {

        Author author1 = new Author ("Leo", "Tolstoy");
        System.out.println(author1);
        System.out.println(author1.hashCode());

        System.out.println("------");
        Author author2 = new Author ("Leo", "Tolstoy");
        System.out.println(author2);
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));

        Book book1 = new Book("War and Peace", author1, 2022);

        System.out.println("------");
        System.out.println(book1);
        System.out.println(book1.hashCode());

        Book book2 = new Book("War and Peace", author1, 2022);

        System.out.println("------");
        System.out.println(book2);
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));

    }
}