package ru.mail.sphere;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CommonTwoTest {

    private CommonTwo commonTwo;

    @Before
    public void setUp() throws Exception {
        commonTwo = new CommonTwo();
    }

    @Test
    public void testCommonTwo() throws Exception {
        assertNotNull(commonTwo);

        Collection<String> alphabet = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        assertEquals(alphabet.size(), commonTwo.commonTwo(alphabet, alphabet));

        List<String> alphabetList = new LinkedList<>(alphabet);
        alphabetList.remove("alpha");
        assertEquals(alphabet.size() - 1, commonTwo.commonTwo(alphabet, alphabetList));

        alphabet.remove("echo");
        assertEquals(alphabet.size() - 1, commonTwo.commonTwo(alphabet, alphabetList));
    }

    @Test
    public void testCommonTwoNulls() throws Exception {
        assertEquals(0, commonTwo.commonTwo(null, null));
        assertEquals(0, commonTwo.commonTwo(null, Arrays.asList("singleWordInList")));
        assertEquals(0, commonTwo.commonTwo(Arrays.asList("singleWordInList"), null));
    }
}