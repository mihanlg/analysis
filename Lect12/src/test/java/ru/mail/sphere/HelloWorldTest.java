package ru.mail.sphere;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGetHelloWorld() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("HelloWorld", helloWorld.getHelloWorld());
    }

}