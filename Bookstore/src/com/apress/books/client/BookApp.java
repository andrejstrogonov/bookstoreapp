package com.apress.books.client;
import java.util.List;
import com.apress.books.dao.BookDAO;
import com.apress.books.dao.BookDAOImpl;
import com.apress.books.model.Book;
public class BookApp {
	private static BookDAO bookDao = new BookDAOImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Listing all Books:");
		System.out.println();
		System.err.println("Search book in book title: Groovy:");
		searchBooks("Groovy");
		System.out.println();
		System.err.println("Search book keyword in author`s name : Josh:");
		searchBooks("Josh");
	}
	private static void findAllBooks() {
		List<Book> books = bookDao.findAllBooks();
		for (Book book : books) {
		System.out.println(book);
		}
	}
	private static void searchBooks(String keyWord) {		
	List<Book> books = bookDao.searchBooksByKeyword(keyWord);
	for (Book book : books) 
		{
			System.out.println(book);
		}
	}
}
