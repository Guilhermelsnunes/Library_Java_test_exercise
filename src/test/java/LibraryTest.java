import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The War Of The Ring", "J R R Tolkien", "High fantasy");
        book2 = new Book("coding For dummies", "Abraham", "Educational");
        book3 = new Book("Cracking the Code", "Laakmann McDowel", "Educational");
        book4 = new Book("ABCD", "Guilherme", "Fiction");
    }

    @Test
    public void libraryStartEmpty(){
        assertEquals(0, library.booksCount());
    }

    @Test
    public void canAddBooksToStock(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.booksCount());
    }

    @Test
    public void cannotAddBookStockIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.booksCount());
    }
}
