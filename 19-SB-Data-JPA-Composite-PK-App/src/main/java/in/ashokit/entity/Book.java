package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_DTLS_TBL")
@IdClass(value = BookPK.class)
public class Book implements Serializable {

	@Id
	private Integer bid;

	@Id
	private String isbn;

	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", isbn=" + isbn + ", price=" + price + "]";
	}

}
