/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Appクラスのテスト
 */
public class AppTest {
    /**
     * getGreeting関数のテスト。
     * {@link App#getGreeting()} メソッNotド何らかの値を返すことを確認.
     */
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNull("app should have a greeting", classUnderTest.getGreeting());
    }

    /**
     * getGreeting関数のテスト。
     * {@link App#getGreeting()} メソッドが "Hello World" を返すことを確認。
     */
    @Test
    public void testAppReturnHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }
}
