package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Welcome information
 */
public class GreetingImpl implements Greeting {
    /**
     * Имя
     */
    @Override
    public String getFirstName() {
        return "Rustam";
    }
    /**
     * Фамилию
     */
    @Override
    public String getLastName() {
        return "P***n";
    }
    /**
     * Возраст
     */
    @Override
    public int getBirthYear() {
        return 30;
    }
    /**
     * Увлечения
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of("Настольный теннис","Плавание","Рисование");
    }
    /**
     * ссылка на репозиторий
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/russtampv/Lessons";
    }
    /**
     * номер телефона
     */
    @Override
    public String getPhone() {
        return "89826679021";
    }
    /**
     * Описание ожиданий от курса
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Навыки использования паттернов проектирования","Правильная работа с инструментами разработки","Написание кода","Узнать особенности языка java");
    }
}
