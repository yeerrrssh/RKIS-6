package ru.fridge.fourth.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * Класс для работы с таблицей  пользователей
 */
@Entity
@Table(name = "users")
@Data
public class User {
    /**
     * Идентификатор пользователя
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Имя пользователя
     */
    @Column(name = "username")
    @NotEmpty
    @Size(min = 2, max = 100)
    private String username;

    /**
     * Пароль
     */
    @Column(name = "password")
    private String password;

    /**
     * Статус пользователя
     */
    @Column(name = "status")
    private String status;

    /**
     * Получает идентификатор пользователя
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор пользователя
     * @param id ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает имя пользователя
     * @return Имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает имя пользователя
     * @param username Имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Получает пароль
     * @return Пароль пользователя
     */
    public String getPassword() {
        return password;
    }

    /**
     * Устанавливает пароль
     * @param password Пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Получает статус пользователя
     * @return Статус пользователя в системе
     */
    public String getStatus() {
        return status;
    }

    /**
     * Устанавливает статус пользователя
     * @param status Статус пользователя в системе
     */
    public void setStatus(String status) {
        this.status = status;
    }
}