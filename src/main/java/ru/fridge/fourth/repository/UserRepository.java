package ru.fridge.fourth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fridge.fourth.models.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * Репозиторий для работы с пользователями
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Получает пользователя по имени
     * @param username  Имя пользователя
     * @return          Объект пользователя системы
     */
    Optional<User> findByUsername(String username);

}