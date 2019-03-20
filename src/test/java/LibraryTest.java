import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;

    @Before
    public void setup(){
        library = new Library("CandleKeep Library", 2);
        book = new Book("Spells N Stuff", "The Red Wizard", "SpellCasting");

    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBooks() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }


}
