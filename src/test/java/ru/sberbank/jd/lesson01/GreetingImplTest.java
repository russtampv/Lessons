package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

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
        Assert.assertNotNull(greet.getHobbies());
    }
    /**
     * Проверка на содеражние информации о персоне
     */
    @Test
    public void resultContainsFirstName(){
        greet = new GreetingImpl();
        Assert.assertTrue(greet.getFirstName().contains("Rustam"));
    }
    /**
     * Проверка на корректность номера телефона
     */
    @Test
    public void resultContainsCorrectPhone(){
        greet = new GreetingImpl();
        String regex = "[8|+7]\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Assert.assertTrue(greet.getPhone().matches(regex));
    }

    /**
     * Проверка на корректность номера телефона
     */
    @Test
    public void resultContainsCorrectReposUrl(){
        greet = new GreetingImpl();
        String regex = "https://.+[.com|.ru|.net].+";
        Pattern pattern = Pattern.compile(regex);
        Assert.assertTrue(greet.getRepoUrl().matches(regex));
    }
    /**
     * Проверка на корректность номера телефона
     */
    @Test
    public void resultContainsLastName(){
        greet = new GreetingImpl();
        Assert.assertEquals("P***n",greet.getLastName());
    }

}
