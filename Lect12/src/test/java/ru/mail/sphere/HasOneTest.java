package ru.mail.sphere;

import org.junit.Test;

import static org.junit.Assert.*;

public class HasOneTest {

    @Test
    public void testHasOne1() throws Exception {
        assertEquals(false, HasOne.hasOne(42));
        assertTrue(HasOne.hasOne(1205231));
    }

    @Test
    public void testHasOne2() throws Exception {
        assertEquals(true, HasOne.hasOne(1));
        assertFalse(HasOne.hasOne(999934546));
    }
}