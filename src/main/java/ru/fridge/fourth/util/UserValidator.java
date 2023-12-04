package ru.fridge.fourth.util;

import ru.fridge.fourth.models.User;
import ru.fridge.fourth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Валидатор для проверки уникальности имени пользователя
 */
@Component
public class UserValidator implements Validator {
    /**
     * Сервис для работы с пользователями
     */
    private final UserService shopUserService;

    /**
     * Конструктор для UserValidator
     * @param shopUserService Сервис пользователей магазина
     */
    @Autowired
    public UserValidator(UserService shopUserService) {
        this.shopUserService = shopUserService;
    }

    /**
     * Проверяет поддержку данного объекта
     * @param clazz Объект неизвестного класса
     * @return      Результат сравнения
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    /**
     * Проверяет имя пользователя на уникальность
     * @param target Объект для валидации
     * @param errors Объект для работы с ошибками
     */
    @Override
    public void validate(Object target, Errors errors) {
        User shopUser = (User) target;
        if (shopUserService.hasUsername(shopUser.getUsername())) {
            errors.rejectValue("username", "", "This username was already taken!");
        }

    }
}