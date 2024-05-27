package ru.sberbank.jd.lesson02;

import org.junit.*;

/**
 * Класс тестирования класса NOD
 */
public class NODTests {
    /**
     * Тест проверяющий результат
     */
    @Test
    public void getNodTest(){
        NOD nod = new NODImpl();
        Assert.assertEquals(50,nod.calculate(100,50));
    }
    /**
     * Проверка отработки при отрицательных числах
     */
    @Test
    public void getNodByNegativeNumbers(){
        NOD nod = new NODImpl();
        Assert.assertEquals(1,nod.calculate(-17,-7));
    }
    /**
     * Проверка, если первое число меньше второго
     */
    @Test
    public void getNodBySecondGreater(){
        NOD nod = new NODImpl();
        Assert.assertEquals(5,nod.calculate(45,200));
    }
}
