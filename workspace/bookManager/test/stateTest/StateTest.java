package stateTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import builder.BookBuilder;
import models.LibraryItem;
import states.AvailableState;
import states.CheckedOutState;
import states.ReservedState;

public class StateTest {

    private LibraryItem item;

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
    }

    @Test
    public void testInitialStateIsAvailable() {
        assertTrue(item.getState() instanceof AvailableState);
    }

    @Test
    public void testCheckOutChangesState() {
        item.checkOut();
        assertTrue(item.getState() instanceof CheckedOutState);
    }

    @Test
    public void testReturnChangesStateBack() {
        item.checkOut();
        item.returnItem();
        assertTrue(item.getState() instanceof AvailableState);
    }

    @Test
    public void testReserveChangesState() {
        item.reserve();
        assertTrue(item.getState() instanceof ReservedState);
    }
}
