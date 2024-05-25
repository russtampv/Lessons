package ru.edu;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GreetingImplTest {

    Greeting greet;
    /**
     * Проверка на пустоту
     */
    @Test
    public void lineIsNotNull(){
        greet = new GreetingImpl();
        Assert.assertNotNull(greet.toGreet());
    }
    /**
     * Проверка на содеражние информации о персоне
     */
    @Test
    public void resultContainsLastName(){
        greet = new GreetingImpl();
        Assert.assertTrue(greet.toGreet().contains("Rustam"));
    }

}
