package com.example.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HogeTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void constractorTest() {
        var h0 = new Hoge();
        System.out.println(h0);
        var h1 = new Hoge(1001, "Alice");
        System.out.println(h1);

        assertTrue(true);
    }
}
