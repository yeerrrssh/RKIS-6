package ru.fridge.fourth.security;

import java.util.Collection;
import java.util.Collections;

import ru.fridge.fourth.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Реализация интерфейса UserDetails для пользователя системы
 */
public class ShopUserDetails implements UserDetails {
    /**
     * Объект пользователя системы
     */
    private final User user;

    /**
     * Конструктор для ShopUserDetails.
     * @param shopUser Пользователь магазина.
     */
    public ShopUserDetails(User shopUser) {
        this.user = shopUser;
    }

    /**
     * Получает статусы пользователей
     * @return Набор статусов пользователя
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(user.getStatus()));
    }

    /**
     * Получает пароль пользователя
     * @return Пароль
     */
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    /**
     * Получает имя пользователя
     * @return Имя пользователя
     */
    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * Получает объект пользователя системы
     * @return Объект пользователя системы
     */
    public User getUser() {
        return user;
    }
}