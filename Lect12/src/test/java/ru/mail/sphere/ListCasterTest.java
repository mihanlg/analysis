package ru.mail.sphere;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListCasterTest {

    @Test
    public void testCast() throws Exception {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Number> nums = ListCaster.<Number, Integer>cast(ints);

        for (int i = 0; i < ints.size(); i++) {
            assertEquals(ints.get(i), nums.get(i));
        }
    }
}