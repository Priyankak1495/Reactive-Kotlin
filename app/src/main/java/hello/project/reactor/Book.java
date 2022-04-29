package hello.project.reactor;


public class Book {
    private Integer bookId;
    private String bookName;
    private Double price;

    public Book(Integer bookId, String bookName, Double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }
}
