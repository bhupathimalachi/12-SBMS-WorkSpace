package in.ashokit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	public Book findByBookId(Integer bookId);
}