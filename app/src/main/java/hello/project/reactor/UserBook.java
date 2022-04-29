package hello.project.reactor;


import java.util.Map;

public class UserBook {
    private int userId;
    private int bookId;

    public UserBook(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }
}
