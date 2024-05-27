package ru.sberbank.jd.lesson02;

/**
 * Класс вычисления НОД
 */
public interface NOD {
    /**
     * Метод поиска наибольшего общего делителя
     * @param firstNumber   первый аргумент, принимает целое число
     * @param secondNumber  второе аргумент, принимает целое число
     * @return целое число типа int
     */
    int calculate(int firstNumber, int secondNumber);
}
