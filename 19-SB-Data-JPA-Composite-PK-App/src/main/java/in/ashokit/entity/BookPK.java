package in.ashokit.entity;

import java.io.Serializable;

public class BookPK implements Serializable {

	private Integer bid;

	private String isbn;

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
		return "BookPK [bid=" + bid + ", isbn=" + isbn + "]";
	}

}
