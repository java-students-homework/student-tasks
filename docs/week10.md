# Неделя 10 — Spring Data JPA

Продолжаем сервис недели 9. Проверка — PR-ревью + живое демо ментору.

1. **Урок 1 — база.** Подними PostgreSQL (пока локально или в Docker),
   подключи `spring.datasource`, замени in-memory репозиторий на
   `JpaRepository`.
2. **Урок 2 — миграции.** Flyway (или Liquibase) с первого дня:
   `V1__init.sql` со схемой. `ddl-auto=validate`, не `update`.
3. **Урок 3 — связи.** Добавь сущность `Customer`:
   заявка `@ManyToOne` → customer, у customer `@OneToMany` заявки.
   Включи `show-sql`, ПОКАЖИ ментору N+1 на списке заявок и почини
   (`join fetch` или `@EntityGraph`).
4. **Урок 4 — запросы.** Производные методы (`findByStatus`,
   `findByCustomerId`), один `@Query`, пагинация `Pageable`
   на `GET /orders?page=0&size=10&sort=id`.
5. **Урок 5 — валидация и ошибки.** `@Valid` на входных DTO
   (`@NotNull`, `@Size`, свои сообщения), `@RestControllerAdvice`:
   единый формат ошибок — 400 со списком полей, 404, 500 без стектрейса.

Сдача: PR + демо: миграции накатываются на пустую базу одной командой,
в логах нет N+1 на списке заявок.
