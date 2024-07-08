public class Book {
    private String title;
    private String author;
    private String isbn;
    private String collection = "";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getCollection() {
        return this.collection;
    }

    public void addToCollection(String collection) {
        this.collection = collection;
    }

    public static void main(String[] args) {
        Book book = new Book("The GoldFinch", "Donna Tart", "someIsbn");

        System.out.printf("The book titled %s by %s has an isbn of %s\n", book.getTitle(), book.getAuthor(), book.getIsbn());
    
        book.addToCollection("classic american");
        System.out.printf("The book is a member of the %s collection\n", book.getCollection());
    }
}
