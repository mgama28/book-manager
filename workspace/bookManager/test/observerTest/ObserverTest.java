package observerTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import builder.BookBuilder;
import models.LibraryItem;
import models.Member;

public class ObserverTest {

    private LibraryItem item;
    private Member member;

    @Before
    public void setUp() {
        item = new BookBuilder()
            .setId(1)
            .setTitle("Test Book")
            .setAuthor("Test Author")
            .setGenre("Fiction")
            .setYear(2020)
            .setType("physical")
            .setDuration(0)
            .build();
        member = new Member(1, "John", "Doe", "john@email.com", "2000-06-08");
    }

    @Test
    public void testAddObserver() {
        item.addObserver(member);
        assertEquals(1, item.getObservers().size());
    }

    @Test
    public void testRemoveObserver() {
        item.addObserver(member);
        item.removeObserver(member);
        assertEquals(0, item.getObservers().size());
    }

    @Test
    public void testNotifyOnReturn() {
        item.addObserver(member);
        item.checkOut();
        item.returnItem();
        // member should have been notified
        assertTrue(item.getState() instanceof states.AvailableState);
    }
}