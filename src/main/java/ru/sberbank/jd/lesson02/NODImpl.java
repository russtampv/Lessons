package ru.sberbank.jd.lesson02;
/**
 * Класс вычисления НОД
 */
public class NODImpl implements NOD{
    /**
     * Метод поиска наибольшего общего делителя
     * @param firstNumber   первый аргумент, принимает целое число
     * @param secondNumber  второе аргумент, принимает целое число
     * @return целое число типа int
     */
    @Override
    public int calculate(int firstNumber, int secondNumber) {
        int absFirstNum = Math.abs(firstNumber);
        int absSecNum = Math.abs(secondNumber);
        while(absSecNum!=0){
            int temp = absFirstNum % absSecNum;
            absFirstNum = absSecNum;
            absSecNum = temp;
        }
        return absFirstNum;
    }
}
