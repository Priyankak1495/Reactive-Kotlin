package hello.project.reactor;

import reactor.core.publisher.Flux;

import java.util.List;

public class BookService {
    public Flux<List<Book>> viewPurchased(int userId) {
        return BookFactory.getAllUserBook().map(book -> book.get(userId));
//
//        Flux<UserBook> bookWithUser = BookFactory.getAllUserBook().filter(matchUserId(userId));
//
////        List<Integer> books = bookWithUser.map(userBook -> userBook.getBookId()).collect(Collectors.toList()).block();
//        bookWithUser.map(userBook -> userBook.getBookId()).flatMap(book ->{
//            return BookFactory.getAllBooks().filter(book1 -> book1.)
//                }
//        )
//
//        return BookFactory.getAllBooks().filter(book -> books.contains(book.getBookId()));
    }

}
