package bookBuilderTest;

import org.junit.Test;
import static org.junit.Assert.*;
import builder.BookBuilder;
import models.LibraryItem;
import models.EBook;
import models.AudioBook;
import models.PhysicalBook;

public class BookBuilderTest {

    @Test
    public void testBuildEBook() {
        LibraryItem item = new BookBuilder()
            .setId(1)
            .setTitle("Test EBook")
            .setAuthor("Test Author")
            .setGenre("Fiction")
            .setYear(2020)
            .setType("ebook")
            .setDuration(300)
            .build();
        assertTrue(item instanceof EBook);
    }

    @Test
    public void testBuildAudioBook() {
        LibraryItem item = new BookBuilder()
            .setId(2)
            .setTitle("Test AudioBook")
            .setAuthor("Test Author")
            .setGenre("Fiction")
            .setYear(2020)
            .setType("audiobook")
            .setDuration(500)
            .build();
        assertTrue(item instanceof AudioBook);
    }

    @Test
    public void testBuildPhysicalBook() {
        LibraryItem item = new BookBuilder()
            .setId(3)
            .setTitle("Test Physical")
            .setAuthor("Test Author")
            .setGenre("Fiction")
            .setYear(2020)
            .setType("physical")
            .setDuration(0)
            .build();
        assertTrue(item instanceof PhysicalBook);
    }

    @Test
    public void testBookTitle() {
        LibraryItem item = new BookBuilder()
            .setId(4)
            .setTitle("The Nightingale")
            .setAuthor("Kristin Hannah")
            .setGenre("Fiction")
            .setYear(2015)
            .setType("physical")
            .setDuration(0)
            .build();
        assertEquals("The Nightingale", item.getTitle());
    }
}