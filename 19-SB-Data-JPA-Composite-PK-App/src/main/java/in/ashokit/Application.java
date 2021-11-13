package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.entity.BookPK;
import in.ashokit.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		BookRepository bookRepository = context.getBean(BookRepository.class);

		/*Book b = new Book();
		b.setBid(101);
		b.setIsbn("ISBN001");
		b.setPrice(45000.00);

		bookRepository.save(b);

		System.out.println("Record Saved...");*/
		
		BookPK pk = new BookPK();
		pk.setBid(101);
		pk.setIsbn("ISBN001");
		
		Optional<Book> findById = bookRepository.findById(pk);
		System.out.println(findById.get());
	}
}
