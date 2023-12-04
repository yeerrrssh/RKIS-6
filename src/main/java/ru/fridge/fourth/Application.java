package ru.fridge.fourth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Класс для запуска программы
 */
@SpringBootApplication
public class Application {
    /**
     * Точка входа
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}