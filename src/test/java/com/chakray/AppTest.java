package com.chakray;

import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // App app = new App();

    @Test
    public void testApp() {
        String[] array = { "+", "1", "2", "3" };
        App.main(array);
        Assert.assertTrue(true);
    }
}
