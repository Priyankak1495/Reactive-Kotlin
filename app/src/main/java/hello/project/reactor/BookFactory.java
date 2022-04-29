package hello.project.reactor;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

public class BookFactory {

    public static Flux<Book> getAllBooks() {
        return Flux.fromIterable(List.of(
                        new Book(1, "JAVA", 1000.00),
                        new Book(2, "SCALA", 1600.00),
                        new Book(3, "GO", 2000.00)
                )
        );
    }

    public static Flux<Map<Integer, List<Book>>> getAllUserBook() {
        return Flux.fromIterable(List.of(
                Map.of(123, List.of(new Book(1, "JAVA", 1000.00))),
                Map.of(456, List.of(new Book(2, "SCALA", 1000.00))),
                Map.of(789, List.of(new Book(3, "GO", 1000.00)))
        ));
    }

}
